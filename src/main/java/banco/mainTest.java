package banco;

public class mainTest {
	
	public static void main(String[] args) {
		
		
		Cliente c1 = new Cliente("Lucas");
		ContaCorrente conta = new ContaCorrente(5000, c1);
		conta.deposita(500);
		
		System.out.println(conta);
		
		
		
	}
	

}
