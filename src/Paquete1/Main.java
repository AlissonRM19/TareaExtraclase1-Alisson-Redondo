package Paquete1;

import javax.swing.*;

/**
 * Clase principal del la tarea extraclase 1 chat
 * @author Alisson Redondo Moya
 */
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
            /**
             * Sobre escribe el metodo run
             *@Override
             */
            public void run() {
                JFrame frame = new VentanaChatCliente();
                frame.setSize(500, 300);
                frame.setVisible(true);
            }
        });

    }


}
