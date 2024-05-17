/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author aitor
 */
public class Criatura {
    //Estos son los atributos de nuestro objeto, son las variables que le dan forma al objeto
    private static final Random rng = new Random ();
    private final String nombre;
    private final int vida;
    private static int vida_act;
    private final int ataque;
    private final int defensa;
    private final int tipo;
    private final int velocidad;
    private Ataque a1;
    private Ataque a2;
    private Ataque a3;
    private Ataque a4;

    /*
    Esto es un constructor, sirve para poder generar diferentes objetos de esta misma clase,
    este en concreto es un constructor sobrecargado, tiene parametros de entrada que debemos rellenar
    a la vez que generamos el objeto.
    */


    public Criatura(String nombre, int vida, int ataque, int defensa, int tipo, int velocidad, Ataque a1, Ataque a2, Ataque a3, Ataque a4) {
        this.nombre = nombre;
        this.vida = vida;
        this.vida_act=vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.a4 = a4;
    }

    public Ataque getA1() {
        return a1;
    }

    public Ataque getA2() {
        return a2;
    }

    public Ataque getA3() {
        return a3;
    }

    public Ataque getA4() {
        return a4;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getVida_act() {
        return vida_act;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getTipo() {
        return tipo;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
    //ToString
    @Override
    public String toString() {
        return nombre + " HP: "+vida_act+"/"+ vida + " Atk:" + ataque + " Def:" + defensa + "" + tipo + ", velocidad=" + velocidad;
    }
    
    /**
     * Creacion de criaturas
     */
    
    
    
    /**
     * Resta el daño recibido a la vida actual instancia 
     * de la criatura que lo llama
     * @param daño     public ArrayList<Ataque> at_c1= new ArrayList<>();
    at_c1
     */
    public static void Daño(int daño){
        vida_act-=daño;
    }
    
    /**
     * Calculo del daño que va a recibir la criatura enemiga
     * @param at
     * @param en
     * @return 
     */
    public int Atacar(Ataque at, Criatura en){
        float Rec_Dmg;
        Rec_Dmg=((at.getPot()*(this.getAtaque()/en.getDefensa()))/30)*(STAB(at)*TAD(at, en));
        return (int)Rec_Dmg;
    }
    
    /**
     * SAME TYPE ATTACK BOOST
     * si el ataque es del mismo tipo que el atacante obtiene beneficio de daño
     * @param at
     * @return 
     */
    private float STAB(Ataque at){
        if(getTipo()==at.getTipo()){
            return 1.5f;
        }else{return 1;}
    }
    
    /**
     * 
     * @param at
     * @param en
     * @return 
     */
    private float TAD(Ataque at,Criatura en){
        
        return 1;
    }
    
    /**
     * 
     * @param us
     * @param en
     * @param us_atk
     * @param en_atk
     * @return 
     */
    public static int orden (Criatura us,Criatura en,int us_atk, int en_atk)  {
        
        int orden=(us.velocidad+(us.ataques[us_atk].getPrio()*10))-(en.velocidad+(en.ataques[en_atk].getPrio()*10));
        if(orden>0){
            return 0;
        }else if(orden == 0){
            switch (rng.nextInt(2)) {
                case 0:
                    return 0;
                case 1:
                    return 1;
            }
        }else{
            return 1;
        }
        return 1;
    }
    
    
}
