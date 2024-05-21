/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
            fw = new FileWriter("Resultados.txt",true);
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
     * Reseta el archivo de resultados
     */
    public static void Reset_Res(){
        try{
            fw = new FileWriter("Resultados.txt");
            bw = new BufferedWriter(fw);
            bw.write("");
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
     * Resetea el archivo de mejores
     */
    public static void Reset_Mejores(){
        try{
            fw = new FileWriter("Mejores.txt");
            bw = new BufferedWriter(fw);
            bw.write("");
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
            fw = new FileWriter("Historico.txt",true);
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
                output+=aux+"\n";
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
    
    /**
     * Lee el archivo de resultados
     * @return 
     */
    public static String leerResultados(){
        String aux;
        String output="";
        try{
            br=new BufferedReader(new FileReader(new File("Resultados.txt")));
            aux=br.readLine();
            while(aux!=null){
                output+=aux+"\n";
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
    
    /**
     * Escribe el archivo de objetos
     * @param us 
     */
    public static void escribirArchivoObjetos(Usuario us) {
        ObjectOutputStream fo = null;
        File archivo=new File("Usuarios.txt");
        try {
            if (archivo.exists()) {
                //el arechivo existe, escribimos sin cabecera
                fo = new MiObjectOutputStream(new FileOutputStream(archivo, true));
            } else {
                //el archivo no existe, escribimos cabecera
                fo = new ObjectOutputStream(new FileOutputStream(archivo));
            }
            
            fo.writeObject(us);  
        } catch (IOException ex) {
            System.err.println(ex.toString());
        } finally {
            if (fo != null) {
                try {
                    fo.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar fichero" + ex.toString());
                }
            }
        }
    }
     
     
     /**
     * lee el fichero de proyectos y crea una colección con los datos
     *
     * param nombreArchivo nombre del archivo donde se escribe
     * @return 
     *
     */
    public static List<Usuario> leerArchivoObjetos() {
        List<Usuario> usuarios = new ArrayList<>();
        ObjectInputStream os = null;
        File archivo=new File("usuarios.txt");
       
        try {
            os = new ObjectInputStream(new FileInputStream(archivo));
            Usuario us;

            while (true) {
               try{ 
                   us = (Usuario) os.readObject();
                   //Casting necesario 
                    if (!usuarios.add(us)) {
                        throw new Exception("Error en la creación de la colección de proyectos");
                    }
                } catch (EOFException e) {
                    System.out.println("Se alcanzó el final");
                   break;
                }
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error el tipo de objeto no es compatible");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo");
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException ex) {
                    System.out.println("Error al cerrar" + ex.toString());
                }
            }
        }
        return usuarios;
    }
    
    public static void generaXML(){
        try {
            // Crear un constructor de documentos
            DocumentBuilderFactory factory =
            DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Crear un nuevo documento XML
            Document document = builder.newDocument();
            
            // Crear el elemento raíz
            Element root = document.createElement("Usuarios");
            document.appendChild(root);
            
            // Crear elementos libro
            Element usuario = document.createElement("Usuario");
            Element edad = document.createElement("Edad");
            edad.appendChild(document.createTextNode(""+Usuario.us_act.getEdad()));
            Element alias = document.createElement("Alias");
            alias.appendChild(document.createTextNode(Usuario.us_act.getAlias()));
            usuario.appendChild(edad);
            usuario.appendChild(alias);
            root.appendChild(usuario);
            
            
            // Escribir el documento XML en un archivo
            TransformerFactory transformerFactory =
            TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("Usuarios.xml"));
            transformer.transform(source, result);
            System.out.println("Documento XML creado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
