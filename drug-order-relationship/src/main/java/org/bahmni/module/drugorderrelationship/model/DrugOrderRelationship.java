package org.bahmni.module.drugorderrelationship.model;

import org.openmrs.*;

import java.io.Serializable;
import java.util.Date;

public class DrugOrderRelationship  extends BaseOpenmrsObject implements Auditable, Serializable {

    private int id;
    private DrugOrder order;
    private Concept category;
    private Concept treatmentLine;
    private User creator;
    private Date dateCreated;

    @Override
    public User getCreator() {
        return this.creator;
    }


    @Override
    public void setCreator(User creator) {
        this.creator = creator;
    }

    @Override
    public Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public User getChangedBy() {
        return null;
    }

    @Override
    public void setChangedBy(User changedBy) {

    }

    @Override
    public Date getDateChanged() {
        return null;
    }

    @Override
    public void setDateChanged(Date dateChanged) {

    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
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
}
