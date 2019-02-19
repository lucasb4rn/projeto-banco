package banco;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import banco.conf.JPAUtil;
import banco.models.Conta;

public class TestBuscarContaEMovimentacoes {
	
	
	public static void main(String[] args) {
		
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		
		
		em.getTransaction().begin();
		
		
		String jpql = "Select c from Conta c join fetch c.movimentacoes ";
		
		
		Query query = em.createQuery(jpql);
		
		
		List<Conta> contas = query.getResultList();
		
		for(Conta conta : contas) {
			
			System.out.println(conta.getCliente().getNome());
			System.out.println(conta.getMovimentacoes());
			
			
		}
		
		em.close();
		
				
		
		
		
		
		
		
		
	}
	
	
	

}
