package fr.univ.blois.siad.m1.javaee.jpa.ex01.common;

import org.pmw.tinylog.Logger;

import javax.enterprise.inject.Default;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

public class DatabaseProducer {


    private EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    public DatabaseProducer() {
    }

    @Produces
    @PersistenceContext(unitName = "siadPU")
    public EntityManager getEntityManager() {
        Logger.trace("Creation de l'EntityManager");
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("siadPU");
        }
        if (entityManager == null) {
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }

    public void dispose(@Disposes @Default EntityManager entityManager) {
        Logger.trace("Fermeture de l'EntitiManager");
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }
}
