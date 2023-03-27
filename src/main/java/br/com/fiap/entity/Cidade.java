package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_cidade")
public class Cidade {
	
	@Id
	@Column(name = "cd_cidade")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nm_cidade", nullable = false, length = 20)
	private String nomeCidade;
	
	@Enumerated(EnumType.STRING)
	private Estado estado;
	
	public Cidade() {
		
	}

	public Cidade(int id, String nomeCidade, Estado estado) {
		super();
		this.id = id;
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	
}
