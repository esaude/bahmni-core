package org.bahmni.module.bahmnicore.contract.patient;

import org.apache.commons.lang.StringUtils;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;
import java.util.Map;

public class PatientDuplicateSearchParameters {
    private String identifier;
    private String name;
    private Integer start;
    private Integer length;
    
    
    
    private String gender;
    private String birthDate;
    private String customAttribute;
    private String[] patientAttributes;
    private String[] patientSearchResultFields;
    

	public String getCustomAttribute() {
		return customAttribute;
	}

	public void setCustomAttribute(String customAttribute) {
		this.customAttribute = customAttribute;
	}

	public String[] getPatientAttributes() {
		return patientAttributes;
	}

	public void setPatientAttributes(String[] patientAttributes) {
		this.patientAttributes = patientAttributes;
	}

	public String[] getPatientSearchResultFields() {
		return patientSearchResultFields;
	}

	public void setPatientSearchResultFields(String[] patientSearchResultFields) {
		this.patientSearchResultFields = patientSearchResultFields;
	}

	private Log log = LogFactory.getLog(this.getClass());


    public PatientDuplicateSearchParameters(RequestContext context) {
    	
        String query = context.getParameter("q");
        Map parameterMap = context.getRequest().getParameterMap();
        String identifier = context.getParameter("identifier");
        if (identifier != null) {
            this.setIdentifier(identifier);
        } else if (query != null) {
            if (query.matches(".*\\d+.*")) {
                this.setIdentifier(query);
            } else {
                this.setName(query);
            }
        }
        this.setStart(context.getStartIndex());
        this.setLength(context.getLimit());
        this.setGender(context.getParameter("gender"));
        this.setBirthDate(context.getParameter("birthDate"));
        this.setCustomAttribute(context.getParameter("customAttribute"));
        this.setPatientAttributes((String[]) parameterMap.get("patientAttributes"));
        this.setPatientSearchResultFields((String[]) parameterMap.get("patientSearchResultsConfig"));
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
    
    public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}
