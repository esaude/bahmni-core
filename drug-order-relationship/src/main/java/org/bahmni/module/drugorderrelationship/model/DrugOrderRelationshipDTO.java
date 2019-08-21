package org.bahmni.module.drugorderrelationship.model;

import org.openmrs.*;

import java.io.Serializable;
import java.util.Date;

public class DrugOrderRelationshipDTO  {

    private String drugUuid;
    private String categoryUuid;
    private String treatmentLineUuid;

    public DrugOrderRelationshipDTO() {
    }


    public String getDrugUuid() {
        return drugUuid;
    }

    public void setDrugUuid(String drugUuid) {
        this.drugUuid = drugUuid;
    }

    public String getCategoryUuid() {
        return categoryUuid;
    }

    public void setCategoryUuid(String categoryUuid) {
        this.categoryUuid = categoryUuid;
    }

    public String getTreatmentLineUuid() {
        return treatmentLineUuid;
    }

    public void setTreatmentLineUuid(String treatmentLineUuid) {
        this.treatmentLineUuid = treatmentLineUuid;
    }
}
