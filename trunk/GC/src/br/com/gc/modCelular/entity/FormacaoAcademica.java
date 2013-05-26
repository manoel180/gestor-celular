package br.com.gc.modCelular.entity;


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "formacao_academica", uniqueConstraints = @UniqueConstraint(columnNames = "descricao"))
public class FormacaoAcademica implements java.io.Serializable {

	private static final long serialVersionUID = 2566674309873411996L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idFormacaoAcademica")
	private Integer idFormacaoAcademica;

	@Column(name = "descricao", unique = true, nullable = false, length = 100)
	private String descricao;

	public Integer getIdFormacaoAcademica() {
		return idFormacaoAcademica;
	}

	public void setIdFormacaoAcademica(Integer idFormacaoAcademica) {
		this.idFormacaoAcademica = idFormacaoAcademica;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
