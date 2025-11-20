package conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    private static ConexionDB instancia;
    private Connection conexion;

    private static final String URL = "jdbc:mysql://localhost:3306/pizzeria";
    private static final String USER = "root";
    private static final String CONTRA = "";

    private ConexionDB() {
        try {
            conexion = DriverManager.getConnection(URL, USER, CONTRA);
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ConexionDB getInstancia() {
        if (instancia == null) {
            instancia = new ConexionDB();
        }
        return instancia;
    }

    public Connection getConexion() {
        return conexion;
    }
}
