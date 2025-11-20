package main;

import java.awt.EventQueue;

import controladores.ControladorPrincipal;
import gui.VentanaPrincipal;

public class App {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {

            VentanaPrincipal frame = new VentanaPrincipal();
            frame.setTitle("Sistema de facturación");
            frame.setSize(600, 350);
            frame.setLocationRelativeTo(null);

            new ControladorPrincipal(frame);

            frame.setVisible(true);
        });
    }
}
