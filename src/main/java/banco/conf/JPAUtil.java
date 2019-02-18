package banco.conf;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("banco");

	public EntityManager getEntityManager() {

		EntityManager entityManager = emf.createEntityManager();
		
		if(entityManager == null) {
			
			System.out.println("EntityManager Null");
			return null;
			
		} else {
			return entityManager;
		}

	}
}
