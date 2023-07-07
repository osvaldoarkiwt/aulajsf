package br.com.iwt.projetojsf.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.iwt.projetojsf.model.Usuario;

@ViewScoped
@ManagedBean(name="loginController")
public class LoginController implements Serializable{	
	
	private static final long serialVersionUID = 6151007605838838837L;

	private Usuario usuario = new Usuario();
			
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String validarLogin() {
		
		//Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
		
		//flash.put("usuario", usuario);
		
		return usuario.getNome().equals("osvaldo") && usuario.getSenha().equals("iwt123")? 
				"sucesso":"falha";		
	}
}
