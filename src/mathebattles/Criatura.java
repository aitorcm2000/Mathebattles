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
public class Criatura {
    //Estos son los atributos de nuestro objeto, son las variables que le dan forma al objeto
    private static Random rng = new Random ();
    private static String nombre;
    private static int vida;
    private static int vida_act;
    private static int ataque;
    private static int defensa;
    private static int tipo;
    private static int velocidad;
    private Ataque[] ataques;
    

    /*
    Esto es un constructor, sirve para poder generar diferentes objetos de esta misma clase,
    este en concreto es un constructor sobrecargado, tiene parametros de entrada que debemos rellenar
    a la vez que generamos el objeto.
    */
    public Criatura(String nombre, int vida, int ataque, int defensa, int tipo, int velocidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.vida_act=vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.ataques = new Ataque[4];
    }
    
    /*
    Esto es un Setter, en realidad no es más que un metodo pero que tiene un nombre comun por que es muy habitual su uso
    */
    public void setAtaques(Ataque[] ataques) {
        this.ataques = ataques;
    }

    public Ataque getAtaque(int i) {
        return ataques[i];
    }

    public static String getNombre() {
        return nombre;
    }

    public static int getVida() {
        return vida;
    }

    public static int getVida_act() {
        return vida_act;
    }

    public static int getAtaque() {
        return ataque;
    }

    public static int getDefensa() {
        return defensa;
    }

    public static int getTipo() {
        return tipo;
    }

    public static int getVelocidad() {
        return velocidad;
    }
    

    @Override
    public String toString() {
        return nombre + " HP: "+vida_act+"/"+ vida + " Atk:" + ataque + " Def:" + defensa + "" + tipo + ", velocidad=" + velocidad + ", ataques=" + ataques + ", c1=" + c1 + '}';
    }
    
    /**
     * Creacion de criaturas
     */
    public static Criatura c1 = new Criatura("PyroToro", 200, 80, 60, Tipo.FUEGO, 70);
    public static Criatura c2 = new Criatura("Mathsaurio", 180, 70, 50, Tipo.PLANTA, 65);
    public static Criatura c3 = new Criatura("Aguatron", 190, 75, 55, Tipo.AGUA, 68);
    public static Criatura c4 = new Criatura("Voltalcula", 210, 85, 65, Tipo.ELECTRICO, 72);
    public static Criatura c5 = new Criatura("Rockosaurio", 185, 72, 58, Tipo.ROCA, 66);
    public static Criatura c6 = new Criatura("Algebird", 195, 82, 62, Tipo.VOLADOR, 69);
    
    /**
     * Resta el daño recibido a la vida actual instancia 
     * de la criatura que lo llama
     * @param daño 
     */
    public void Daño(int daño){this.vida_act-=daño;}
    
    /**
     * Calculo del daño que va a recibir la criatura enemiga
     * @param at
     * @param en
     * @return 
     */
    public static int Atacar(Ataque at, Criatura en){
        float Rec_Dmg;
        Rec_Dmg=((at.getPot()*(getAtaque()/getDefensa()))/30)*(STAB(at)*TAD(at, en));
        return (int)Rec_Dmg;
    }
    
    /**
     * SAME TYPE ATTACK BOOST
     * si el ataque es del mismo tipo que el atacante obtiene beneficio de daño
     * @param at
     * @return 
     */
    private static float STAB(Ataque at){
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
    private static float TAD(Ataque at,Criatura en){
        
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
