package br.com.gc.seguranca.mbean;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;


@ManagedBean (name="mBeanLogin")
@RequestScoped
public class MBeanLogin  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4826630067050832091L;
	private String login;
	private String senha;
	
	public String  logar(){
		//Usuario usuario = new Usuario();//facade.getUsuarioByLogin(login);
//		if (usuario == null) {
//			
//			return "";
//		}

		HttpServletResponse response = (HttpServletResponse) FacesContext
				.getCurrentInstance().getExternalContext().getResponse();

		String req = "j_spring_security_check?j_username=" + getLogin() + "&j_password="
				+ senha;
		try {
			//sessaoUsuario.setUsuario(usuario);
			response.sendRedirect(response.encodeRedirectURL(req));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
//		return "/pages/index.jsf";
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
