package br.com.gc.presentation.util;

import java.io.Serializable;

public abstract class MBeanManter implements Serializable{

	private static final long serialVersionUID = 3615296011469876350L;

	private Boolean edicao;
	
	public abstract void inicializar();
	public abstract String salvar();
	public abstract String editar();
	public abstract String cancelar();
	public abstract String excluir();
	
	
	public Boolean getEdicao() {
		return edicao;
	}
	public void setEdicao(Boolean edicao) {
		this.edicao = edicao;
	}
}
