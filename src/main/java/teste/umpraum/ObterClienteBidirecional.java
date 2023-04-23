package teste.umpraum;

import java.util.List;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteBidirecional {
	
	public static void main(String[] args) {
		
		DAO<Cliente> daocliente = new DAO<>(Cliente.class);
		
		Cliente cliente = daocliente.obterPorId(2L);
		
		System.out.println(cliente.getAssento().getCliente().getNome());
		
		daocliente.fechar();
		
		DAO<Assento> daoassento = new DAO<>(Assento.class);
		
		Assento assento = daoassento.obterPorId(1L);
		
				
		System.out.println(assento.getCliente().getNome());
		
		daoassento.fechar();
		
		
	}

}
