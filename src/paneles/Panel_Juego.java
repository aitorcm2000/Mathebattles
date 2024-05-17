/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JProgressBar;
import mathebattles.Ataque;
import mathebattles.Criatura;
import mathebattles.Main;
import mathebattles.Tipo;
import static paneles.MFrame.cl;
import static paneles.MFrame.pl;



/**
 *
 * @author aitor
 */
public class Panel_Juego extends JLayeredPane{
    private static Random rng = new Random();
    
    public static Ataque a1 = new Ataque("FlamaIntegral", 90, 1, 1);
    public static Ataque a2 = new Ataque("RáfagaVectorial", 60, 1, 4);
    public static Ataque a3 = new Ataque("QuemaduraLogarítmica", 95, 1, 1);
    public static Ataque a4 = new Ataque("LlamaTrigonométrica", 100, 1, 1);
    
    public static Ataque[] atc1 = {a1,a2,a3,a4};
    
    public static Criatura c1 = new Criatura("PyroToro", 200, 80, 60, Tipo.FUEGO, 70,atc1);
    public static Criatura c2 = new Criatura("Mathsaurio", 180, 70, 50, Tipo.PLANTA, 65,atc1);
    public static Criatura c3 = new Criatura("Aguatron", 190, 75, 55, Tipo.AGUA, 68,atc1);
    public static Criatura c4 = new Criatura("Voltalcula", 210, 85, 65, Tipo.ELECTRICO, 72,atc1);
    public static Criatura c5 = new Criatura("Rockosaurio", 185, 72, 58, Tipo.ROCA, 66,atc1);
    public static Criatura c6 = new Criatura("Algebird", 195, 82, 62, Tipo.VOLADOR, 69,atc1);
    
