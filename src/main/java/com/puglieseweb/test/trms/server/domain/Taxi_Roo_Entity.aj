// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.puglieseweb.test.trms.server.domain;

import com.puglieseweb.test.trms.server.domain.Taxi;
import java.lang.Integer;
import java.lang.Long;
import java.lang.SuppressWarnings;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Version;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect Taxi_Roo_Entity {
    
    declare @type: Taxi: @Entity;
    
    @PersistenceContext
    transient EntityManager Taxi.entityManager;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long Taxi.id;
    
    @Version
    @Column(name = "version")
    private Integer Taxi.version;
    
    public Long Taxi.getId() {
        return this.id;
    }
    
    public void Taxi.setId(Long id) {
        this.id = id;
    }
    
    public Integer Taxi.getVersion() {
        return this.version;
    }
    
    public void Taxi.setVersion(Integer version) {
        this.version = version;
    }
    
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void Taxi.persist() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.persist(this);
    }
    
    @Transactional
    public void Taxi.remove() {
        if (this.entityManager == null) this.entityManager = entityManager();
        if (this.entityManager.contains(this)) {
            this.entityManager.remove(this);
        } else {
            Taxi attached = Taxi.findTaxi(this.id);
            this.entityManager.remove(attached);
        }
    }
    
    @Transactional
    public void Taxi.flush() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.flush();
    }
    
    @Transactional
    public void Taxi.clear() {
        if (this.entityManager == null) this.entityManager = entityManager();
        this.entityManager.clear();
    }
    
    @Transactional
    public Taxi Taxi.merge() {
        if (this.entityManager == null) this.entityManager = entityManager();
        Taxi merged = this.entityManager.merge(this);
        this.entityManager.flush();
        return merged;
    }
    
    public static final EntityManager Taxi.entityManager() {
        EntityManager em = new Taxi().entityManager;
        if (em == null) throw new IllegalStateException("Entity manager has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return em;
    }
    
    @Transactional
    public static long Taxi.countTaxis() {
        return ((Number) entityManager().createQuery("select count(o) from Taxi o").getSingleResult()).longValue();
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public static List<Taxi> Taxi.findAllTaxis() {
        return entityManager().createQuery("select o from Taxi o").getResultList();
    }
    
    @Transactional
    public static Taxi Taxi.findTaxi(Long id) {
        if (id == null) return null;
        Query query = entityManager().createQuery("select o from Taxi o where o.id = :id").setParameter("id",id);
        Taxi result = null;
        List results = query.getResultList();
        if (results.size() > 0) {
            result = (Taxi) results.get(0);
        }
        return result;
    }
    
    @SuppressWarnings("unchecked")
    @Transactional
    public static List<Taxi> Taxi.findTaxiEntries(int firstResult, int maxResults) {
        return entityManager().createQuery("select o from Taxi o").setFirstResult(firstResult).setMaxResults(maxResults).getResultList();
    }
    
}
