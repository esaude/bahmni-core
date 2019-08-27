package org.bahmni.module.drugorderrelationship.model;

public class ConceptDTO {
    private int concept_id;
    private int conceptId;
    private  String uuid;


    public int getConcept_id() {
        return concept_id;
    }

    public void setConcept_id(int concept_id) {
        this.concept_id = concept_id;
    }

    public int getConceptId() {
        return conceptId;
    }

    public void setConceptId(int conceptId) {
        this.conceptId = conceptId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
