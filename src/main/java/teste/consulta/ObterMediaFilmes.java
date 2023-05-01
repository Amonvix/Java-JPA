package teste.consulta;

import infra.DAO;
import modelo.consulta.NotaFilme;

public class ObterMediaFilmes {
	
	public static void main(String[] args) {
		
		
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		
		NotaFilme notaFilme = dao.consultarum("ObterMediaGeralDosFilmes");
		
		System.out.println(notaFilme.getMedia());
		
		dao.fechar();
	}

}
