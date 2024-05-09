/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

/**
 *
 * @author aitor
 */
public class Usuario {
    private String dni;
    private int curso;
    private String alias;
    private int edad;
    public static Usuario us_act= new Usuario();
    
    public Usuario(){}

    public Usuario(String dni, int curso, String alias, int edad) {
        this.dni = dni;
        this.curso = curso;
        this.alias = alias;
        this.edad = edad;
    }
    

    //GETTERS
    public String getDni() {
        return dni;
    }

    public int getCurso() {
        return curso;
    }

    public String getAlias() {
        return alias;
    }

    public int getEdad() {
        return edad;
    }
    

    //SETTERS
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
