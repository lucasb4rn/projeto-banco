package banco.models;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String cpf;
	private Integer idade;

	@JoinColumn(unique = true)
	@OneToOne(mappedBy = "cliente")
	private Conta conta;

	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataCadastro;

	@Enumerated(EnumType.STRING)
	private TipoCliente tipoCliente;

	@Deprecated
	public Cliente() {
	}

	public Cliente(String nome, String cpf, Integer idade, Calendar calendar, TipoCliente tipoCliente) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.dataCadastro = calendar;
		this.tipoCliente = tipoCliente;
	}

	public Cliente(String nome) {
		this.nome = nome;

	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public long getId() {
		return id;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", dataCadastro="
				+ dataCadastro + ", tipoCliente=" + tipoCliente + "]";
	}

}
