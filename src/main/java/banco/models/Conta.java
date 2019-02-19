package banco.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idConta;
	private String numeroConta;
	private String agencia;

	@OneToOne
	@JoinColumn(unique = true)
	private Cliente cliente;

	@OneToMany(mappedBy = "conta")
	private List<Movimentacao> movimentacoes;

	@Deprecated
	public Conta() {
	}

	public Conta(String agencia, String numeroConta) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.lista = new ArrayList<String>();
	}

	public List<Movimentacao> getMovimentacoes() {
		return movimentacoes;
	}

	public void setMovimentacoes(List<Movimentacao> movimentacoes) {
		this.movimentacoes = movimentacoes;
	}

	private static double saldo;

	@ElementCollection(targetClass = String.class)
	private List<String> lista;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void deposita(double valor) {

		lista.add("Deposito " + valor);

		this.saldo += valor;

	}

	public boolean saca(double valor) {

		if (valor <= saldo && valor > 0) {

			this.saldo = this.saldo - valor;

			System.out.println("Saldo atual: " + this.saldo);

			lista.add("Saque " + valor);

			return true;

		} else {

			System.out.println("Não é possivel fazer o saque " + valor);

			return false;

		}

	}

	public void transfere(Conta contaDestino, double valorTransferencia) {

		boolean saca = this.saca(valorTransferencia);

		if (saca == true) {

			contaDestino.deposita(valorTransferencia);

		}

	}

	public void extratoConta() {

		for (String linhaEntrato : lista) {

			System.out.println("Operação: " + linhaEntrato);

		}

	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [idConta=" + idConta + ", numeroConta=" + numeroConta + ", agencia=" + agencia
				+ ", movimentacoes=" + movimentacoes + ", lista=" + lista + "]";
	}

}
