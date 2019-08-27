package org.bahmni.module.drugorderrelationship.dao;

import org.bahmni.module.drugorderrelationship.model.ConceptDTO;
import org.bahmni.module.drugorderrelationship.model.DrugOrderDTO;
import org.bahmni.module.drugorderrelationship.model.DrugOrderRelationship;

import org.openmrs.Concept;
import org.openmrs.DrugOrder;
import org.openmrs.Order;


import java.util.List;

public interface DrugOrderRelationshipDao {
    DrugOrderRelationship saveOrUpdate(DrugOrderRelationship obsRelationship);
    DrugOrder getDrugOrderById(int id);
    Order getOrderByUuid(String uuid);
    Concept getConceptByUuid (String uuid);
    public void saveAll(List<DrugOrderRelationship> obsRelationshipList);

}
