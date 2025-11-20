package controladores;

import modelos.Usuario;

import java.awt.Panel;

import dao.UsuarioDao;
import gui.LoginPanel;
import utilidad.Mensajes;



public class ControladorLogin 
{
	private UsuarioDao dao;
	private LoginPanel loginPanel; 
	private ControladorPrincipal principal;
	
	public ControladorLogin(UsuarioDao dao, LoginPanel panel, ControladorPrincipal principal)
	{
		this.dao = dao;
		loginPanel = panel;
		this.principal = principal;
		
		panel.getLoginbtn().addActionListener(e -> manejarLogin());
		
	}
	
	private void manejarLogin()
	{
		String campoUsuario = loginPanel.getUsuarioStr().getText().toLowerCase();
		String campoContrasena = loginPanel.getPasswordStr().getText();
		
		 Usuario userEncontrado = dao.buscarUsuario(campoUsuario, campoContrasena);
		 
		 if(userEncontrado != null)
		 {
			 principal.loginExitoso(userEncontrado);
			 principal.mostrarPanel("Menu");
		 }
		 
		 else
		 {
			 Mensajes.mostrarError("Credenciales Incorrectas");
		 }
	}

}