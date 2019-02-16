package banco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import banco.conf.JPAUtil;
import banco.models.Cliente;
import banco.models.ContaCorrente;

public class mainTest {
	
	public static void main(String[] args) {
		
		
		Cliente c2 = new Cliente("José");
		
		Cliente c1 = new Cliente("Lucas");
		
		ContaCorrente conta = new ContaCorrente(5000, c1);
		ContaCorrente conta1 = new ContaCorrente(5000, c2);
		
		conta.deposita(400);
		conta.deposita(500);
		conta.deposita(700);
		conta.deposita(400);
		conta.saca(700);
		conta.saca(900);
		conta.transfere(conta1, 500);
		conta.extratoConta();
		conta1.extratoConta();
		
		
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(c1);
			
		em.getTransaction().commit();
		
		Cliente c3 = em.find(Cliente.class, 1l);
		
		em.close();
		
		
		System.out.println(c3);
		System.out.println(conta);
		System.out.println(conta1);
		
		
		
		
		
		
		
	}
	

}
