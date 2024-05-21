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
import mathebattles.Archivos;
import mathebattles.Criatura;
import mathebattles.Usuario;

import static paneles.MFrame.cl;
import static paneles.MFrame.pl;
import static paneles.Panel_Juego.getAl_ac;
import static paneles.Panel_Juego.getEn_ac;

/**
 *
 * @author aitor
 */
public class Panel_ataques extends JLayeredPane{
    
    private final ImageIcon f_cambio = new ImageIcon("./recursos/Cambio.png");
    private final Image img_cambio = f_cambio.getImage().getScaledInstance(800, 500, Image.SCALE_SMOOTH);
    private final ImageIcon f_cambio_ajustado = new ImageIcon(img_cambio);
    
    private static JLabel at1= new JLabel("Cosa");
        
    private static Criatura al_ac;
    private static Criatura en_ac;
    
    private static JButton b_at1 = new JButton("Opcion1");
    private static JButton b_at2 = new JButton("Opcion2");
    private static JButton b_at3 = new JButton("Opcion3");
    private static JButton b_at4 = new JButton("Opcion4");

    public Panel_ataques() {
        
        colocarElementos();
        colocarAtaques();
        actu_at();
    }
    
    
    
    private void colocarElementos (){
        b_at1.setBounds(50, 505, 300, 80);
        b_at2.setBounds(400, 505, 300, 80);
        b_at3.setBounds(50, 605, 300, 80);
        b_at4.setBounds(400, 605, 300, 80);
        
       
        b_at1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_at1_pulsado(evt);
            }
        });
        b_at2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_at2_pulsado(evt);
            }
        });
        b_at3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_at3_pulsado(evt);
            }
        });
        b_at4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_at4_pulsado(evt);
            }
        });
  
    }
    
    /**
     * Al pulsar el boton se ejecuta el ataque introducido
     * @param evt 
     */
    private void b_at1_pulsado(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        al_ac = Panel_Juego.eq_al[getAl_ac()];
        en_ac = Panel_Juego.eq_en[getEn_ac()];
        int resultado = Panel_Juego.mates.getResultado();
        int respuesta = Integer.parseInt(b_at1.getText());
        boolean correccion = Panel_Juego.mates.respuesta(resultado, respuesta);

        if(correccion){
            Panel_Juego.bajaVidaEn(50, en_ac);
            Panel_Juego.bajaVidaAl(25, en_ac);
            Usuario.us_act.setScore();
        }else{
            Panel_Juego.bajaVidaAl(50, en_ac);
        }
        
        Panel_Juego.mates.resultado(resultado,respuesta ,correccion );
        cambioMuerteAl();
        if(en_ac.getVida_act()<=0){
            Resultados.TA_setText(Archivos.leerResultados());
            cl.show(pl, "Resultados");
        }else{
            cl.show(pl, "Batalla");
        }
    } 
    private void b_at2_pulsado(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        al_ac = Panel_Juego.eq_al[getAl_ac()];
        en_ac = Panel_Juego.eq_en[getEn_ac()];
        int resultado = Panel_Juego.mates.getResultado();
        int respuesta = Integer.parseInt(b_at1.getText());
        boolean correccion = Panel_Juego.mates.respuesta(resultado, respuesta);
        

        if(Integer.parseInt(b_at2.getText())==Panel_Juego.mates.getResultado()){
            Panel_Juego.bajaVidaEn(50, en_ac);
            Panel_Juego.bajaVidaAl(25, en_ac);
            Usuario.us_act.setScore();
        }else{
            Panel_Juego.bajaVidaAl(50, en_ac);
        }
        cambioMuerteAl();
        Panel_Juego.mates.resultado(resultado,respuesta ,correccion );
        if(en_ac.getVida_act()<=0){
            Resultados.TA_setText(Archivos.leerResultados());
            cl.show(pl, "Resultados");
        }else{
            cl.show(pl, "Batalla");
        }
    } 
    private void b_at3_pulsado(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        al_ac = Panel_Juego.eq_al[getAl_ac()];
        en_ac = Panel_Juego.eq_en[getEn_ac()];
        int resultado = Panel_Juego.mates.getResultado();
        int respuesta = Integer.parseInt(b_at1.getText());
        boolean correccion = Panel_Juego.mates.respuesta(resultado, respuesta);

        if(Integer.parseInt(b_at3.getText())==Panel_Juego.mates.getResultado()){
            Panel_Juego.bajaVidaEn(50, en_ac);
            Panel_Juego.bajaVidaAl(25, en_ac);
            Usuario.us_act.setScore();
        }else{
            Panel_Juego.bajaVidaAl(50, en_ac);
        }
        Panel_Juego.mates.resultado(resultado,respuesta ,correccion );
        cambioMuerteAl();
        if(en_ac.getVida_act()<=0){
            Resultados.TA_setText(Archivos.leerResultados());
            cl.show(pl, "Resultados");
        }else{
            cl.show(pl, "Batalla");
        }
    } 
    private void b_at4_pulsado(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        al_ac = Panel_Juego.eq_al[getAl_ac()];
        en_ac = Panel_Juego.eq_en[getEn_ac()];
        int resultado = Panel_Juego.mates.getResultado();
        int respuesta = Integer.parseInt(b_at1.getText());
        boolean correccion = Panel_Juego.mates.respuesta(resultado, respuesta);
        
        if(Integer.parseInt(b_at4.getText())==Panel_Juego.mates.getResultado()){
            Panel_Juego.bajaVidaEn(50, en_ac);
            Panel_Juego.bajaVidaAl(25, en_ac);
            Usuario.us_act.setScore();
        }else{
            Panel_Juego.bajaVidaAl(50, en_ac);
        }
        Panel_Juego.mates.resultado(resultado,respuesta ,correccion );
        cambioMuerteAl();
        if(en_ac.getVida_act()<=0){
            Resultados.TA_setText(Archivos.leerResultados());
            cl.show(pl, "Resultados");
        }else{
            cl.show(pl, "Batalla");
        }
        
    }
    /**
     * Actualiza el contenido de los botones y los labels de ataques.toString() 
     * que muestran las estadisticas de los mismos.
     * 
     * Debe usarse cada vez que se abre el menu de ataques, para que esten acorde
     * a la criatura que esta en el campo.
     */
    public static void actu_at(){        
        at1 .setText("");
    }
    
    
    public void colocarAtaques(){
        at1.setBounds(250, 50, 300, 300);        
        at1.setVisible(true);        
        add(at1,10);
        
        add(b_at1,10);
        add(b_at2,10);
        add(b_at3,10);
        add(b_at4,10);                

        b_at1.setVisible(true);
        b_at2.setVisible(true);
        b_at3.setVisible(true);
        b_at4.setVisible(true);
    }

    public static void setAt1(String s) {
        Panel_ataques.at1.setText(s);
    }

    public static void setB_at1(String s) {
        Panel_ataques.b_at1.setText(s);
    }

    public static void setB_at2(String s) {
        Panel_ataques.b_at2.setText(s);
    }

    public static void setB_at3(String s) {
        Panel_ataques.b_at3.setText(s);
    }

    public static void setB_at4(String s) {
        Panel_ataques.b_at4.setText(s);
    }
    
    public static void cambioMuerteAl(){
        if(al_ac.getVida_act()<=0){
            int contador=0;
            for(int i = 0;i<Panel_Juego.getEq_al().length;i++){
                Criatura c = Panel_Juego.getEq_al()[i];
                System.out.println(c);
                if(c.getVida_act()>0){
                    Panel_Juego.setSpriteAl(i);
                }
                contador++;
            }
            if (contador==0){
                System.out.println("Moriste");
            }
        }
    }
    
}
