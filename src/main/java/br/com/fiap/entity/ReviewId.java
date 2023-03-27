package br.com.fiap.entity;

import java.io.Serializable;

public class ReviewId implements Serializable {

	private int jogador;
	private int jogo;
	
	public ReviewId() {
		
	}

	public ReviewId(int jogador, int jogo) {
		super();
		this.jogador = jogador;
		this.jogo = jogo;
	}

	public int getJogador() {
		return jogador;
	}
	public void setJogador(int jogador) {
		this.jogador = jogador;
	}
	public int getJogo() {
		return jogo;
	}
	public void setJogo(int jogo) {
		this.jogo = jogo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + jogador;
		result = prime * result + jogo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReviewId other = (ReviewId) obj;
		if (jogador != other.jogador)
			return false;
		if (jogo != other.jogo)
			return false;
		return true;
	}
	
	
}
