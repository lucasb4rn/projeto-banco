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
	
	public void saca(double valor) {
		
		if(valor <= saldo && valor > 0) {
			
			this.saldo = this.saldo - valor;
			
			System.out.println("Saldo atual: " +  this.saldo);
			
		} else {
			
			System.out.println("Não é possivel fazer o saque " + valor);
			
		}

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
