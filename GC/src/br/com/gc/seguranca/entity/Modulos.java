package br.com.gc.seguranca.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="modulos")
public class Modulos implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 162294569385327255L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="idModulos")	
	private Integer idModulos;

	@Column(name="nome",nullable = false, length = 100,unique=true)
	private String nome;

	public Integer getIdModulos() {
		return idModulos;
	}

	public void setIdModulos(Integer idModulos) {
		this.idModulos = idModulos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



}
