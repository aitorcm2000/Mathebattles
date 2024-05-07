/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aitor
 */
public class Archivos {
    FileReader fr = null;
    FileWriter fw = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    String li_leida;
    
    public void Guardar_Res(String input){
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
    
    
}
