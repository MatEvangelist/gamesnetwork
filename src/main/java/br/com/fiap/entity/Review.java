package br.com.fiap.entity;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_review")
@IdClass(ReviewId.class)
public class Review implements Serializable {
	
	@Id
	@JoinColumn(name="id_jogador")
	@ManyToOne(optional = false)
	private Jogador jogador;
	
	@Id
	@JoinColumn(name="id_jogo")
	@ManyToOne(optional = false)
	private Jogo jogo;

	@Column(name = "ds_descricao", nullable = false, length = 150)
	private String descricao;
	
	@Column(name="vl_nota_final")
	private int valorNotaFinal;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_postagem")
	private Calendar dataPostagem;

	public Review() {
		
	}
	
	public Review(Jogador jogador, Jogo jogo, String descricao, int valorNotaFinal, Calendar dataPostagem) {
		super();
		this.jogador = jogador;
		this.jogo = jogo;
		this.descricao = descricao;
		this.valorNotaFinal = valorNotaFinal;
		this.dataPostagem = dataPostagem;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getValorNotaFinal() {
		return valorNotaFinal;
	}

	public void setValorNotaFinal(int valorNotaFinal) {
		this.valorNotaFinal = valorNotaFinal;
	}

	public Calendar getDataPostagem() {
		return dataPostagem;
	}

	public void setDataPostagem(Calendar dataPostagem) {
		this.dataPostagem = dataPostagem;
	}
	
	
}
