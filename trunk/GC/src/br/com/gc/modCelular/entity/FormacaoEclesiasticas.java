package br.com.gc.modCelular.entity;


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "formacao_eclesiasticas", uniqueConstraints = @UniqueConstraint(columnNames = "nome"))
public class FormacaoEclesiasticas implements java.io.Serializable {

	private static final long serialVersionUID = -7023249971316741897L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idFormacaoEclesiasticas")
	private Integer idFormacaoEclesiasticas;

	@Column(name = "nome", unique = true, nullable = false, length = 100)
	private String nome;

	public Integer getIdFormacaoEclesiasticas() {
		return idFormacaoEclesiasticas;
	}

	public void setIdFormacaoEclesiasticas(Integer idFormacaoEclesiasticas) {
		this.idFormacaoEclesiasticas = idFormacaoEclesiasticas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



}
