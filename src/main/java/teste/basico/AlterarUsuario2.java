package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicio-JPA");
		EntityManager em = emf.createEntityManager();
				
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		usuario.setNome("Danny");
		usuario.setEmail("danny@email.com");
		
//		em.merge(usuario);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}