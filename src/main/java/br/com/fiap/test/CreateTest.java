package br.com.fiap.test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.entity.GeneroJogo;
import br.com.fiap.entity.Jogador;
import br.com.fiap.entity.Jogo;

public class CreateTest {

	public static void main(String[] args) {
		EntityManager em = Persistence
				.createEntityManagerFactory("gamesnetwork")
				.createEntityManager();
		
		GeneroJogo generoJogo = new GeneroJogo();
		generoJogo.setId(1);
		generoJogo.setNome("FPS");
		
		Jogo jogo = new Jogo();
		jogo.setId(1);
		jogo.setNome("Counter Strike: Global Offensive");
		jogo.setDataLancamento(new GregorianCalendar(2012, Calendar.JANUARY, 01));
		jogo.setValorJogo(199.00);
		jogo.setGeneroJogo(generoJogo);
		jogo.setEstudioJogo(null);
		

		Jogador jogador = new Jogador();
		jogador.setNome("Mathews Evangelista");
		jogador.setNickname("matevangel1sta");
		jogador.setEmail("mathews.evangelista@fiap.com.br");
		jogador.setSenha("senha123");
		jogador.setJogoFavorito(jogo);
		jogador.setDataPCadastro(new GregorianCalendar(2020, Calendar.MAY, 10));
		jogador.setEndereco(null);

		try {
			em.persist(generoJogo);
			em.persist(jogo);
			em.persist(jogador);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}

		em.close();

	}

}
