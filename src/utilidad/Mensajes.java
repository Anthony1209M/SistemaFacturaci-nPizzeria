package utilidad;

import javax.swing.JOptionPane;

public class Mensajes {

    // Mostrar error
    public static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(
            null,                   
            mensaje,                
            "Error",               
            JOptionPane.ERROR_MESSAGE 
        );
    }

    // Mostrar información
    public static void mostrarInfo(String mensaje) {
        JOptionPane.showMessageDialog(
            null,
            mensaje,
            "Información",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    // Mostrar advertencia
    public static void mostrarAdvertencia(String mensaje) {
        JOptionPane.showMessageDialog(
            null,
            mensaje,
            "Advertencia",
            JOptionPane.WARNING_MESSAGE
        );
    }
}

