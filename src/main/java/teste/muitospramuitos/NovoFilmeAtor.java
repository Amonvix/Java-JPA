package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
		
		Filme filmeA = new Filme("Home", 9.0);
		Filme filmeB = new Filme("Detona Ralph", 7.0);
		
		Ator atorA = new Ator("Jin Parson");
		Ator atrizB = new Ator("Rihanna");
		
		filmeA.adicionarator(atorA);
		filmeA.adicionarator(atrizB);

		filmeB.adicionarator(atrizB);

		
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		dao.atomicoT(filmeA);
		
	}

}
