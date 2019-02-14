package banco;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(double saldo, Cliente cliente) {
		super(saldo, cliente);
	}

	@Override
	public void deposita(double saldo) {
		super.deposita(saldo);
	}

	
	
}
