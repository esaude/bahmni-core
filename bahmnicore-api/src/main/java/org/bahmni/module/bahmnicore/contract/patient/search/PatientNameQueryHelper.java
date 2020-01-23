package org.bahmni.module.bahmnicore.contract.patient.search;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.bahmni.module.bahmnicore.model.WildCardParameter;
import org.openmrs.api.context.Context;

import static org.apache.commons.lang.StringUtils.isEmpty;

public class PatientNameQueryHelper {
	private String name;
	public static final String BY_NAME_PARTS = " concat_ws(' ',coalesce(given_name), coalesce(middle_name), coalesce(family_name)) like ";

	public PatientNameQueryHelper(String name){
		this.name = name;
	}

	public String appendToWhereClause(String where){
		WildCardParameter nameParameter = WildCardParameter.create(name);
		String nameSearchCondition = getNameSearchCondition(nameParameter);
		where = isEmpty(nameSearchCondition) ? where : combine(where, "and", enclose(nameSearchCondition));
		where = appendNickNameWhereClause(where);
		return where;
	}

	private String getNameSearchCondition(WildCardParameter wildCardParameter) {
		if (wildCardParameter.isEmpty())
			return "";
		String query_by_name_parts = "";
		for (String part : wildCardParameter.getParts()) {
			if (!"".equals(query_by_name_parts)) {
				query_by_name_parts += " and " + BY_NAME_PARTS + " '" + part + "'";
			} else {
				query_by_name_parts += BY_NAME_PARTS + " '" + part + "'";
			}
		}
		return query_by_name_parts;
	}

    public String appendToJoinClause(String join){
        join += " LEFT OUTER JOIN person_attribute pa_name on pa_name.person_id = p.person_id and pa_name.person_attribute_type_id = (select pat.person_attribute_type_id from " +
                "person_attribute_type pat where pat.name = 'NICK_NAME')  ";
       return join;
    }

    public String appendNickNameWhereClause(String where){
        if(StringUtils.isEmpty(name)){
            return where;
        }
        return combine(where, "or", enclose(" pa_name.value like "+ "'%" + StringEscapeUtils.escapeSql(name) + "%'"));
    }

	private String combine(String query, String operator, String condition) {
		return String.format("%s %s %s", query, operator, condition);
	}

	private String enclose(String value) {
		return String.format("(%s)", value);
	}
}
