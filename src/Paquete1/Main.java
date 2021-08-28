package Paquete1;

import javax.swing.*;

public class Main {
    /*
     *  Instituto Tecnológico de Costa Rica
     *  Ingenieria en Computadores
     * Version: Lenguaje Java
     * Autor: Alisson Redondo Moya
     * Version: 1.0
     * Fecha de Ultima modificación: Agosto 27/2021
     * Tarea extraclase 1
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater (new Runnable() {
            @Override
            public void run() {
                JFrame frame = new VentanaChatCliente();
                frame.setSize(500, 300);
                frame.setVisible(true);

                JFrame frame2 = new VentanaChatServidor();
                frame2.setSize(500, 500);
                frame2.setVisible(true);
            }
        });

    }
}
