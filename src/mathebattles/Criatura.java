/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

/**
 *
 * @author aitor
 */
public class Criatura {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private int tipo;
    private int velocidad;
    private Ataque[] ataques;

    public Criatura(String nombre, int vida, int ataque, int defensa, int tipo, int velocidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.tipo = tipo;
        this.velocidad = velocidad;
    }

    public void setAtaques(Ataque[] ataques) {
        this.ataques = ataques;
    }

    @Override
    public String toString() {
        return "Criatura{" + "vida=" + vida + ", ataque=" + ataque + ", defensa=" + defensa + ", tipo=" + tipo + ", velocidad=" + velocidad + ", ataques=" + ataques + '}';
    }
    
    
}
