package br.com.gc.seguranca.mbean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.gc.presentation.util.MBeanManter;

@Component
@Scope("request")
public class MBeanManterUsuario extends MBeanManter{

	private static final long serialVersionUID = -1401643498723747425L;

	@Override
	public void inicializar() {
		
	}

	@Override
	public String salvar() {
		return null;
	}

	@Override
	public String editar() {
		return null;
	}

	@Override
	public String cancelar() {
		return null;
	}

	@Override
	public String excluir() {
		return null;
	}

}
