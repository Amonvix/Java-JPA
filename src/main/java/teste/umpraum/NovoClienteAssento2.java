package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
	
	public static void main(String[] args) {
		
		
		Assento assento = new Assento("16C");
		Cliente cliente = new Cliente("Joao", assento);
	
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		dao.atomicoT(cliente).fechar();			// INSERIDO DE FORMA ENFORCED
	}

}
