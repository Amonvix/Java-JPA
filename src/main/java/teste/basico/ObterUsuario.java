package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicio-JPA");
		EntityManager em = emf.createEntityManager();

		Usuario usuario = em.find(Usuario.class, 9L);

		System.out.println(usuario.getNome());

		emf.close();
		em.close();
	}
}
