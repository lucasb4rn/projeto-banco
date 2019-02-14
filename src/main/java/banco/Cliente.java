package banco;

import java.util.Calendar;

public class Cliente {

	private String nome;
	private String cpf;
	private Integer idade;
	private Calendar dataNascimento;
	private String conta;
	private String agencia;

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public String getConta() {
		return conta;
	}

	public String getAgencia() {
		return agencia;
	}

}
