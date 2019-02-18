package banco;

import java.util.Calendar;

import javax.persistence.EntityManager;

import banco.conf.JPAUtil;
import banco.models.Cliente;
import banco.models.Conta;
import banco.models.ContaCorrente;
import banco.models.TipoCliente;

public class mainTest {

	public static void main(String[] args) {

		
		EntityManager em = new JPAUtil().getEntityManager();

		
		Cliente c1 = new Cliente("Lucas", "365422005830", 24, Calendar.getInstance(), TipoCliente.FISICO);
		Cliente c2 = new Cliente("José", "65465465465", 24, Calendar.getInstance(), TipoCliente.JURIDICO);
		
		ContaCorrente conta = new ContaCorrente("50", "50");
		ContaCorrente conta1 = new ContaCorrente("50", "50");
		
		
		c2.setConta(conta1);
		c1.setConta(conta);
		conta1.setCliente(c2);
		conta.setCliente(c1);
		
			
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
		em.persist(conta);
		em.persist(conta1);
		
		em.getTransaction().commit();
		
		Cliente c3 = em.find(Cliente.class, 1l);
		Conta cc1 = em.find(Conta.class, 1l);
		
		
		em.close();

		System.out.println(c3.getConta());
		System.out.println(cc1.getCliente());

	}

}
