package fr.univ.blois.siad.m1.javaee.jpa.ex01.services;

import fr.univ.blois.siad.m1.javaee.jpa.ex01.domain.Person;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 * Created by francois on 13/11/14.
 */
public class PersonManager {

    @Inject
    private EntityManager entityManager;

    public PersonManager() {
    }
}
