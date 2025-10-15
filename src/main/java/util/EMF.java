package util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMF {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("restaurant");

    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }

    public static void closeFactory(){
        emf.close();
    }

}
