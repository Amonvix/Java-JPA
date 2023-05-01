package modelo.desafioHeranca.teste;

import infra.DAO;
import modelo.desafioHeranca.PessoaFisica;

public class CriandoCadastro {
	
	public static void main(String[] args) {
		
		DAO<PessoaFisica> dao = new DAO<>();
		PessoaFisica pessoa = new PessoaFisica(1L,"Daniel Pedroso","328.221.428-66");
		
		dao.atomicoT(pessoa);
		dao.fechar();
	}

}
