package controladores;

import dao.*;
import modelos.*;
import gui.VentanaPrincipal;

public class ControladorPrincipal 
{
	private Usuario usuarioActual;
	private UsuarioDao usuarioDao;
	private VentanaPrincipal ventanaMain;
	private ControladorLogin ctrLogin;
	private ControladorProducto ctrProducto;
	private ProductoDao productoDao;
	
	
	
	
	public ControladorPrincipal(VentanaPrincipal ventana)
	{
		
		this.ventanaMain = ventana;
		this.usuarioDao = new UsuarioDao();
		this.ctrLogin = new ControladorLogin(usuarioDao, ventana.getLoginPanel(), this);
		this.ctrProducto = new ControladorProducto(productoDao, ventana.getProductoPanel(), this);
		
		
	}
	
	public void loginExitoso(Usuario user)
	{
		usuarioActual = user;	
	}
	
	public void mostrarPanel(String nombrePanel)
	{
		ventanaMain.mostrarPanel(nombrePanel);
		
	}
	

}
