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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_jogo")
public class Jogo {
	@Id
	@SequenceGenerator(
			name="jogo", 
			sequenceName="sq_tb_jogo", 
			allocationSize=1)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE, 
			generator="jogo")
	@Column(name="id_jogo")
	private int id;
	
	@Column(name = "nm_jogo", nullable = false, length = 30)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_lancamento")
	private Calendar dataLancamento;
	
	@Column(name = "vl_jogo")
	private double valorJogo;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_genero_jogo")
	private GeneroJogo generoJogo;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	@JoinColumn(name="id_estudio")
	private Estudio estudioJogo;
	
	@OneToMany(mappedBy = "jogoFavorito")
	private List<Jogador> jogadores;

	public Jogo() {
		
	}
	
	public Jogo(int id, String nome, Calendar dataLancamento, double valorJogo, GeneroJogo generoJogo,
			Estudio estudioJogo, List<Jogador> jogadores) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.valorJogo = valorJogo;
		this.generoJogo = generoJogo;
		this.estudioJogo = estudioJogo;
		this.jogadores = jogadores;
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

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public double getValorJogo() {
		return valorJogo;
	}

	public void setValorJogo(double valorJogo) {
		this.valorJogo = valorJogo;
	}

	public GeneroJogo getGeneroJogo() {
		return generoJogo;
	}

	public void setGeneroJogo(GeneroJogo generoJogo) {
		this.generoJogo = generoJogo;
	}

	public Estudio getEstudioJogo() {
		return estudioJogo;
	}

	public void setEstudioJogo(Estudio estudioJogo) {
		this.estudioJogo = estudioJogo;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	
}
