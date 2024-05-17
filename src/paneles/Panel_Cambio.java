/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import mathebattles.Ataque;
import mathebattles.Criatura;
import static paneles.MFrame.cl;
import static paneles.MFrame.pl;

/**
 *
 * @author Aitor PC
 */
public class Panel_Cambio extends JLayeredPane{
    private final ImageIcon sprite4 = new ImageIcon("./recursos/electrico.png");
    private final Image s4 = sprite4.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    private final ImageIcon s4_ajustado = new ImageIcon(s4);
    
    private final ImageIcon sprite5 = new ImageIcon("./recursos/roca.png");
    private final Image s5 = sprite5.getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH);
    private final ImageIcon s5_ajustado = new ImageIcon(s5);
    
    private final ImageIcon sprite6 = new ImageIcon("./recursos/volador.png");
    private final Image s6 = sprite6.getImage().getScaledInstance(250, 250, Image.SCALE_SMOOTH);
    private final ImageIcon s6_ajustado = new ImageIcon(s6);
    
    private final ImageIcon f_cambio = new ImageIcon("./recursos/Cambio.png");
    private final Image img_cambio = f_cambio.getImage().getScaledInstance(800, 500, Image.SCALE_SMOOTH);
    private final ImageIcon f_cambio_ajustado = new ImageIcon(img_cambio);
    
    
    private static JLabel s_cam_1;
    private static JLabel s_cam_2;
    private static JLabel s_cam_3;
    private static JLabel l_cambio;
    
    private static JLabel at1;
    private static JLabel at2;
    private static JLabel at3;
    private static JLabel at4;
    
    
    private static Criatura al_ac;
    private static Ataque[] at_ac;
    
    JButton b_cambio_1 = new JButton("Cambio 1");
    JButton b_cambio_2 = new JButton("Cambio 2");
    JButton b_cambio_3 = new JButton("Cambio 3");
    JButton b_cambio_atras = new JButton("Atras");

    public Panel_Cambio() {
        colocarElementos();
        //actu_at();
    }
    
    public static void cambio(){
        l_cambio.setVisible(true);
        s_cam_1.setVisible(true);
        s_cam_2.setVisible(true);
        s_cam_3.setVisible(true);
    }
//    public static void actu_at(){
//        al_ac = Panel_Juego.getAl_ac();
//        at_ac = al_ac.getAtaques();
//        
//        for(Ataque at:at_ac){
//            System.out.println(at.toString());
//        }
//        at1 .setText(at_ac[0].toString());
//        at2 .setText(at_ac[1].toString());
//        at3 .setText(at_ac[2].toString());
//        at4 .setText(at_ac[3].toString());
//    }
    
    private void colocarElementos(){        
        s_cam_1 = new JLabel(s4_ajustado);
        s_cam_2 = new JLabel(s5_ajustado);
        s_cam_3 = new JLabel(s6_ajustado);
        
        l_cambio = new JLabel(f_cambio_ajustado);
        al_ac = Panel_Juego.getAl_ac();
        at_ac = al_ac.getAtaques();
        
        
        at1 = new JLabel(at_ac[0].toString());
        at2 = new JLabel(at_ac[1].toString());
        at3 = new JLabel(at_ac[2].toString());
        at4 = new JLabel(at_ac[3].toString());
        
        b_cambio_1.setBounds(50, 505, 300, 80);
        b_cambio_2.setBounds(400, 505, 300, 80);
        b_cambio_3.setBounds(50, 605, 300, 80);
        b_cambio_atras.setBounds(400, 605, 300, 80);
       
        at1.setBounds(250, 50, 300, 300);
        at2.setBounds(250, 100, 300, 300);
        at3.setBounds(250, 150, 300, 300);
        at4.setBounds(250, 200, 300, 300);
        
        b_cambio_1.setVisible(true);
        b_cambio_2.setVisible(true);
        b_cambio_3.setVisible(true);
        b_cambio_atras.setVisible(true);
        
        at1.setVisible(true);
        at2.setVisible(true);
        at3.setVisible(true);
        at4.setVisible(true);
        
        b_cambio_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_atras_pulsado(evt);
            }
        });
        b_cambio_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cambio_1_pulsado(evt);
            }
        });
        b_cambio_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cambio_2_pulsado(evt);
            }
        });
        b_cambio_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cambio_3_pulsado(evt);
            }
        });
        
        // Ajustar los tamaños de los JLabels al tamaño de sus imágenes
        
        s_cam_1.setBounds(20, 100, s6_ajustado.getIconWidth(), s6_ajustado.getIconHeight());
        s_cam_2.setBounds(290, 100, s6_ajustado.getIconWidth(), s6_ajustado.getIconHeight());
        s_cam_3.setBounds(520, 100, s6_ajustado.getIconWidth(), s6_ajustado.getIconHeight());

        l_cambio.setBounds(0, 0, f_cambio_ajustado.getIconWidth(), f_cambio_ajustado.getIconHeight());// Posición y tamaño del segundo JLabel

        
        
        // Añadir los JLabels al JLayeredPane con diferentes niveles

        //Cambios
        add(s_cam_1, 1);
        add(s_cam_2, 2);
        add(s_cam_3, 3);


        //HUD
        add(b_cambio_1,10);
        add(b_cambio_2,10);
        add(b_cambio_3,10);
        add(b_cambio_atras,10);
        
        add(at1,10);
        add(at2,10);
        add(at3,10);
        add(at4,10);
        

        add(l_cambio,100);

        
    }
    
    private void b_atras_pulsado(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        cl.show(pl, "Batalla");
    }
    private void b_cambio_1_pulsado(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Panel_Juego.setAl_ac(Panel_Juego.c1);
        Panel_Juego.setSpriteAl(1);

        cl.show(pl, "Batalla");
    } 
    private void b_cambio_2_pulsado(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Panel_Juego.setAl_ac(Panel_Juego.c2);
        Panel_Juego.setSpriteAl(2);

        cl.show(pl, "Batalla");
    } 
    private void b_cambio_3_pulsado(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        Panel_Juego.setAl_ac(Panel_Juego.c3);
        Panel_Juego.setSpriteAl(3);

        cl.show(pl, "Batalla");
    } 
}