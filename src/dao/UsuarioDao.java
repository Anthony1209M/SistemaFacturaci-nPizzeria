package dao;

import modelos.*;
import conexionDB.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class UsuarioDao 
{
	private Connection con;
	
	public UsuarioDao()
	{
		this.con = ConexionDB.getInstancia().getConexion();
	}
	
	
	public Usuario buscarUsuario(String usuario, String contrasena)
	{
		
		String consulta = "SELECT * FROM usuario WHERE LOWER(usuario) = ? AND contrasena = ?";
		
		try 
		{
		PreparedStatement ps = con.prepareStatement(consulta);
		
		ps.setString(1, usuario);
		ps.setString(2, contrasena);
		
	    ResultSet result = ps.executeQuery();
	    
	
	    
	    if (result.next())
	    {
	    	String rol = result.getString("rol");
	    	int id = result.getInt("id_usuario");
	    	String nombre = result.getString("nombre");
	    	String apellido = result.getString("apellido");
	    	String telefono = result.getString("telefono");
	    	
	    	if(rol.equalsIgnoreCase("admin"))
	    	{
	    		return new Administrador(id, nombre, apellido, telefono, rol);
	    	}
	    	else
	    	{
	    		return new UsuarioRegular(id, nombre, apellido, telefono, rol);
	    	}
	    }
	    
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	  }
	  

}
