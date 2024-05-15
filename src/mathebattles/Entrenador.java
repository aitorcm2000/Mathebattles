/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

/**
 *
 * @author aitor
 */
public class Entrenador {
    private Criatura[] equipo;
    public Entrenador(Criatura a,Criatura b,Criatura c) {
        equipo= new Criatura[3];
        this.equipo[0]=a;
        this.equipo[1]=b;
        this.equipo[2]=c;
    }

    public Criatura[] getEquipo() {
        return equipo;
    }
    
    public Criatura getMiembro(int c) {
        return equipo[c];
    }
}
