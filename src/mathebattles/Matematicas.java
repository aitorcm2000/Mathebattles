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
public class Matematicas {
    private Random r= new Random();
    private int n1;
    private int n2;
    private String operacion="";
    private static Archivos arc = new Archivos();
    
    /**
     * Genera de forma aleatoria sumas dependiendo del numero de entrada
     * @param i refiere a la dificultad
     * @return  saca la solucion de la suma para más tarde hacer display al usuario
     *          y generar 4 opciones
     */
    public int genSuma(int i){  
        this.operacion="+";
        this.n1=0;
        this.n2=0;
        switch (i){
            case 1:
                this.n1=r.nextInt(-100,100);
                this.n2=r.nextInt(-100,100);
            break;
            
            case 2:
                this.n1=r.nextInt(-1000,1000);
                this.n2=r.nextInt(-100,100);
            break;
            
            case 3:
                this.n1=r.nextInt(-1000,1000);
                this.n2=r.nextInt(-1000,1000);
            break;
        }

        System.out.println("Resuelve la siguente suma: \n"+n1+" "+n2);
        return n1+n2;
    }
    
    public int genMult(int i){
        this.operacion="x";
        this.n1=0;
        this.n2=0;
        switch (i){
            case 1:
                this.n1=r.nextInt(-100,100);
                this.n2=r.nextInt(-9,10);
            break;
            
            case 2:
                this.n1=r.nextInt(-1000,1000);
                this.n2=r.nextInt(-100,100);
            break;
            
            case 3:
                this.n1=r.nextInt(-1000,1000);
                this.n2=r.nextInt(-1000,1000);
            break;
        }

        System.out.println("Resuelve la siguente multiplicación: \n"+this.n1+this.operacion+this.n2);
        return n1*n2;
    }
    
    /**
     * Genera de forma aleatoria un número cercano al resultado
     * @param n refiere al resultado de la operacion, se usa como base
     *          para generar el número.
     * 
     * @return  el numero que se hará display en el boton
     */
    public int opcion(int n){
        int tf=r.nextInt(1);
        switch(tf){
            case 0:return n-r.nextInt(50);
            case 1:return n+r.nextInt(50);
        }
        return 0;
    }
    
    /**
     * Compara el resultado con la opcion escogida y devuelve un booleando acorde
     * @param suma
     * @param opcion
     * @return 
     */
    public boolean respuesta(int suma, int opcion){return suma==opcion;}
    
    /**
     * Toma como parametros de entra el resultado de la suma
     * la opcion escogida por el usuario en la UI
     * y el booleano de si ha sido acierto o no
     * @param suma
     * @param opcion
     * @param respuesta 
     * El objetivo de este metodo es escribir la operacion y resultado
     * en un txt para despues recuperarlo y mostrarselo al usuario.
     */
    public void resultado (int suma, int opcion, boolean respuesta){
        String problema="Operacion "+this.n1+this.operacion+this.n2+"="+suma
                     +"\nTu respuesta : "+opcion+" es ";
        if(respuesta){
            problema+="correcta";
        }else{
            problema+="incorrecta";
        }
        arc.Guardar_Res(problema);
        this.n1=0;
        this.n2=0;
        this.operacion="";
    }
    
    
}
