package controladores;

import dao.ProductoDao;
import gui.ProductoPanel;

public class ControladorProducto 
{
	private ProductoDao dao;
	private ProductoPanel panel;
	private ControladorPrincipal controlador;
	
	public ControladorProducto(ProductoDao dao, ProductoPanel panel, ControladorPrincipal controlador)
	{
		this.dao = dao;
		this.panel = panel;
		this.controlador = controlador;
		
		panel.getAgregarBtn().addActionListener(e -> agregarUsuario());
	}

	public void agregarUsuario()
	{
		
	}
}

