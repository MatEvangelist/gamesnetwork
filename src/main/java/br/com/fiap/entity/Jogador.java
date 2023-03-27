package br.com.fiap.entity;

import java.util.Calendar;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_jogador")
public class Jogador {

	@Id
	@SequenceGenerator(
			name="jogador", 
			sequenceName="sq_tb_jogador", 
			allocationSize=1)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE, 
			generator="jogador")
	@Column(name="id_jogador")
	private int id;
	
	@Column(name = "nm_jogador", nullable = false, length = 50)
	private String nome;
	
	@Column(name = "nm_nickname", nullable = false, length = 15)
	private String nickname;
	
	@Column(name = "ds_email", nullable = false, length = 30)
	private String email;
	
	@Column(name = "ds_senha", nullable = false, length = 20)
	private String senha;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_cadastro")
	private Calendar dataPCadastro;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="nr_cep")
	private Endereco endereco;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_jogo")
	private Jogo jogoFavorito;

	public Jogador() {
		
	}

	public Jogador(int id, String nome, String nickname, String email, String senha, Calendar dataPCadastro,
			Endereco endereco, Jogo jogoFavorito) {
		super();
		this.id = id;
		this.nome = nome;
		this.nickname = nickname;
		this.email = email;
		this.senha = senha;
		this.dataPCadastro = dataPCadastro;
		this.endereco = endereco;
		this.jogoFavorito = jogoFavorito;
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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Calendar getDataPCadastro() {
		return dataPCadastro;
	}

	public void setDataPCadastro(Calendar dataPCadastro) {
		this.dataPCadastro = dataPCadastro;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Jogo getJogoFavorito() {
		return jogoFavorito;
	}

	public void setJogoFavorito(Jogo jogoFavorito) {
		this.jogoFavorito = jogoFavorito;
	}
	

	
}
