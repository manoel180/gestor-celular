package br.com.gc.modCelular.entity;

// Generated 11/05/2011 14:16:49 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Igrejas generated by hbm2java
 */
@Entity
@Table(name = "igrejas")
public class Igrejas implements java.io.Serializable {

	private static final long serialVersionUID = -4064637046755344412L;
	
	@Id
	@Column(name = "igrcod", unique = true, nullable = false)
	private int igrcod;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "igrpaises", nullable = false)
//	private Paises paises;
	
	public Discipulos getResposavelMasculino() {
		return resposavelMasculino;
	}

	public void setResposavelMasculino(Discipulos resposavelMasculino) {
		this.resposavelMasculino = resposavelMasculino;
	}

	public Discipulos getResponsavelFeminino() {
		return responsavelFeminino;
	}

	public void setResponsavelFeminino(Discipulos responsavelFeminino) {
		this.responsavelFeminino = responsavelFeminino;
	}

	public Byte[] getIgrlogo() {
		return igrlogo;
	}

	public void setIgrlogo(Byte[] igrlogo) {
		this.igrlogo = igrlogo;
	}

	public int getIgrdiavencimento() {
		return igrdiavencimento;
	}

	public void setIgrdiavencimento(int igrdiavencimento) {
		this.igrdiavencimento = igrdiavencimento;
	}

	public int getIgrstatus() {
		return igrstatus;
	}

	public void setIgrstatus(int igrstatus) {
		this.igrstatus = igrstatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "igrresponsavelm", nullable = false)
	private Discipulos resposavelMasculino;
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "igrlogradouro", nullable = false)
	//private Logradouro logradouro;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "igrresponsavelf", nullable = false)
	private Discipulos responsavelFeminino;

	@Column(name = "igrnome", nullable = false, length = 100)
	private String igrnome;
	
	@Column(name = "igrlogo", length = 100)
	private Byte[] igrlogo;
	
	@Column(name = "igrdiavencimento")	
	private int igrdiavencimento;
	
	@Column(name = "igrstatus", length = 1)
	private int igrstatus;

	public int getIgrcod() {
		return this.igrcod;
	}

	public void setIgrcod(int igrcod) {
		this.igrcod = igrcod;
	}

	

	public String getIgrnome() {
		return this.igrnome;
	}

	public void setIgrnome(String igrnome) {
		this.igrnome = igrnome;
	}

	
	
}