package cat.observadores.ui.controladora;

import Utils.Connectat;
import cat.observadores.gui.panel.MyPanel;

import javax.swing.*;

/**
 * Aplication
 * La clase apliction conté el cos d'accions d'execució del programa
 * @author César Bravo
 * @version 11.0.14.1, 2022/05/28
 */
public class Aplicacion {
    public static void main (String[] args) {
    JFrame frame = new JFrame ("MyPanel");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add (new MyPanel());
    frame.pack();
    frame.setVisible (true);
    Connectat.Conexio();

        //System.out.printf(varia);
}
}


