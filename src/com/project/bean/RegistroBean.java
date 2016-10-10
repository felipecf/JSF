package com.project.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.project.pojos.Usuario;

@ManagedBean
@ViewScoped
public class RegistroBean implements Serializable {

	private static final long serialVersionUID = 1L;
	Usuario usuario = new Usuario();

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
