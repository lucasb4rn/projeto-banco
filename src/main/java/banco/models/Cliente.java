package banco.models;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nome;
	private String cpf;
	private Integer idade;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataCadastro;
	
	@Enumerated(EnumType.STRING)
	private TipoCliente tipoCliente;
	
	public Cliente() {}
	
	public Cliente(String nome, String cpf, Integer idade, Calendar calendar,
			TipoCliente tipoCliente) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.dataCadastro = calendar;
		this.tipoCliente = tipoCliente;
	}


	public Cliente (String nome) {
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

	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", dataCadastro=" + dataCadastro
				+ ", tipoCliente=" + tipoCliente + "]";
	}



	

	
	
}
