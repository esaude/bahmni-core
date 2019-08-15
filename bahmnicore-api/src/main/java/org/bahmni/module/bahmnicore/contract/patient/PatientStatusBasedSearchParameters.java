package org.bahmni.module.bahmnicore.contract.patient;

import org.apache.commons.lang.StringUtils;
import org.openmrs.module.webservices.rest.web.RequestContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;
import java.util.Map;

public class PatientStatusBasedSearchParameters {
    private String identifier;
    private String name;
    private Integer start;
    private Integer length;
    

	private Log log = LogFactory.getLog(this.getClass());


    public PatientStatusBasedSearchParameters(RequestContext context) {
    	
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
    
}
