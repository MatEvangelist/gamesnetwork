package br.com.fiap.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.Jogador;
import br.com.fiap.entity.Jogo;

public class FindTest {

	public static void main(String[] args) {
		EntityManager em = Persistence
				.createEntityManagerFactory("gamesnetwork")
				.createEntityManager();
		
		Jogador jogador = em.find(Jogador.class, 1);
		Jogo jogo = em.find(Jogo.class, 1);
		
		System.out.println(jogador.getId() + " " + jogador.getNome());
		System.out.println(jogo.getId() + " " + jogo.getNome());
		
		em.close();
	}
}
