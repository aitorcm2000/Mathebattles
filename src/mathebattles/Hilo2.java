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
        
        while(true){
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
            }
//            sec++;
//            if(sec>=60){
//                sec=0;
//                min++;
//            }
        }
    }

}
