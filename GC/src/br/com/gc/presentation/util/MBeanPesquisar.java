package br.com.gc.presentation.util;

import java.io.Serializable;

public abstract class MBeanPesquisar implements Serializable  {

	private static final long serialVersionUID = 2948511876916276394L;
	public abstract void inicializar();
	public abstract void pesquisar();
	public abstract void limpar();
}
