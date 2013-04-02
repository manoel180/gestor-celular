package br.com.gc.seguranca.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name="USUARIOS")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = -7211436989743909901L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="id")	
	private Integer id;

	@NotNull
	@Column(name="login",nullable = false, length = 10,unique=true)
	private String login;

	@NotNull
	@Column(name="senha",nullable = false, length = 32)
	private String senha;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
