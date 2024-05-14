/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author aitor
 */
public class MFrame extends JFrame{
    public static CardLayout cl;
    public static JPanel pl;
    
    public MFrame(){
        setTitle("MatheBattles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 700);
        
        // Creamos el CardLayout y el JPanel para contener las pantallas
        cl = new CardLayout();
        pl = new JPanel(cl);
        
        MMenu mm = new MMenu();
        pl.add(mm,"Menu");
        Puntuaciones sc = new Puntuaciones();
        pl.add(sc,"Score");
        LogScr ls = new LogScr();
        pl.add(ls,"LogIn");
        
        add(pl, BorderLayout.CENTER);
        
        
    }
}
