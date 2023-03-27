package br.com.fiap.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Jogo;

public class ChangeTest {

	public static void main(String[] args) {
		EntityManager em = Persistence
				.createEntityManagerFactory("gamesnetwork")
				.createEntityManager();
		
		Jogo jogo = new Jogo();
		jogo.setId(1);
		jogo.setNome("CS:GO Source 2");
		
		em.merge(jogo);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
	}
}
