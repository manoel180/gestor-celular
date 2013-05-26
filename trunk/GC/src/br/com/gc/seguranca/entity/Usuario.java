package br.com.gc.seguranca.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -7211436989743909901L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idUsuarios")
	private Integer idUsuarios;

	@NotNull
	@Column(name = "login", nullable = false, length = 10, unique = true)
	private String login;

	@NotNull
	@Column(name = "senha", nullable = false, length = 32)
	private String senha;

	@ManyToMany 
	@JoinTable(name = "usuario_modulo", joinColumns = @JoinColumn(name = "idUsuarios"), inverseJoinColumns = @JoinColumn(name = "idModulos"))
	private List<Modulos> modulos;

	public Integer getId() {
		return idUsuarios;
	}

	public void setId(Integer id) {
		this.idUsuarios = id;
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

	public List<Modulos> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulos> modulos) {
		this.modulos = modulos;
	}

}
