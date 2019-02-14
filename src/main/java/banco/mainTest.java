package banco;

public class mainTest {
	
	public static void main(String[] args) {
		
		
		Cliente c1 = new Cliente("Lucas");
		Cliente c2 = new Cliente("José");
		
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
		
		System.out.println(conta);
		System.out.println(conta1);
		
		
		
		
		
		
		
	}
	

}
