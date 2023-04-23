package modelo.umpramuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private Date dataDate;
	
	@OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER)		//FORÇA A CONSULTA DA COLUNA, QUANDO A MEMSMA ESTIVER "LAZY" POR PADRÃO
	private List<ItemPedido> itens;									//PADRÃO ADOTADO EM TODAS AS CONSULTA "ToMany" É LAZY(FetchType.LAZY)

	public Pedido() {
		this(new Date());

	}

	public List<ItemPedido> getItens() {
		return itens;
	}



	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}



	public Pedido(Date dataDate) {
		super();
		this.dataDate = dataDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataDate() {
		return dataDate;
	}

	public void setDataDate(Date dataDate) {
		this.dataDate = dataDate;
	}

}
