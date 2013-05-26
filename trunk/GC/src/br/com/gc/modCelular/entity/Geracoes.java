package br.com.gc.modCelular.entity;


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "geracoes", uniqueConstraints = @UniqueConstraint(name="uk_descricao", columnNames = "descricao"))
public class Geracoes implements java.io.Serializable {

	private static final long serialVersionUID = -1979223460134120472L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idGeracao")
	private Integer idGeracao;

	@Column(name = "descricao", unique = true, nullable = false, length = 100)
	private String descricao;

	public Integer getIdGeracao() {
		return idGeracao;
	}

	public void setIdGeracao(Integer idGeracao) {
		this.idGeracao = idGeracao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

}
