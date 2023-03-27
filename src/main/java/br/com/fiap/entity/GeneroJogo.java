package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_genero_jogo")
public class GeneroJogo {

	@Id
	@SequenceGenerator(
			name="genero_jogo", 
			sequenceName="sq_tb_genero_jogo", 
			allocationSize=1)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE, 
			generator="genero_jogo")
	@Column(name="id_genero_jogo")
	private int id;
	
	@Column(name = "nm_estudio", nullable = false, length = 30)
	private String nome;
	
	@OneToMany(mappedBy = "generoJogo")
	private List<Jogo> jogos;

	public GeneroJogo() {
		
	}
	
	public GeneroJogo(int id, String nome, List<Jogo> jogos) {
		super();
		this.id = id;
		this.nome = nome;
		this.jogos = jogos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
	
	
}
