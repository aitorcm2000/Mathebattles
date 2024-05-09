/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paneles;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        if (e.getActionCommand().equals("Pantalla 1")) {
            cardLayout.show(cardPanel, "Screen 1");
        } else if (e.getActionCommand().equals("Pantalla 2")) {
            cardLayout.show(cardPanel, "Screen 2");
        }
    }
    
    public FV() {
        setTitle("Cambiando entre pantallas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 700);
        
        // Creamos el CardLayout y el JPanel para contener las pantallas
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        
        // Creamos y añadimos las pantallas al JPanel
        MMenu screen1 = new MMenu();
        screen1.setBackground(Color.RED);
        cardPanel.add(screen1, "Screen 1");

        JPanel screen2 = new JPanel();
        screen2.setBackground(Color.BLUE);
        cardPanel.add(screen2, "Screen 2");

        // Creamos botones para cambiar entre las pantallas
        JButton button1 = new JButton("Pantalla 1");
        button1.addActionListener(this);
        JButton button2 = new JButton("Pantalla 2");
        button2.addActionListener(this);

        // Añadimos los botones al JFrame
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(button1);
        buttonPanel.add(button2);

        // Añadimos el JPanel del CardLayout y el JPanel de los botones al JFrame
        add(cardPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

}