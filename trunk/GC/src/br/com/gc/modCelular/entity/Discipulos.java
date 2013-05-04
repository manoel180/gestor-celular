package br.com.gc.modCelular.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "discipulos")
public class Discipulos implements java.io.Serializable {

	private static final long serialVersionUID = -6487762216256649023L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "disCod", unique = true, nullable = false)
	private Integer disCod;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "disEstCivil", nullable = false)
	private EstadoCivil estadocivil;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "disEndereco", nullable = false)
//	private Logradouro logradouro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "disdiscipulador")
	private Discipulos discipulador;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "disFunCod", nullable = false)
	private FuncaoEclesiasticas funcaoeclesiasticas;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "forCod", nullable = false)
	private FormacaoAcademica formacaoacademica;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "disGeracao")
	private Geracoes geracoes;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "disConjugecad")
	private Discipulos conjuge;
	
	@Column(name = "disconjuge", length = 60)
	private String disconjuge;
	
	@Column(name = "disfoto", length = 100)
	private Byte[] disfoto;
	
	@Column(name = "disnome", nullable = false, length = 60)
	private String disnome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "disdatanascimento", length = 10)
	private Date disdatanascimento;
	
	@Column(name = "dism12", nullable = false, length = 1)
	private char dism12;
	
	@Column(name = "disSexo", nullable = false, length = 1)
	private char disSexo;
//	private List<Discipulos> discipulos;

	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}

	public Discipulos getDiscipulador() {
		return discipulador;
	}

	public void setDiscipulador(Discipulos discipulador) {
		this.discipulador = discipulador;
	}

	public FuncaoEclesiasticas getFuncaoeclesiasticas() {
		return funcaoeclesiasticas;
	}

	public void setFuncaoeclesiasticas(FuncaoEclesiasticas funcaoeclesiasticas) {
		this.funcaoeclesiasticas = funcaoeclesiasticas;
	}

	public FormacaoAcademica getFormacaoacademica() {
		return formacaoacademica;
	}

	public void setFormacaoacademica(FormacaoAcademica formacaoacademica) {
		this.formacaoacademica = formacaoacademica;
	}

	public Geracoes getGeracoes() {
		return geracoes;
	}

	public void setGeracoes(Geracoes geracoes) {
		this.geracoes = geracoes;
	}

	public Discipulos getConjuge() {
		return conjuge;
	}

	public void setConjuge(Discipulos conjuge) {
		this.conjuge = conjuge;
	}

	public String getDisconjuge() {
		return disconjuge;
	}

	public void setDisconjuge(String disconjuge) {
		this.disconjuge = disconjuge;
	}

	public Byte[] getDisfoto() {
		return disfoto;
	}

	public void setDisfoto(Byte[] disfoto) {
		this.disfoto = disfoto;
	}

	public String getDisnome() {
		return disnome;
	}

	public void setDisnome(String disnome) {
		this.disnome = disnome;
	}

	public Date getDisdatanascimento() {
		return disdatanascimento;
	}

	public void setDisdatanascimento(Date disdatanascimento) {
		this.disdatanascimento = disdatanascimento;
	}

	public char getDism12() {
		return dism12;
	}

	public void setDism12(char dism12) {
		this.dism12 = dism12;
	}

	public char getDisSexo() {
		return disSexo;
	}

	public void setDisSexo(char disSexo) {
		this.disSexo = disSexo;
	}


	public Igrejas getIgrejas() {
		return igrejas;
	}

	public void setIgrejas(Igrejas igrejas) {
		this.igrejas = igrejas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "igrejas_igrcod")
	private Igrejas igrejas;
	
		
	public Integer getDisCod() {
		return this.disCod;
	}

	public void setDisCod(Integer disCod) {
		this.disCod = disCod;
	}

}
