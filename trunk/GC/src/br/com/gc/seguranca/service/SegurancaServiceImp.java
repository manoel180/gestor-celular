package br.com.gc.seguranca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gc.seguranca.dao.UsuarioDao;
import br.com.gc.seguranca.entity.Usuario;

@Service
public class SegurancaServiceImp implements SegurancaService {

	@Autowired
	UsuarioDao usuarioDao;
	
	@Override
	public void cadastrarUsuario(Usuario usuario){
		usuarioDao.salvar(usuario);
	}
	@Override
	public void editarUsuario(Usuario usuario){
		usuarioDao.editar(usuario);
	}
	@Override
	public void excluirUsuario(Usuario usuario){
		usuarioDao.excluir(usuario);
	}
	@Override
	public List<Usuario> listarTodosUsuarios(){
		return usuarioDao.listTodos();
	}
}
