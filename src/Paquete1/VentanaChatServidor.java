package Paquete1;

import javax.swing.*;

public class VentanaChatServidor extends JFrame {
    private JPanel panel1;
    private JTextField txtValorProducto;
    private JTextField txtPesoProducto;
    private JTextField txtPorcentajeImpuestos;
    private JButton enviarButton;
    private JButton salirButton;
    private JLabel labelValorProducto;
    private JLabel labelPesoProducto;
    private JLabel labelPorcentajeImpuestos;
    private JLabel labelMonto;

    public VentanaChatServidor(){
        super("Chat Servidor");

        setContentPane(panel1);
    }
}
