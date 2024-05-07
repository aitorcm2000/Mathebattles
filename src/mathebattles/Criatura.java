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
    //Estos son los atributos de nuestro objeto, son las variables que le dan forma al objeto
    private String nombre;
    private int vida;
    private int vida_act;
    private int ataque;
    private int defensa;
    private int tipo;
    private int velocidad;
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
    }
    
    /*
    Esto es un Setter, en realidad no es más que un metodo pero que tiene un nombre comun por que es muy habitual su uso
    */
    public void setAtaques(Ataque[] ataques) {
        this.ataques = ataques;
    }

    @Override
    public String toString() {
        return nombre + " HP: "+vida_act+"/"+ vida + " Atk:" + ataque + " Def:" + defensa + "" + tipo + ", velocidad=" + velocidad + ", ataques=" + ataques + ", c1=" + c1 + '}';
    }
    
    //Introducir los ataques dentro de las criaturas
    //Cosas de Ruben a medias porque no tiene mucha idea de pokemon
    Criatura c1 = new Criatura("Poligon", vida, ataque, defensa, tipo, velocidad);
    
    
    
    public void Daño(int daño){this.vida_act-=daño;}
    
    public int Atacar(Ataque at, Criatura en){
        float Rec_Dmg;
        Rec_Dmg=((at.getPot()*(this.ataque/this.defensa))/30)*(STAB(at)*TAD(at, en));
        return (int)Rec_Dmg;
    }
    
    private float STAB(Ataque at){
        if(this.tipo==at.getTipo()){
            return 1.5f;
        }else{return 1;}
    }
    private float TAD(Ataque at,Criatura en){
        
        return 1;
    }
    
}
