/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;


/**
 *
 * @author aitor
 */
public class FV extends JLayeredPane{
    ImageIcon img_fondo= new ImageIcon("CampoBatalla.png");
    JLabel L_Fondo;
    ImageIcon icono1 = new ImageIcon("./recursos/CampoBatalla.png");
    
    Image img = icono1.getImage().getScaledInstance(800, 700, Image.SCALE_SMOOTH);
    ImageIcon icono2 = new ImageIcon(img);
    
    
    
    public FV() {
        JButton b1 = new JButton("Atacar");
        JButton b2 = new JButton("Cambiar");
        b1.setBounds(0, 500, 200, 100);
        b2.setBounds(250, 500, 200, 100);
        add(b1,1);add(b2,1);
        b1.setVisible(true);b2.setVisible(true);
        
        // Crear los JLabels para las imágenes
        JLabel label1 = new JLabel(icono1);
        JLabel label2 = new JLabel(icono2);
        
        // Ajustar los tamaños de los JLabels al tamaño de sus imágenes
        label1.setBounds(0, 0, icono1.getIconWidth(), icono1.getIconHeight());
        label2.setBounds(0, 0, icono2.getIconWidth(), icono2.getIconHeight()); // Posición y tamaño del segundo JLabel
        
        // Añadir los JLabels al JLayeredPane con diferentes niveles
        add(label1, 1); // Nivel 1
        add(label2, 100); // Nivel 2 (encima del nivel 1)
        
    }

//    //Se crea un método cuyo parámetro debe ser un objeto Graphics
//    public void paint(Graphics grafico) {
//        Dimension height = getSize();
//
//        //Se selecciona la imagen que tenemos en el paquete de la //ruta del programa
//        ImageIcon Img = new ImageIcon("CampoBatalla.png"); 
//
//        //se dibuja la imagen que tenemos en el paquete Images //dentro de un panel
//        grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
//
//        setOpaque(false);
//        super.paintComponent(grafico);
//    }
//    
}