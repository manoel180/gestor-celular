package br.com.gc.modCelular.entity;


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 */
@Entity
@Table(name = "formacaoacademica", uniqueConstraints = @UniqueConstraint(columnNames = "ForAcDescricao"))
public class FormacaoAcademica implements java.io.Serializable {

	private static final long serialVersionUID = 2566674309873411996L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ForAcCod", unique = true, nullable = false)
	private Integer forAcCod;

	@Column(name = "ForAcDescricao", unique = true, nullable = false, length = 60)
	private String forAcDescricao;

	public Integer getForAcCod() {
		return this.forAcCod;
	}

	public void setForAcCod(Integer forAcCod) {
		this.forAcCod = forAcCod;
	}

	public String getForAcDescricao() {
		return this.forAcDescricao;
	}

	public void setForAcDescricao(String forAcDescricao) {
		this.forAcDescricao = forAcDescricao;
	}

}
