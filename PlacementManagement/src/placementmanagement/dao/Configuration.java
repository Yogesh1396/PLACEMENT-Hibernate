package placementmanagement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configuration {

		static EntityManager entitymanager;
	    static EntityManagerFactory entityManagerFactory;
	    static {
	    	entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	          }
	   public static EntityManager getEntityManager()
	    {
	    	entitymanager = entityManagerFactory.createEntityManager();
	    	return entitymanager;
	    }

	}

