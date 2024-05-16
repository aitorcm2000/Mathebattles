/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author aitor
 */
public class Archivos {
    static FileReader fr = null;
    static FileWriter fw = null;
    static BufferedReader br = null;
    static BufferedWriter bw = null;
    static String li_leida;
    
    /**
     * Guardar los resultados en un archivo recogiendo el string como input
     * @param input 
     */
    public static void Guardar_Res(String input){
        try{
            fw = new FileWriter("Resultados.txt", true);
            bw = new BufferedWriter(fw);
            bw.write(input);
            bw.write(System.lineSeparator());
        }catch(IOException ex){
            System.err.println(ex.toString());
        }finally{
            if(bw!=null){
                try{
                    bw.close();
                }catch(IOException ex){
                    System.err.println(ex.toString());
                }
            }
        }
    }
    
    /**
     * Escribe linea a linea la query de mostrar todas las partidas
     * @param input 
     */
    public static void escribirHistorial(String input){
        try{
            fw = new FileWriter("Historico.txt", true);
            bw = new BufferedWriter(fw);
            bw.write(input);
            bw.write(System.lineSeparator());
        }catch(IOException ex){
            System.err.println(ex.toString());
        }finally{
            if(bw!=null){
                try{
                    bw.close();
                }catch(IOException ex){
                    System.err.println(ex.toString());
                }
            }
        }
    }
    
    /**
     * Escribe linea a linea la query de los 10 mejores scores del juego
     * @param input 
     */
    public static void escribirMejores(String input){
        try{
            fw = new FileWriter("Mejores.txt", true);
            bw = new BufferedWriter(fw);
            bw.write(input);
            bw.write(System.lineSeparator());
        }catch(IOException ex){
            System.err.println(ex.toString());
        }finally{
            if(bw!=null){
                try{
                    bw.close();
                }catch(IOException ex){
                    System.err.println(ex.toString());
                }
            }
        }
    }
    
    /**
     * Lee el archivo de los 10 mejores y los devuelve como un String
     * que despues se mostrará en el panel de scores
     * @return 
     */
    public static String leerMejores(){
        String aux;
        String output="";
        try{
            br=new BufferedReader(new FileReader(new File("Mejores.txt")));
            aux=br.readLine();
            while(aux!=null){
                output=aux+"\n";
                aux=br.readLine();
            }
        }catch(IOException ex){
            System.err.println(ex.getMessage());
        }finally{
            try{
                if(br!=null){br.close();}
            }catch(IOException ex){
                System.err.println(ex.getMessage());
            }
        }
        return output;
    }
    
    
}
