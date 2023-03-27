package br.com.fiap.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_bairro")
public class Bairro {

	@Id
	@Column(name = "cd_bairro")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nm_bairro", nullable = false, length = 30)
	private String nomeBairro;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_cidade")
	private Cidade cidade;
	
	public Bairro() {
		
	}

	public Bairro(int id, String nomeBairro, Cidade cidade) {
		super();
		this.id = id;
		this.nomeBairro = nomeBairro;
		this.cidade = cidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
