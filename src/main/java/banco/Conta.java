package banco;

public abstract class Conta {
	
	private double saldo;
	private Cliente cliente;
	
	
	public Conta(double saldo, Cliente cliente) {
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public void deposita(double valor) {
		
		this.saldo += valor;
	}
	
	public double saca(double valor) {
		
		if(valor <= saldo) {
			
			this.saldo = this.saldo - valor;
			
		} else {
			
			System.out.println();
			
		}
		
		return saldo;
	}
	
	public void transfere(Conta origem, Conta destino) {}
		

	public double getSaldo() {
		return saldo;
	}

	
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", cliente=" + cliente + "]";
	}

		
	
	
	

}
