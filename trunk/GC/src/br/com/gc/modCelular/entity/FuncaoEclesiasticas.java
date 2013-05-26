package br.com.gc.modCelular.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "funcao_eclesiasticas", uniqueConstraints = @UniqueConstraint(columnNames = {
		"descricao", "sexo" }))
public class FuncaoEclesiasticas implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6325030593032627427L;

	@Id
	@Column(name = "idFuncaoEclesiasticas")
	private Integer idFuncaoEclesiasticas;

	@Column(name = "descricao", nullable = false, length = 100)
	private String descricao;

	@Enumerated
	@Column(name = "sexo", nullable = false)
	private Sexo sexo;

	public Integer getIdFuncaoEclesiasticas() {
		return idFuncaoEclesiasticas;
	}

	public void setIdFuncaoEclesiasticas(Integer idFuncaoEclesiasticas) {
		this.idFuncaoEclesiasticas = idFuncaoEclesiasticas;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

}
