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
@Table(name="tb_endereco")
public class Endereco {

	@Id
	@Column(name = "nr_cep")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cep;
	
	@Column(name = "nm_rua", nullable = false, length = 40)
	private String nomeRua;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="cd_bairro")
	private Bairro bairro;
	
	public Endereco() {
		
	}

	public Endereco(int cep, String nomeRua, Bairro bairro) {
		super();
		this.cep = cep;
		this.nomeRua = nomeRua;
		this.bairro = bairro;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	
}