    //Declaracion de imagen de fondo
    private final ImageIcon fondo = new ImageIcon("./recursos/CampoBatalla.png");
    private final Image img1 = fondo.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH);
    private final ImageIcon fondo_ajustado = new ImageIcon(img1);
    
    
    
    //Declaracion de sprite de las criaturas
    private final ImageIcon sprite1 = new ImageIcon("./recursos/fuego.png");
    private final Image s1 = sprite1.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    private final ImageIcon s1_ajustado = new ImageIcon(s1);
    
    private final ImageIcon sprite2 = new ImageIcon("./recursos/planta.png");
    private final Image s2 = sprite2.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    private final ImageIcon s2_ajustado = new ImageIcon(s2);
    
    private final ImageIcon sprite3 = new ImageIcon("./recursos/agua.png");
    private final Image s3 = sprite3.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    private final ImageIcon s3_ajustado = new ImageIcon(s3);
    
    private final ImageIcon sprite4 = new ImageIcon("./recursos/electrico.png");
    private final Image s4 = sprite4.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    private final ImageIcon s4_ajustado = new ImageIcon(s4);
    
    private final ImageIcon sprite5 = new ImageIcon("./recursos/roca.png");
    private final Image s5 = sprite5.getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH);
    private final ImageIcon s5_ajustado = new ImageIcon(s5);
    
    private final ImageIcon sprite6 = new ImageIcon("./recursos/volador.png");
    private final Image s6 = sprite6.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    private final ImageIcon s6_ajustado = new ImageIcon(s6);
    
    //Declaracion de los paneles de vida
    private final ImageIcon cartel_enemigo = new ImageIcon("./recursos/HP_Oponente.png");
    private final Image c_en = cartel_enemigo.getImage().getScaledInstance(315, 100, Image.SCALE_SMOOTH);
    private final ImageIcon c1_ajustado = new ImageIcon(c_en);
    
    private final ImageIcon cartel_aliado = new ImageIcon("./recursos/HP_Aliado.png");
    private final Image c_al = cartel_aliado.getImage().getScaledInstance(315, 100, Image.SCALE_SMOOTH);
    private final ImageIcon c2_ajustado = new ImageIcon(c_al);
    
    //Declaracion de las Label que contienen sprites
    private static JLabel s_en_1;
    private static JLabel s_en_2;
    private static JLabel s_en_3;
    
    private static JLabel s_al_1;
    private static JLabel s_al_2;
    private static JLabel s_al_3;
    
    private static JLabel l_fondo;
    private static JLabel c_enemigo;
    private static JLabel c_aliado;
    
    public static Criatura en_ac;
    public static Criatura al_ac;
    private static JLabel nom_en;
    private static JLabel nom_al;
    
    JLabel hp_t_al;
    
    private static JProgressBar vidaEn= new JProgressBar();
    private static JProgressBar vidaAl= new JProgressBar();
    
    
    JButton b_atacar = new JButton("Atacar");
    JButton b_cambiar = new JButton("Cambiar");

    public static void setEn_ac(Criatura en_ac) {
        Panel_Juego.en_ac = en_ac;
    }

    public static void setAl_ac(Criatura al_ac) {
        Panel_Juego.al_ac = al_ac;
    }

    public static Criatura getEn_ac() {
        return en_ac;
    }

    public static Criatura getAl_ac() {
        return al_ac;
    }

    
    public Panel_Juego() {
        al_ac=c1;
        en_ac=c3;
        colocarElementos();
        setSpriteEn(rng.nextInt(1, 4));
        setSpriteAl(rng.nextInt(1, 4));
    }

    private void colocarElementos(){
        s_en_1 = new JLabel(s1_ajustado);
        s_en_2 = new JLabel(s2_ajustado);
        s_en_3 = new JLabel(s3_ajustado);
        
        s_al_1 = new JLabel(s4_ajustado);
        s_al_2 = new JLabel(s5_ajustado);
        s_al_3 = new JLabel(s6_ajustado);
        
        l_fondo = new JLabel(fondo_ajustado);
        c_enemigo = new JLabel(c1_ajustado);
        c_aliado = new JLabel(c2_ajustado);
        
        nom_en = new JLabel("Place holder enemigo");
        nom_al = new JLabel("Place holder aliado");
        nom_en.setBounds(120, 80, 100, 15);
        nom_al.setBounds(610, 520, 100, 15);
        
        vidaEn.setBounds(133, 106, 132, 14);
        vidaAl.setBounds(634, 538, 132, 11);
        
        b_atacar.setBounds(50, 605, 300, 100);
        b_cambiar.setBounds(400, 605, 300, 100);
        
        b_atacar.setVisible(true);
        b_cambiar.setVisible(true);
        
        b_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cambiar_pulsado(evt);
            }
        });
        
        // Ajustar los tamaños de los JLabels al tamaño de sus imágenes
        
        s_en_1.setBounds(475, 150, s1_ajustado.getIconWidth(), s1_ajustado.getIconHeight());
        s_en_2.setBounds(475, 180, s2_ajustado.getIconWidth(), s2_ajustado.getIconHeight());
        s_en_3.setBounds(475, 180, s3_ajustado.getIconWidth(), s3_ajustado.getIconHeight());
        
        s_al_1.setBounds(80, 405, s4_ajustado.getIconWidth(), s4_ajustado.getIconHeight());
        s_al_2.setBounds(100, 350, s5_ajustado.getIconWidth(), s5_ajustado.getIconHeight());
        s_al_3.setBounds(80, 360, s6_ajustado.getIconWidth(), s6_ajustado.getIconHeight());
                
        l_fondo.setBounds(0, 0, fondo_ajustado.getIconWidth(), fondo_ajustado.getIconHeight());
        c_enemigo.setBounds(5, 40, c1_ajustado.getIconWidth(), c1_ajustado.getIconHeight());
        c_aliado.setBounds(475, 485, c2_ajustado.getIconWidth(), c2_ajustado.getIconHeight());
        
        
        // Añadir los JLabels al JLayeredPane con diferentes niveles
        
        //Enemigos
        add(s_en_1, 10);
        add(s_en_2, 10);
        add(s_en_3, 10);
        //Aliados
        add(s_al_1, 11); 
        add(s_al_2, 11);
        add(s_al_3, 11);
        
        s_en_1.setVisible(false);
        s_en_2.setVisible(false);
        s_en_3.setVisible(false);
        s_al_1.setVisible(false);
        s_al_2.setVisible(false);
        s_al_3.setVisible(false);
        
        //HUD
        add(b_atacar,1);
        add(b_cambiar,1);

        add(nom_al,5);
        add(nom_en,5);
        add(vidaEn,7);
        add(vidaAl,7);
        add(c_enemigo,10);
        add(c_aliado,10);
        add(l_fondo, 100); // Nivel 2 (encima del nivel 1)
    }
    
    
    /**
     * Boton de Cambiar
     * @param evt 
     */
    private void b_cambiar_pulsado(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        cl.show(pl, "Cambio");
    } 

    
    public static void setSpriteEn(int n){
        s_en_1.setVisible(false);
        s_en_2.setVisible(false);
        s_en_3.setVisible(false);
        
        switch (n) {
            case 1:
                setEn_ac(c1);
                s_en_1.setVisible(true); 
            break;
            case 2:
                setEn_ac(c2);
                s_en_2.setVisible(true);
            break;
            case 3:
                setEn_ac(c3);
                s_en_3.setVisible(true);
            break;
        }
        
        setLimitVidaEn(getEn_ac());
        setVidaEn(en_ac.getVida_act());
        nom_en.setText(en_ac.getNombre());
    }
    
    public static void setSpriteAl(int n){
        s_al_1.setVisible(false);
        s_al_2.setVisible(false);
        s_al_3.setVisible(false);
        
        switch (n) {
            case 1:
               setAl_ac(c4);
               s_al_1.setVisible(true); 
            break;
            case 2:
                setAl_ac(c5);
                s_al_2.setVisible(true);
            break;
            case 3:
                setAl_ac(c6);
                s_al_3.setVisible(true);
            break;
        }
        
        setLimitVidaAl(en_ac);
        setVidaAl(en_ac.getVida_act());
        nom_al.setText(al_ac.getNombre());
    }
    
    public static void setLimitVidaEn(Criatura c){
        vidaEn.setMinimum(0);
        vidaEn.setMaximum(c.getVida());
    }
    
    public static void setLimitVidaAl(Criatura c){
        vidaAl.setMinimum(0);
        vidaAl.setMaximum(c.getVida());
    }
    
    public static void setVidaEn(int vida){
        vidaEn.setValue(vida);
    }
    
    public static void setVidaAl(int vida){
        vidaAl.setValue(vida);
    }
    public static void bajaVidaEn(int daño,Criatura c){
        int vida_actual=c.getVida_act();
        for(int i=daño;i>0;i--){
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
            vida_actual--;
            paneles.Panel_Juego.setVidaEn(vida_actual);
        }
        Criatura.Daño(daño);
    }
    
    public static void bajaVidaAl(int daño,Criatura c){
        int vida_actual=c.getVida_act();
        for(int i=daño;i>0;i--){
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                System.err.println(ex.getMessage());
            }
            vida_actual--;
            paneles.Panel_Juego.setVidaAl(vida_actual);
        }
        Criatura.Daño(daño);
    }
    
}