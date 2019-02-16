package banco.conf;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("banco");
	
	public EntityManager getEntityManager() {
		
		return  emf.createEntityManager();
		
	}
	

}
