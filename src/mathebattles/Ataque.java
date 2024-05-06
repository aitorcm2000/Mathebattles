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
    private String nombre;
    private int pot;
    private int prio;
    private int tipo;

    public Ataque(String nombre, int pot, int prio, int tipo) {
        this.nombre = nombre;
        this.pot = pot;
        this.prio = prio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ataque{" + "nombre=" + nombre + ", pot=" + pot + ", prio=" + prio + ", tipo=" + tipo + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getPot() {
        return pot;
    }

    public int getPrio() {
        return prio;
    }

    public int getTipo() {
        return tipo;
    }
    
    
    //Declarar todos los ataques, son ataques pokemon en version matematica
    //Dejar a Ruben para que aprenda la estructura del constructor
    public Ataque pico_matematico= new Ataque("Poligon",pot, prio, tipo);
}
