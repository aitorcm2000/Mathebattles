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
    
    public void escribirHistorial(String input){
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
    
//    public void loadCars(){
//        String aux;
//        try{
//            br=new BufferedReader(new FileReader(new File("cars.txt")));
//            aux=br.readLine();
//            while(aux!=null){
//                String[] str=aux.split(";");
//                Car car = new Car(str[0], str[1], str[2],str[3],Integer.parseInt(str[4]),Float.parseFloat(str[5]));
//                insertCar(car);
//                aux=br.readLine();
//            }
//            System.out.println("Data loaded");
//        }catch(IOException ex){
//            System.err.println(ex.getMessage());
//        }finally{
//            try{
//                if(br!=null){br.close();}
//            }catch(IOException ex){
//                System.err.println(ex.getMessage());
//            }
//        }
//    }
    
    
}
