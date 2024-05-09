/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathebattles;

import javax.swing.SwingUtilities;
import paneles.FV;
import paneles.FrameVentana;
import paneles.MMenu;
import paneles.Principal;

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

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                FV fv = new FV();
                fv.setVisible(true);
            }
        });
    }
    
}
