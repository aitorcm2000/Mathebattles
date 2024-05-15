/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

import java.net.Socket;
import java.util.Scanner;
import static mathebattles.Criatura.c1;
import static mathebattles.Criatura.c2;
import static mathebattles.Criatura.c3;
import static mathebattles.Criatura.c4;
import static mathebattles.Criatura.c5;
import static mathebattles.Criatura.c6;

/**
 *
 * @author Aitor PC
 */
public class Hilo1 implements Runnable{
    public static int op=0;
    public static Scanner sc = new Scanner (System.in);
    Entrenador jugador = new Entrenador(c1,c2,c3);
    Entrenador enemigo = new Entrenador(c4,c5,c6);
    private Criatura cec_enemigo;
    private Criatura cec_jugador;
    private int atk;
    public void run(){
        try{
            cec_jugador=(jugador.getMiembro(1));
            cec_enemigo=(enemigo.getMiembro(1));
            while(true){
                System.out.println("Atacar o Cambiar");
                op=sc.nextInt();
                
                switch(op){
                    case 1:
                        //Atacar menu : Deberia cambiar el layout del menu dentro del jpanel
                        System.out.println("Atacar");
                        atk=sc.nextInt();
                        switch(Criatura.orden(cec_jugador, cec_enemigo, atk, atk)){
                            case 0:
                                int daño=Criatura.Atacar(cec_jugador.getAtaque(atk), cec_enemigo);
                                //Aqui van las mates
                                System.out.println("Has hecho "+daño+" puntos de daño");
                                daño=Criatura.Atacar(cec_enemigo.getAtaque(atk), cec_jugador);
                                //Mates
                                System.out.println("Te han hecho "+daño+" puntos de daño");
                            break;
                            case 1:
                                daño=Criatura.Atacar(cec_enemigo.getAtaque(atk), cec_jugador);
                                System.out.println("Te han hecho "+daño+" puntos de daño");
                                daño=Criatura.Atacar(cec_jugador.getAtaque(atk), cec_enemigo);
                                System.out.println("Te han hecho "+daño+" puntos de daño");
                                
                            break;
                        }
                        
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
