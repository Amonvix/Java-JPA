package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicio-JPA");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Quasimodo", "quasemudo@email.com");
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
	System.out.println("O Id gerado para "+ novoUsuario.getNome() +" foi "+ novoUsuario.getId());
		
		em.close();
		emf.close();
	}
	

}
