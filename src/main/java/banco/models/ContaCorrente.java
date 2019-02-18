package banco.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="idConta")
public class ContaCorrente extends Conta {

	public ContaCorrente(String agencia, String numeroConta) {
		super(agencia, numeroConta);
	}
	
	public ContaCorrente() {}
	
}
