package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class RemoverUsuario {
	
	public static void main(String[] args) {
		

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicio-JPA");
		EntityManager em = emf.createEntityManager();
				
		
		Usuario usuario = em.find(Usuario.class, 9L);
		if (usuario != null) {
			em.getTransaction().begin();
			em.remove(usuario);
			System.out.println("Usuario removido com sucesso");
			em.getTransaction().commit();
		}
		
		em.close();
		emf.close();
		
	}

}
