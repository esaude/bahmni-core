package org.bahmni.module.drugorderrelationship.dao;

import org.bahmni.module.drugorderrelationship.model.DrugOrderRelationship;

import org.openmrs.Concept;
import org.openmrs.DrugOrder;


import java.util.List;

public interface DrugOrderRelationshipDao {
    DrugOrderRelationship saveOrUpdate(DrugOrderRelationship obsRelationship);
    DrugOrder getDrugOrderByUuid(String uuid);
    DrugOrderRelationship getRelationById(int id);
    List<DrugOrderRelationship> getDrugOrdersByCategory(Concept category);
    List<DrugOrderRelationship> getDrugOrdersByTreatmentLine(Concept treatmentLine);
    List<DrugOrderRelationship> getRelationshipByOrder(DrugOrder order);

}
