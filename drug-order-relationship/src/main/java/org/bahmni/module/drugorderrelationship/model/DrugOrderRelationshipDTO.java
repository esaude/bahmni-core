package org.bahmni.module.drugorderrelationship.model;

public class DrugOrderRelationshipDTO  {

    private String drugUuid;
    private String categoryUuid;
    private String treatmentLineUuid;


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
