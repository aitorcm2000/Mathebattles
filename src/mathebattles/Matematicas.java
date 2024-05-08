/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

import java.util.Random;

/**
 *
 * @author aitor
 */
public class Matematicas {
    Random r= new Random();
    
    public int genSuma(int i){   
        int n1=0;
        int n2=0;
        switch (i){
            case 1:
                n1=r.nextInt(10,100);
                n2=r.nextInt(10,100);
            break;
            
            case 2:
                n1=r.nextInt(1000);
                n2=r.nextInt(100);
            break;
            
            case 3:
                n1=r.nextInt(1000);
                n2=r.nextInt(1000);
            break;
        }

        System.out.println("Resuelve la siguente suma: \n"+n1+" "+n2);
        return n1+n2;
    }
    
    public void respuesta(){
        
    }
}
