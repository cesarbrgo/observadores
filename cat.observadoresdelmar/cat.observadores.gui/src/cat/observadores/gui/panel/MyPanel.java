package cat.observadores.gui.panel;
import Entitites.*;
import Utils.ControlDatos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * panel
 * La clase Mypanel que exten Jpanel es el panel de visualització de l'usuari, aqui treballarem la seva visualització
 * i les accions que fara en base al comportament de l'usuari
 * @author César Bravo
 * @version 11.0.14.1, 2022/05/28
 */
public class MyPanel extends JPanel {
    private final String BENVINGUDA="*****************Bienvenido! Registra tu hallazgo*****************";
    private final String FECHA="Fecha de observación";

    private JButton jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JTextField jcomp4;
    private JLabel jcomp5;
    private JComboBox jcomp6;
    private JLabel jcomp7;
    private JTextField jcomp8;
    private JLabel jcomp9;
    private JLabel jcomp10;
    private JLabel jcomp11;
    private JLabel jcomp12;
    private JComboBox jcomp13;
    private JTextField jcomp14;
    private JTextField jcomp15;
    private JTextField jcomp16;
    private JLabel jcomp17;
    private JLabel jcomp18;
    private JLabel jcomp19;
    private JLabel jcomp20;
    private JLabel jcomp21;
    private JLabel jcomp22;

    private JTextField jcomp23;
    private JTextField jcomp24;
    private JTextField jcomp25;
    private static final Color BLUE=new Color(201,204, 255);
    private static final Color GREEN=new Color(108, 226, 5);


