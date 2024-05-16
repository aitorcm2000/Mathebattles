/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathebattles;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import paneles.FV;
import paneles.MFrame;


/*
Si el usuario acierta la cuenta en un tiempo limitado deberia 
hacer daño critico o defensa critica.
  o En caso del ataque no acertar es menos daño, acertar es daño normal y
    acierto critico es más daño
  o En caso de defensa no acertar es daño normal, acertar es reducir el daño,
    acierto critico es anular el daño
El acierto critico deberia venir de acertar en un tiempo reducido
*/

/**
 *
 * @author aitor
 */
public class Main {
public static MFrame mf = new MFrame();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                mf.setVisible(true);
            }
        });
        Hilo1 h1 = new Hilo1();
        Hilo2 h2 = new Hilo2();
        Thread t1 = new Thread (h1);
        Thread t2 = new Thread (h2);
        t1.start();t2.start();
        
        
//        JFrame frame = new JFrame("Ejemplo de JLabel con Imagen");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 300);
//        
//        // Crear un JPanel
//        JPanel panel = new JPanel();
//        
//        // Cargar la imagen
//        ImageIcon imagen = new ImageIcon("CampoBatalla.png");
//        
//        // Crear el JLabel y pasar la imagen
//        JLabel etiquetaConImagen = new JLabel(imagen);
//        
//        // Añadir el JLabel al JPanel
//        panel.add(etiquetaConImagen);
//        
//        // Añadir el JPanel al JFrame
//        frame.add(panel, BorderLayout.CENTER);
//        
//        // Hacer visible el JFrame
//        frame.setVisible(true);
    }
    
}
