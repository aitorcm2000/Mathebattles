/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

import java.util.logging.Level;
import java.util.logging.Logger;
import paneles.MMenu;

/**
 *
 * @author aitor
 */
public class Hilo2 implements Runnable {
    public void run(){
        int sec=0;
        int aux=0;
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
            }
            sec++;
            MMenu.TITULO.setText(sec+" s");
        }
    }
}
