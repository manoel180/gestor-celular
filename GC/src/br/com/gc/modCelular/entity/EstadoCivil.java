package br.com.gc.modCelular.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "estado_civil", uniqueConstraints = @UniqueConstraint(columnNames = "descricao"))
public class EstadoCivil implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7720861098971185572L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idEstadoCivil")
	private Integer idEstadoCivil;

	@Column(name = "descricao", unique = true, length = 100)
	private String descricao;

	public Integer getIdEstadoCivil() {
		return idEstadoCivil;
	}

	public void setIdEstadoCivil(Integer idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}
