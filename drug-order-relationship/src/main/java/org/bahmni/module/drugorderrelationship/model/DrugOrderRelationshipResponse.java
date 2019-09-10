package org.bahmni.module.drugorderrelationship.model;

public class DrugOrderRelationshipResponse {
    private CategoryDTO category;
    private TreatmentLineDTO treatmentLine;

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public TreatmentLineDTO getTreatmentLine() {
        return treatmentLine;
    }

    public void setTreatmentLine(TreatmentLineDTO treatmentLine) {
        this.treatmentLine = treatmentLine;
    }
}
