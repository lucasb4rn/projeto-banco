package banco.DAOs;

import javax.persistence.EntityManager;

import banco.conf.JPAUtil;
import banco.models.Cliente;

public class ClienteDAO {
	
	
	EntityManager em = new JPAUtil().getEntityManager();
	
	
	
	public void adiciona(Cliente cliente) {
		
		em.getTransaction().begin();
		
		em.persist(cliente);
		
		em.getTransaction().commit();
		
		em.close();
		
	}
	
	
	public Cliente busca(Long id) {
		
		return em.find(Cliente.class, id);
		
	}
	
	

}
