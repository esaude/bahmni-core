package org.bahmni.module.drugorderrelationship.model;

import org.openmrs.DrugOrder;
import org.openmrs.Concept;
import org.openmrs.User;

import java.util.Date;

public class DrugOrderRelationship   {

    private int id;
    private DrugOrder order;
    private Concept category;
    private Concept treatmentLine;
    private User creator;
    private Date dateCreated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DrugOrder getOrder() {
        return order;
    }

    public void setOrder(DrugOrder order) {
        this.order = order;
    }

    public Concept getCategory() {
        return category;
    }

    public void setCategory(Concept category) {
        this.category = category;
    }

    public Concept getTreatmentLine() {
        return treatmentLine;
    }

    public void setTreatmentLine(Concept treatmentLine) {
        this.treatmentLine = treatmentLine;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
