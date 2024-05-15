/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author aitor
 */
public class FV extends JPanel {
    ImageIcon img_fondo;
    JLabel L_Fondo;
    
    public FV() {
        this.setSize(800, 700);
        img_fondo = new ImageIcon("/recurso/Campo_Batalla.png");
        L_Fondo = new JLabel(img_fondo);
        L_Fondo.setBounds(0, 700, this.getWidth(), this.getHeight());
        add(L_Fondo);
        L_Fondo.setVisible(true);
        this.setVisible(true);
    }
    
}