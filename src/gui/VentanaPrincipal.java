package gui;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import controladores.ControladorPrincipal;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class VentanaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	private CardLayout cardLayout;
	
	
	private LoginPanel loginPanel;
	private ProductoPanel productoPanel;


	public VentanaPrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		cardLayout = new CardLayout();
		contentPane.setLayout(cardLayout);
		
		loginPanel = new LoginPanel();
		productoPanel = new ProductoPanel();
		
	
		contentPane.add(loginPanel, "Login");
		contentPane.add(productoPanel, "Menu");
		contentPane.add(new UsuarioPanel(), "Usuario");
		
		
		mostrarPanel("Menu");
		

	}
	
	public LoginPanel getLoginPanel()
	{
		return loginPanel;
	}
	
	public ProductoPanel getProductoPanel()
	{
		return productoPanel;
	}
	
	public void mostrarPanel(String panelName)
	{
		cardLayout.show(contentPane, panelName);
	}

}
