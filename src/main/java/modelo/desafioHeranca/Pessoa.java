package modelo.desafioHeranca;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	private Long idPessoa;

	private String nome;

	public Pessoa() {

	}

	public Pessoa(Long idPessoa, String nome) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
	}

	public Long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}




}
