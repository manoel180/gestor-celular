package br.com.gc.modCelular.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="filiacao")
public class Filiacao {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idFiliacao")
	private Integer idFiliacao;
	
	@Column(name="nome", length=100, nullable=true)
	private String nome;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="grau")
	private Grau grau;

	public Integer getIdFiliacao() {
		return idFiliacao;
	}

	public void setIdFiliacao(Integer idFiliacao) {
		this.idFiliacao = idFiliacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Grau getGrau() {
		return grau;
	}

	public void setGrau(Grau grau) {
		this.grau = grau;
	}
	
}
