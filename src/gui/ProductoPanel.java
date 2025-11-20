package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class ProductoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTable tabla;
    private DefaultTableModel modelo;
    private JButton agregarBtn;

	/**
	 * Create the panel.
	 */
	public ProductoPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		
		
		agregarBtn = new JButton("Agregar");
		panel.add(agregarBtn);
		
		JButton btnNewButton_1 = new JButton("eliminar");
		
		
		JButton btnNewButton_2 = new JButton("editar Perfil");
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		modelo = new DefaultTableModel(new String[]{"ID", "Nombre", "Precio", "Stock", "Categoría", "Cantidad"}, 1);
	    tabla = new JTable(modelo);
	    JScrollPane scrollTabla = new JScrollPane(tabla);
	    scrollTabla.setBounds(20, 170, 600, 200);
	    
		
	    panel_1.add(scrollTabla);
	    
	    
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		add(panel_3, BorderLayout.NORTH);
		panel_3.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JButton btnNewButton_3 = new JButton("Gestion Usuario");
		panel_3.add(btnNewButton_3);
		
	
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(btnNewButton_4);
		
		

	}
	
	public JButton getAgregarBtn()
	{
		return agregarBtn;
	}
}


