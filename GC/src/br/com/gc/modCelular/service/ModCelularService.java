package br.com.gc.modCelular.service;

import java.util.List;

import br.com.gc.modCelular.entity.Discipulos;

public interface ModCelularService {

	public void cadastrarDiscipulo(Discipulos discipulos);

	public void editarDiscipulo(Discipulos discipulos);

	public void excluirDiscipulo(Discipulos discipulos);

	public List<Discipulos> listarTodosDiscipulos();

}
