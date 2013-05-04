package br.com.gc.modCelular.dao;

import java.util.List;


public interface DaoGenerico<T> {
	public void salvar(T object) ;
	public T pesquisarPorId(Object id);
	public void editar(T object);
	public void excluir(T object);
	public List<T> listTodos();
}