    /**
     * Aquest panel Mypanel conté tots els components per a la visualització de cara a l'usuari
     *
     */
    public MyPanel() {
        //construct preComponents
        String[] jcomp6Items = {"Peces Mediterraneos", "Peces exoticos", "Medusas", "Crustaceos Decápodos", "Aves Marinas", "Signatidos", "Nacras", "Tiburones y rallas", "Corales", "Algas invasoras"};
        String[] jcomp13Items = {"Arena", "Rocas", "Praderas Marinas", "No determinado"};

        //construct components
        //Text field
        jcomp1 = new JButton ("Enviar");
        jcomp2 = new JLabel (FECHA);
        jcomp3 = new JLabel (BENVINGUDA);
        jcomp4 = new JTextField (5);
        jcomp5 = new JLabel ("Que has avistado?");
        //desplegable JComboBox
        jcomp6 = new JComboBox (jcomp6Items);
        jcomp6.setSelectedIndex(-1);
        jcomp7 = new JLabel ("estado");
        jcomp8 = new JTextField (5);
        jcomp9 = new JLabel ("Latitud");
        jcomp10 = new JLabel ("Longitud");
        jcomp11 = new JLabel ("Especie");
        jcomp12 = new JLabel ("Habitat");
        jcomp13 = new JComboBox (jcomp13Items);
        jcomp13.setSelectedIndex(-1);
        jcomp14 = new JTextField (5);
        jcomp15 = new JTextField (5);
        jcomp16 = new JTextField (5);
        jcomp17 = new JLabel ("Profundidad");
        jcomp18 = new JLabel ("m");
        jcomp19 = new JLabel ("Abundancia");
        jcomp20 = new JLabel ("Tamaño");
        jcomp21 = new JLabel ("Tamaño");
        jcomp22 = new JLabel ("cm");
        jcomp23 = new JTextField (5);
        jcomp24 = new JTextField (5);
        jcomp25 = new JTextField (5);

        /**
         * Set perfered size crea unes dimensions, i el setbackground color afeixeix un color de fons
         *
         */
        //adjust size and set layout
        setPreferredSize (new Dimension (784, 454));
        setLayout (null);
        setBackground(BLUE);


        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);
        add (jcomp7);
        add (jcomp8);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);
        add (jcomp15);
        add (jcomp16);
        add (jcomp17);
        add (jcomp18);
        add (jcomp19);
        add (jcomp20);
        add (jcomp21);
        add (jcomp22);
        add (jcomp23);
        add (jcomp24);
        add (jcomp25);

        /**
         * assignem la possició absoluta
         *
         */

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (285, 335, 140, 20);
        jcomp2.setBounds (60, 55, 139, 25);
        jcomp3.setBounds (200, 15, 489, 25);
        jcomp4.setBounds (60, 85, 116, 25);
        jcomp5.setBounds (225, 50, 112, 25);
        jcomp6.setBounds (225, 80, 163, 25);
        jcomp7.setBounds (440, 55, 144, 25);
        jcomp8.setBounds (440, 80, 155, 25);
        jcomp9.setBounds (70, 135, 100, 25);
        jcomp10.setBounds (220, 135, 100, 25);
        jcomp11.setBounds (370, 130, 100, 25);
        jcomp12.setBounds (510, 130, 100, 25);
        jcomp13.setBounds (510, 160, 100, 25);
        jcomp14.setBounds (370, 160, 100, 25);
        jcomp15.setBounds (220, 160, 100, 25);
        jcomp16.setBounds (65, 160, 100, 25);
        jcomp17.setBounds (65, 215, 100, 25);
        jcomp18.setBounds (170, 240, 42, 25);
        jcomp19.setBounds (235, 215, 100, 25);
        jcomp20.setBounds (-290, 175, 100, 25);
        jcomp21.setBounds (410, 215, 100, 25);
        jcomp22.setBounds (515, 240, 100, 25);
        jcomp23.setBounds (65, 240, 100, 25);
        jcomp24.setBounds (235, 240, 100, 25);
        jcomp25.setBounds (410, 240, 100, 25);

        jcomp1.addActionListener(this::enviar);}
    /**
     * Enviar
     * Aquest metode es el comprtament un cop el client apreta el botó d'enviament de les dades, s'agafaran les dades
     * introduides per l'usuari als diferents camps per tal d'enviarlos a la base de dades, tambe es printaran per pantalla
     * per a veure els valors introduits, i en base a la selecció de tipus d'animal que es vol seleccionar instanciarem
     * un objecte o un altre
     * @return void
     */
    private void enviar(ActionEvent actionEvent) {
        //coger valores del selector
        String selecanimal= (String) jcomp6.getSelectedItem();
        System.out.printf(selecanimal);

        String selechabitat= (String) jcomp13.getSelectedItem();
        System.out.printf(selechabitat);

        //introduccion de datos por el textfield
        String fechadeobservacion= jcomp4.getText();
        System.out.printf(fechadeobservacion);

        String estado= jcomp8.getText();
        System.out.printf(estado);

        String especie= jcomp14.getText();
        System.out.printf(especie);

        String longitud= jcomp15.getText();
        System.out.printf(longitud);

        String latitud= jcomp16.getText();
        System.out.printf(latitud);

        String profundidad= jcomp23.getText();
        System.out.printf(profundidad);

        String abundancia= jcomp24.getText();
        System.out.printf(abundancia);

        String sizefish= jcomp25.getText();
        System.out.printf(sizefish);

        int selecanimalo= jcomp6.getSelectedIndex();
        System.out.printf(selecanimal);


        switch(selecanimalo){
            case 0:
                PecesMediterraneos pec = new PecesMediterraneos(fechadeobservacion, latitud,  longitud,  especie, profundidad, abundancia, sizefish, selechabitat);
            case 1:
                PecesExoticos ex = new PecesExoticos(fechadeobservacion, latitud,  longitud,  especie, profundidad, abundancia, sizefish, selechabitat);
            case 2:
                Medusas med = new Medusas(fechadeobservacion, latitud,  longitud,  especie, profundidad, abundancia, sizefish, selechabitat);
            case 3:
                Crustaceos crus = new Crustaceos(fechadeobservacion, latitud,  longitud,  especie, profundidad, abundancia, sizefish, selechabitat);
            case 4:
                Aves ave = new Aves(fechadeobservacion, latitud,  longitud,  especie, profundidad, abundancia, sizefish, selechabitat);
            case 5:
                Signatidos sig = new Signatidos(fechadeobservacion, latitud,  longitud,  especie, profundidad, abundancia, sizefish, selechabitat);
            case 6:
                Nacras nac = new Nacras(fechadeobservacion, latitud,  longitud,  especie, profundidad, abundancia, sizefish, selechabitat);
            case 7:
                Tiburones tib = new Tiburones(fechadeobservacion, latitud,  longitud,  especie, profundidad, abundancia, sizefish, selechabitat);
            default:

        }
        /**
         * aqui creem un objecte controlador de datos i utilitzarem la funció insertar on l'hi pasarem els parametres en la funcio insertar de l'objecte.
         *
         */
        ControlDatos con=new ControlDatos();
        con.insertar(fechadeobservacion, latitud, longitud, especie, profundidad, abundancia, sizefish, selecanimal, selechabitat,  estado );
        }

  //  int selecanimalo= jcomp6.getSelectedIndex();



}
