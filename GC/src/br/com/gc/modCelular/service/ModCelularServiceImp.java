package br.com.gc.modCelular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gc.modCelular.dao.DiscipuloDao;
import br.com.gc.modCelular.entity.Discipulos;

@Service
public class ModCelularServiceImp implements ModCelularService {

	@Autowired
	DiscipuloDao discipuloDao;
	
	@Override
	public void cadastrarDiscipulo(Discipulos discipulos){
		discipuloDao.salvar(discipulos);
	}
	@Override
	public void editarDiscipulo(Discipulos discipulos){
		discipuloDao.editar(discipulos);
	}
	@Override
	public void excluirDiscipulo(Discipulos discipulos){
		discipuloDao.excluir(discipulos);
	}
	@Override
	public List<Discipulos> listarTodosDiscipulos(){
		return discipuloDao.listTodos();
	}
}
