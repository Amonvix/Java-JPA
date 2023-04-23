package teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		
		
		ProdutoDAO dao= new ProdutoDAO();
		
		List<Produto> produtos = dao.obterTodos();
		
		for (Produto produto: produtos) {
			System.out.println("ID -> " + produto.getId()
			+ " Produto: " + produto.getNome()+ "  Preço = R$"
					+ produto.getPreco());
			}
		
		Double inventario = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (t, p) -> t + p).doubleValue();
		System.out.println("\nO valor total dos proutos mencionados é : R$" + inventario.floatValue());
		
		
		dao.fechar();
	}
}
