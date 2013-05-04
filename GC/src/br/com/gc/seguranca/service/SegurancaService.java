package br.com.gc.seguranca.service;

import java.util.List;

import br.com.gc.seguranca.entity.Usuario;

public interface SegurancaService {

	public void cadastrarUsuario(Usuario usuario);

	public void editarUsuario(Usuario usuario);

	public void excluirUsuario(Usuario usuario);

	public List<Usuario> listarTodosUsuarios();

}
