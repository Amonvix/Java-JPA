package modelo.desafioHeranca;

import javax.persistence.Entity;

@Entity
public class PessoaFisica extends Pessoa{

	private static final long serialVersionUID = 1L;

	
	private String cpf;

	
	public PessoaFisica() {

	}

	

	public PessoaFisica(Long IdPessoa, String nome, String cpf) {
		super(IdPessoa,nome);
		this.cpf = cpf;
	}



	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	
}
