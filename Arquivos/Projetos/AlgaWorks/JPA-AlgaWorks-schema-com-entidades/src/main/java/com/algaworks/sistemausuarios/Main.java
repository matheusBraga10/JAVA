package com.algaworks.sistemausuarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("Cliente-PU");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.close();

        entityManagerFactory.close();
    }
}