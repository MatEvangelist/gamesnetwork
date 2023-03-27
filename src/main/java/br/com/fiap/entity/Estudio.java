package br.com.fiap.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tb_estudio")
public class Estudio {
	
	@Id
	@SequenceGenerator(
			name="estudio", 
			sequenceName="sq_tb_estudio", 
			allocationSize=1)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE, 
			generator="estudio")
	@Column(name="id_estudio")
	private int id;
	
	@Column(name = "nm_estudio", nullable = false, length = 30)
	private String nome;

	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="nr_cep")
	private Endereco endereco;
	
	@OneToMany(mappedBy = "estudioJogo")
	private List<Jogo> jogos;

	public Estudio() {
		
	}

	public Estudio(int id, String nome, Endereco endereco, List<Jogo> jogos) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
	
}
