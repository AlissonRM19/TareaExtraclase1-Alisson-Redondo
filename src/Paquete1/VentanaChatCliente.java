package Paquete1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * VentanaChatCliente va a representar una interfaz grafica en la que se pueden introducir valores y ser respodidio con el monto.
 * @author Alisson Redondo Moya
 */

public class VentanaChatCliente extends JFrame{
    /*
    *  Instituto Tecnológico de Costa Rica
    *  Ingenieria en Computadores
    * Version: Lenguaje Java
    * Autor: Alisson Redondo Moya
    * Version: 1.0
    * Fecha de Ultima modificación: Agosto 27/2021
    * Tarea extraclase 1
    */
    private JPanel panel1;
    private JTextField txtValorProducto;
    private JTextField txtPesoProducto;
    private JTextField txtPorcentajeImpuestos;
    private JButton EnviarButton;
    private JButton SalirButton;
    private JLabel labelValorProducto;
    private JLabel labelPesoProducto;
    private JLabel labelPorcentajeImpuestos;
    private JLabel labelMonto;
    private JLabel labelUsuario;
    private JTextField txtUsuario;
    private JLabel labelPuerto;
    private JTextField txtPuerto;
    private JLabel labelTNU;
    public JLabel labelNU;
    private JLabel labelTP;
    private JLabel labelP;

    /**
     * Se crea una ventana en la que se pueden escribir valores y devuelve el monto calculado
     */
    public VentanaChatCliente(){
        super("Chat Cliente");

        setContentPane(panel1);

        EnviarButton.addActionListener(new ActionListener() {
            /**
             * Sobre escribe el metodo actionPerformed
             *@Override
             *
             */
            public void actionPerformed(ActionEvent e) {

                int ValorUno = 0;
                int ValorDos = 0;
                int ValorTres = 0;
                int Monto = 0;
                int MontoUno = 0;
                int MontoDos =0;

                ValorUno = Integer.parseInt(txtValorProducto.getText());
                ValorDos = Integer.parseInt(txtPesoProducto.getText());
                ValorTres = Integer.parseInt(txtPorcentajeImpuestos.getText());

                MontoUno = (ValorUno*ValorTres/100);
                MontoDos = (int) (ValorDos* (0.15));

                Monto = MontoUno + MontoDos;

                labelMonto.setText("El monto es: " + Monto);

                txtValorProducto.setText("");
                txtPesoProducto.setText("");
                txtPorcentajeImpuestos.setText("");



                labelNU.setText("El usuario es: "+ txtUsuario.getText());
                labelP.setText("El Puerto es: "+ txtPuerto.getText());
            }
        });

        SalirButton.addActionListener(new ActionListener() {
            /**
             * Sobre escribe el metodo actionPerformed
             *@Override
             */
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });
    }
}
