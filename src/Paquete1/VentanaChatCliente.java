package Paquete1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaChatCliente extends JFrame{
    private JPanel panel1;
    private JTextField txtValorProducto;
    private JTextField txtPesoProducto;
    private JTextField txtPorcentajeImpuestos;
    private JButton enviarButton;
    private JButton salirButton;
    private JLabel labelValorProducto;
    private JLabel labelPesoProducto;
    private JLabel labelPorcentajeImpuestos;
    private JLabel labelResultado;


    private JMenuBar menuBar;
    private JMenu archivo;
    private JMenuItem salir;


    public VentanaChatCliente(){
        super("Chat Cliente");

        setContentPane(panel1);


        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });


        enviarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int ValorUno = 0;
                int ValorDos = 0;
                int ValorTres = 0;
                int Resultado = 0;
                int MontoUno = 0;
                int MontoDos =0;

                ValorUno = Integer.parseInt(txtValorProducto.getText());
                ValorDos = Integer.parseInt(txtPesoProducto.getText());
                ValorTres = Integer.parseInt(txtPorcentajeImpuestos.getText());

                MontoUno = (ValorUno*ValorTres/100);
                MontoDos = (int) (ValorDos* (0.15));



                Resultado = MontoUno + MontoDos;

                labelResultado.setText("El reultado es: " + Resultado);

                txtValorProducto.setText("");
                txtPesoProducto.setText("");
                txtPorcentajeImpuestos.setText("");


            }
        });
    }


}
