package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		Produto produto= new Produto("calculadora", 23.99);
		
		DAO<Produto> insert = new DAO<>(Produto.class);
		insert.atomicoT(produto).fecharT();
		
		
	}

}
