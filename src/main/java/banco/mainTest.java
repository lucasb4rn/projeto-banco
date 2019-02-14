package banco;

public class mainTest {
	
	public static void main(String[] args) {
		
		
		Cliente c1 = new Cliente("Lucas");
		Cliente c2 = new Cliente("José");
		
		ContaCorrente conta = new ContaCorrente(5000, c1);
		ContaCorrente conta1 = new ContaCorrente(5000, c2);
		
		
		conta.deposita(500);
		conta.saca(8000);
		conta.saca(900);
		conta.transfere(conta1, 8000);
		
		System.out.println(conta);
		System.out.println(conta1);
		
		
		
		
		
		
		
	}
	

}
