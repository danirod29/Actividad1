/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainView;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Daniel Rodriguez
 */
public class MainViewTemplate extends JFrame {

    private JTextField texto;

    public MainViewTemplate() {
        //super("Hola mundo"); // primero
        this.mostrar();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200, 500);
        this.setTitle("Hola mundo");
        this.setLocationRelativeTo(null);
        //this.setUndecorated(true);
        this.getContentPane().setBackground(Color.BLUE);
        this.setLayout(null);
        this.setVisible(true); //ultimo

    }

    public void mostrar() {
        String mensaje = "Hola";
        System.out.println(mensaje);
    }

}
