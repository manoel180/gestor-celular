package br.com.gc.modCelular.entity;


import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "encontros")
public class Encontros implements java.io.Serializable {

	
	private static final long serialVersionUID = -689610049267537600L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idEncontros")
	private Integer idEncontros;

	@Column(name = "descricao", nullable = false, unique=true)
	private String descricao;

	public Integer getIdEncontros() {
		return idEncontros;
	}

	public void setIdEncontros(Integer idEncontros) {
		this.idEncontros = idEncontros;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
