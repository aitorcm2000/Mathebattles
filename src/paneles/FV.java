/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author aitor
 */
public class FV extends JFrame implements ActionListener {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public void actionPerformed(ActionEvent e) {
        // Mostramos la pantalla correspondiente al botón presionado
        if (e.getActionCommand().equals("Atacar")) {
            cardLayout.show(cardPanel, "Atacar");
        } else if (e.getActionCommand().equals("Cambiar")) {
            cardLayout.show(cardPanel, "Cambiar");
        } else if (e.getActionCommand().equalsIgnoreCase("Log In")){
            cardLayout.show(cardPanel, "Log In");
        }
    }
    
    public FV() {
        setTitle("MatheBattles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 700);
        
        // Creamos el CardLayout y el JPanel para contener las pantallas
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        
        
        Imagenes panel = new Imagenes("./Recurso/CampoBatalla.png");
        panel.setLayout(new BorderLayout());
        cardPanel.add(panel, "Atacar");
        

        JPanel screen2 = new JPanel();
        screen2.setBackground(Color.BLUE);
        cardPanel.add(screen2, "Cambiar");

        // Creamos botones para cambiar entre las pantallas
        JButton button1 = new JButton("Atacar");
        button1.addActionListener(this);
        JButton button2 = new JButton("Cambiar");
        button2.addActionListener(this);
        Dimension botonBatallaSize = new Dimension(380, 100);
        button1.setPreferredSize(botonBatallaSize);
        button2.setPreferredSize(botonBatallaSize);

        // Añadimos los botones al JFrame
        JPanel batallaPanel = new JPanel(new GridLayout(1, 2,5,0));
        batallaPanel.add(button1);
        batallaPanel.add(button2);

        // Añadimos el JPanel del CardLayout y el JPanel de los botones al JFrame
        add(cardPanel, BorderLayout.CENTER);
        add(batallaPanel, BorderLayout.SOUTH);
    }

}