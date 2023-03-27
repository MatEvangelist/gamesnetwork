package br.com.fiap.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Jogador;

public class DeleteTest {

	public static void main(String[] args) {
		EntityManager em = Persistence
				.createEntityManagerFactory("gamesnetwork")
				.createEntityManager();
		
		Jogador jogador = em.find(Jogador.class, 1);
		em.remove(jogador);
		
		try {
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch(Exception e) {
			if(em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}
		
		em.close();
	}
}
