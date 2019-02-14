package banco;

public abstract class Conta {
	
	private double saldo;
	private Cliente cliente;
	
	public void deposita() {}
	
	public double saca(double valor) {
		
		if(valor <= saldo) {
			
			this.saldo = this.saldo - valor;
			
		}
		
		return saldo;
	}
	
	public void transfere(Conta origem, Conta destino) {}
		
	
	
	
	
	
	
	
	
	
	

	public double getSaldo() {
		return saldo;
	}
	
		
	

}
