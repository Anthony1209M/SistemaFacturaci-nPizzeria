package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.*;

import controladores.ControladorPrincipal;

public class LoginPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField campoUsuario;
	private JPasswordField campoContrasena;
	private JButton btnIniciarSeccion;

	/**
	 * Create the panel.
	 */
	public LoginPanel() {
		
		//Config del panel
		setBackground(Color.LIGHT_GRAY);
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		//Título del panel
		JLabel tituloPanel = new JLabel("Iniciar Sección");
		tituloPanel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		
		GridBagConstraints gbc_tituloPanel = new GridBagConstraints();
		gbc_tituloPanel.ipady = 10;
		gbc_tituloPanel.insets = new Insets(0, 0, 5, 5);
		gbc_tituloPanel.gridx = 1;
		gbc_tituloPanel.gridy = 0;
		add(tituloPanel, gbc_tituloPanel);
		
		// Usuario
		JLabel usuarioLabel = new JLabel("Usuario");
		
		GridBagConstraints gbc_usuarioLabel = new GridBagConstraints();
		gbc_usuarioLabel.anchor = GridBagConstraints.WEST;
		gbc_usuarioLabel.insets = new Insets(40, 0, 5, 5);
		gbc_usuarioLabel.gridx = 1;
		gbc_usuarioLabel.gridy = 1;
		add(usuarioLabel, gbc_usuarioLabel);
		
		campoUsuario = new JTextField();
		GridBagConstraints gbc_campoUsuario = new GridBagConstraints();
		gbc_campoUsuario.insets = new Insets(0, 0, 10, 5);
		gbc_campoUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoUsuario.gridx = 1;
		gbc_campoUsuario.gridy = 2;
		add(campoUsuario, gbc_campoUsuario);
		campoUsuario.setColumns(10);
		
		
		
		//Contraseña
		JLabel contrasenaLabel = new JLabel("Contraseña");
		
		GridBagConstraints gbc_contrasenaLabel = new GridBagConstraints();
		gbc_contrasenaLabel.anchor = GridBagConstraints.WEST;
		gbc_contrasenaLabel.insets = new Insets(0, 0, 5, 5);
		gbc_contrasenaLabel.gridx = 1;
		gbc_contrasenaLabel.gridy = 3;
		add(contrasenaLabel, gbc_contrasenaLabel);
		
		campoContrasena = new JPasswordField();
		GridBagConstraints gbc_campoContrasena = new GridBagConstraints();
		gbc_campoContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_campoContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_campoContrasena.gridx = 1;
		gbc_campoContrasena.gridy = 4;
		add(campoContrasena, gbc_campoContrasena);
		
		
		//Boton iniciar sección
		btnIniciarSeccion = new JButton("Iniciar Sección");
		btnIniciarSeccion.setBackground(Color.WHITE);
		
		
		GridBagConstraints gbc_btnIniciarSeccion = new GridBagConstraints();
		gbc_btnIniciarSeccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnIniciarSeccion.insets = new Insets(20, 0, 5, 5);
		gbc_btnIniciarSeccion.gridx = 1;
		gbc_btnIniciarSeccion.gridy = 5;
		add(btnIniciarSeccion, gbc_btnIniciarSeccion);
		
		
	}
	
	//getters
	public JTextField getUsuarioStr()
	{
		return campoUsuario;
	}
	
	public JPasswordField getPasswordStr()
	{
		return campoContrasena;
	}
	
	public JButton getLoginbtn()
	{
		return btnIniciarSeccion;
	}

}
