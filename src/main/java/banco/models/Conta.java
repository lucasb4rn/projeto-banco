package banco.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
	
	private double saldo;
	private Cliente cliente;
	private List<String> lista;
	
	
	public Conta(double saldo, Cliente cliente) {
		this.saldo = saldo;
		this.cliente = cliente;
		this.lista = new ArrayList<String>();
	}

	public void deposita(double valor) {
		
		lista.add("Deposito " + valor);
		
		this.saldo += valor;
		
	}
	
	public boolean saca(double valor) {
		
		if(valor <= saldo && valor > 0) {
			
			this.saldo = this.saldo - valor;
			
			System.out.println("Saldo atual: " +  this.saldo);
			
			lista.add("Saque " + valor);
			
			return true;
			
		} else {
			
			System.out.println("Não é possivel fazer o saque " + valor);
			
			return false;
			
		}

	}
	
	public void transfere(Conta contaDestino, double valorTransferencia) {
		
		boolean saca = this.saca(valorTransferencia);
		
		if(saca == true) {
			
			contaDestino.deposita(valorTransferencia);
			
		} 
		
	}
	
	public void extratoConta(){
		
		for(String linhaEntrato : lista) {
			
			System.out.println("Operação: " + linhaEntrato);
			
		}
		
	}
	

	public double getSaldo() {
		return saldo;
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", cliente=" + cliente + "]";
	}

		
	
	
	

}
