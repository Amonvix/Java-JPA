package modelo.desafioHeranca;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {

	private static final long serialVersionUID = 1L;

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public PessoaJuridica() {

	}

	public PessoaJuridica(Long IdPessoa, String nome, String cnpj) {
		super(IdPessoa, nome);
		this.cnpj = cnpj;
	}

}
