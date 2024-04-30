/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

/**
 *
 * @author aitor
 */
public class Ataque {
    private int pot;
    private int prio;
    private int tipo;

    public Ataque(int pot, int prio, int tipo) {
        this.pot = pot;
        this.prio = prio;
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "Ataque{" + "pot=" + pot + ", prio=" + prio + ", tipo=" + tipo + '}';
    }
    
    //Declarar todos los ataques, son ataques pokemon en version matematica
    //Dejar a Ruben para que aprenda la estructura del constructor
    public Ataque pico_matematico= new Ataque(pot, prio, tipo);
}
