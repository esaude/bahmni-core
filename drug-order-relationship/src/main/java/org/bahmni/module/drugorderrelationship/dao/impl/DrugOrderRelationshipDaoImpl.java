package org.bahmni.module.drugorderrelationship.dao.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.bahmni.module.drugorderrelationship.dao.DrugOrderRelationshipDao;
import org.bahmni.module.drugorderrelationship.model.ConceptDTO;
import org.bahmni.module.drugorderrelationship.model.DrugOrderDTO;
import org.bahmni.module.drugorderrelationship.model.DrugOrderRelationship;

import org.hibernate.*;
import org.openmrs.Concept;
import org.openmrs.DrugOrder;
import org.openmrs.Obs;
import org.openmrs.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Component
public class DrugOrderRelationshipDaoImpl implements DrugOrderRelationshipDao {
    protected static final Log log = LogFactory.getLog(DrugOrderRelationshipDaoImpl.class);
    /**
     * Hibernate session factory
     */

    private SessionFactory sessionFactory;

    /**
     * Set session factory
     *
     * @param sessionFactory
     */
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public DrugOrderRelationship saveOrUpdate(DrugOrderRelationship drugRelationship) {
       Session session= sessionFactory.getCurrentSession();
       session.beginTransaction();
       session.save(drugRelationship);
        return drugRelationship;
    }

    @Override
    @Transactional
    public void saveAll(List<DrugOrderRelationship> drugRelationshipList) {
        Session session= sessionFactory.getCurrentSession();

        for (DrugOrderRelationship d : drugRelationshipList) {
            session.save(d);
            session.flush();
            session.clear();
        }


    }


/*    @Override
    @Transactional
    public DrugOrderDTO getDrugOrderById (int id) {
        SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("select orderId, uuid from DrugOrder where orderId=:id");
        query.setParameter("id",id);
        List list = query.list();
        if(list.size() != 0){
            Map results = (Map)list.get(0);
            int identifier =Integer.parseInt(results.get("order_id")+"");
            String uuid = results.get("uuid")+"";
            DrugOrderDTO ddto = new DrugOrderDTO();
            ddto.setOrder_id(identifier);
            ddto.setOrderId(identifier);
            ddto.setUuid(uuid);

            return ddto;

        }
        return null;
    }*/

    @Override
    @Transactional
    public DrugOrder getDrugOrderById (int id) {
        Query query = sessionFactory.getCurrentSession().createQuery("select orderId, uuid from DrugOrder where orderId=:id");
        query.setInteger("id", id);
        List list = query.list();
        if (list.size() != 0) {
          //  return list.get(0);
            DrugOrder dOrder = new DrugOrder();
            Object[] results = (Object[]) list.get(0);
            dOrder.setId(id);
            dOrder.setUuid(results[1]+"");
            return dOrder;
        }
        return null;
    }


    @Override
    @Transactional
    public Order getOrderByUuid (String uuid) {
        Query query = sessionFactory.getCurrentSession().createQuery("select orderId, uuid from Order where uuid=:uuid");
        query.setString("uuid",uuid);
        List list = query.list();
        if(list.size() != 0){
            Order ord = new Order();
            Object[] results = (Object[])list.get(0);
            int id =Integer.parseInt(results[0]+"");
            ord.setId(id);
            ord.setUuid(results[1]+"");
            return ord;
        }
        return null;
    }



    @Override
    @Transactional
    public Concept getConceptByUuid (String uuid) {
        Query query = sessionFactory.getCurrentSession().createQuery("select conceptId, uuid from Concept where uuid=:uuid");
        query.setString("uuid",uuid);
        List list = query.list();
        if(list.size() != 0){
            Concept conc = new Concept();
            Object[] results = (Object[])list.get(0);
            int identifier =Integer.parseInt(results[0]+"");
            conc.setId(identifier);
            conc.setUuid(results[1]+"");
            return conc;
        }
        return null;
    }



        /*SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("select conceptId, uuid from Concept where uuid=:uuid");
        query.setParameter("uuid",uuid);
        List list = query.list();
        if(list.size() != 0){
            Map results = (Map)list.get(0);
            int identifier =Integer.parseInt(results.get("concept_id")+"");
            String Uuid = results.get("uuid")+"";
            ConceptDTO ddto = new ConceptDTO();
            ddto.setConcept_id(identifier);
            ddto.setConceptId(identifier);
            ddto.setUuid(Uuid);*/

            //return ddto;








}
