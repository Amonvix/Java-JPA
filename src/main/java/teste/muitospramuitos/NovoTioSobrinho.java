package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tio1 = new Tio("Juarez");
		Tio tia2 = new Tio("Juana");
		
		
		Sobrinho sob1 = new Sobrinho("Juquinha");
		Sobrinho sob2 = new Sobrinho("Malaquias");
		
		
		tio1.getSobrinhos().add(sob1);
		sob1.getTios().add(tio1);
		
		tio1.getSobrinhos().add(sob2);
		sob2.getTios().add(tio1);
		
		tia2.getSobrinhos().add(sob1);
		sob1.getTios().add(tia2);
		
		tia2.getSobrinhos().add(sob2);
		sob2.getTios().add(tia2);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT().incluirT(tio1).incluirT(tia2).incluirT(sob1).incluirT(sob2).fecharT().fechar();
	}
}
