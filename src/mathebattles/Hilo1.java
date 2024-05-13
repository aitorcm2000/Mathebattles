/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

import java.util.Scanner;

/**
 *
 * @author Aitor PC
 */
public class Hilo1 implements Runnable{
    public static int op=0;
    public static Scanner sc = new Scanner (System.in);
    
    public void run(){
        try{            
            while(true){
                System.out.println("Escoje 1 o 2");
                op=sc.nextInt();
                switch(op){
                    case 1:
                        //Atacar menu : Deberia cambiar el layout del menu dentro del jpanel
                        System.out.println("Atacar");
                        
                    break;
                    case 2:
                        //Cambiar menu : Deberia cambiar el layout del menu dentro del jpanel
                        System.out.println("Cambiar");
                    break;                        
                    /* Quizas para objetos o algo 
                    case 0:
                        
                    break;
                    */
                }
            }
        }catch (Exception ex){
            
        }
    }
}
