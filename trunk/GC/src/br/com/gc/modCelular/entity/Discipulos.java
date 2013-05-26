package br.com.gc.modCelular.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "discipulos")
public class Discipulos implements java.io.Serializable {

	private static final long serialVersionUID = -6487762216256649023L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idDiscipulos")
	private Integer idDiscipulos;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estadoCivil", nullable = false)
	@ForeignKey(name="fk_estadoCivil")
	private EstadoCivil estadocivil;

	// @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "disEndereco", nullable = false)
	// private Logradouro logradouro;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "discipulador")
	@ForeignKey(name="fk_discipulador")
	private Discipulos discipulador;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "funcaoEclesiasticas", nullable = false)
	@ForeignKey(name="fk_funcaoEclesiasticas")
	private FuncaoEclesiasticas funcaoEclesiasticas;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "formacaoAcademica", nullable = false)
	@ForeignKey(name="fk_formacaoAcademica")
	private FormacaoAcademica formacaoAcademica;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "geracao")
	@ForeignKey(name="fk_geracao")
	private Geracoes geracoes;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "conjuge")
	@ForeignKey(name="fk_conjuge")
	private Discipulos conjuge;

	@Column(name = "nomeConjuge", length = 100)
	private String nomeConjuge;

	@Column(name = "foto")
	private Byte[] foto;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Temporal(TemporalType.DATE)
	@Column(name = "dataNascimento")
	private Date dataNascimento;

	@Column(name = "m12", nullable = false)
	private Boolean m12;

	@Column(name = "sexo", nullable = false)
	@Enumerated
	private Sexo sexo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "igreja")
	@ForeignKey(name="fk_igreja")
	private Igrejas igreja;
	
	@Column(name = "email", nullable = false, length = 100)
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pai")
	@ForeignKey(name="fk_pai")
	private Filiacao pai;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mae")
	@ForeignKey(name="fk_mae" )
	private Filiacao mae;

	public Integer getIdDiscipulos() {
		return idDiscipulos;
	}

	public void setIdDiscipulos(Integer idDiscipulos) {
		this.idDiscipulos = idDiscipulos;
	}

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

	public FuncaoEclesiasticas getFuncaoEclesiasticas() {
		return funcaoEclesiasticas;
	}

	public void setFuncaoEclesiasticas(FuncaoEclesiasticas funcaoEclesiasticas) {
		this.funcaoEclesiasticas = funcaoEclesiasticas;
	}

	public FormacaoAcademica getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
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

	public String getNomeConjuge() {
		return nomeConjuge;
	}

	public void setNomeConjuge(String nomeConjuge) {
		this.nomeConjuge = nomeConjuge;
	}

	public Byte[] getFoto() {
		return foto;
	}

	public void setFoto(Byte[] foto) {
		this.foto = foto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Boolean getM12() {
		return m12;
	}

	public void setM12(Boolean m12) {
		this.m12 = m12;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Igrejas getIgreja() {
		return igreja;
	}

	public void setIgreja(Igrejas igreja) {
		this.igreja = igreja;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Filiacao getPai() {
		return pai;
	}

	public void setPai(Filiacao pai) {
		this.pai = pai;
	}

	public Filiacao getMae() {
		return mae;
	}

	public void setMae(Filiacao mae) {
		this.mae = mae;
	}

	
}
