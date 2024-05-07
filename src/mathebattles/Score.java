/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

/**
 *
 * @author Aitor PC
 */
public class Score {
    private int id;
    private String dni;
    private int reto;
    private int puntos;

    public Score(String dni, int reto, int puntos) {
        this.dni = dni;
        this.reto = reto;
        this.puntos = puntos;
    }

    public Score(int id, String dni, int reto, int puntos) {
        this.id = id;
        this.dni = dni;
        this.reto = reto;
        this.puntos = puntos;
    }

    public String getDni() {
        return dni;
    }

    public int getReto() {
        return reto;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setReto(int reto) {
        this.reto = reto;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
}
