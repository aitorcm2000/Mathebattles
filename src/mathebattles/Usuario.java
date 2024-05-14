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
    private int id_curso;
    private String alias;
    private int edad;
    private int id;
    private String dni;
   
    
    public static Usuario us_act= new Usuario();
    
    public Usuario(){}

    public Usuario(int id_curso, String alias, int edad,int id, String dni) {
        this.id_curso = id_curso;
        this.alias = alias;
        this.edad = edad;
        this.id=id;
        this.dni = dni;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public static Usuario getUs_act() {
        return us_act;
    }

    public static void setUs_act(Usuario us_act) {
        Usuario.us_act = us_act;
    }
    
    
}
