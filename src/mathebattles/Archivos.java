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
     * @return List<Proyecto> -lista de los proyectos
     *
     */
    public static List<Usuario> leerArchivoObjetos(String nombrefichero) {
        List<Usuario> usuarios = new ArrayList<>();
        ObjectInputStream os = null;
         File archivo=new File(nombrefichero);
       
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
    
    public void a(){
        try {
            // Crear un constructor de documentos
            DocumentBuilderFactory factory =
            DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            // Crear un nuevo documento XML
            Document document = builder.newDocument();
            
            // Crear el elemento raíz
            Element root = document.createElement("libros");
            document.appendChild(root);
            
            // Crear elementos libro
            Element libro1 = document.createElement("libro");
            Element titulo1 = document.createElement("titulo");
            titulo1.appendChild(document.createTextNode("El Quijote"));
            Element autor1 = document.createElement("autor");
            autor1.appendChild(document.createTextNode("M. de Cervantes"));
            libro1.appendChild(titulo1);
            libro1.appendChild(autor1);
            root.appendChild(libro1);
            Element libro2 = document.createElement("libro");
            Element titulo2 = document.createElement("titulo");
            titulo2.appendChild(document.createTextNode("Don Juan Tenorio"));
            Element autor2 = document.createElement("autor");
            autor2.appendChild(document.createTextNode("José Zorrilla"));
            libro2.appendChild(titulo2);
            libro2.appendChild(autor2);
            root.appendChild(libro2);
            
            // Escribir el documento XML en un archivo
            TransformerFactory transformerFactory =
            TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("libros.xml"));
            transformer.transform(source, result);
            System.out.println("Documento XML creado exitosamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
