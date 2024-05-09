/**
 * Aquí debería recogerse los metodos:
 *      1.Comprobacion de Usuario
 *      2.Insercion de Usuario
 *      3.Insercion de Score
 *      4.Query 10 mejores scores
 *      5.Scores del Usuario
 *      6.Mejor Score del Usuario
 */
package BD;

/**
 *
 * @author aitor
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mathebattles.Score;
import mathebattles.Usuario;

public class DB_methods {
    private static Connection c = DB_class.getInstance().getConnection();
    private static PreparedStatement ps;
    private static Statement s;
    private static ResultSet rs;
    private static BufferedReader br;
    
    /**
     * Coje el parametro de entrada
     * @param dni
     * y ejecuta una query buscando al menos una instancia de
     * un usuario cuyo DNI sea igual al insertado como parametro
     * @return
     */
    public static boolean usuarioExiste(String dni){
        String q= "SELECT COUNT(DNI_usuario) FROM usuarios WHERE DNI_usuario=?";
        try{
            ps=c.prepareStatement(q);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            rs.next();
            if(rs.getInt(1)>0){return true;}
            recogeUsuario(dni);
        }catch(SQLException ex){
            System.out.println("Failed to execute");
            System.err.println(ex.getMessage());
        }
        return false;
    }
    
    public static void recogeUsuario(String dni){
        String q= "SELECT * FROM usuarios WHERE DNI_usuario=?";
        try{
            ps=c.prepareStatement(q);
            ps.setString(1, dni);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario us= new Usuario(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getInt(4));
                Usuario.us_act=us;
            }
            
        }catch(SQLException ex){
            System.out.println("Failed to execute");
            System.err.println(ex.getMessage());
        }
    }
    
    //INSERTION OF DATA
    /**
     * Recoge un objeto, "u", de la clase usuario, la cual recoge
     * los datos del usuario para insertarlas en la tabla
     * "Usuarios" en la base de datos.
     * @param u 
     */
    private static void insertUsuario(Usuario u){
        if(!usuarioExiste(u.getDni())){
            String i="INSERT INTO usuarios VALUES(?,?,?,?,?)"; //Statement preparado para la insercion de datos
            try{
                ps=c.prepareStatement(i);
                ps.setString(1, u.getDni());    //DNI usuario (Dato UI)
                ps.setInt(2, u.getAula());      //ID aula (Combobox UI)
                ps.setInt(3, u.getCurso());     //ID curso (Combobox UI)
                ps.setString(4, u.getAlias());  //Alias (Dato UI)
                ps.setInt(5, u.getEdad());      //Edad (Dato UI)
                
                ps.executeUpdate();
            }catch(SQLException ex){                    //La excepcion la dictamina MySQL, son errores de MySQL en general
                System.out.println("Operation Failed");
                System.err.println(ex.getMessage());
            }            
        }
    }
    
    //LOS 1 SON PLACEHOLDER
    //LOS 1 SON PLACEHOLDER
    //LOS 1 SON PLACEHOLDER
    //LOS 1 SON PLACEHOLDER
    //LOS 1 SON PLACEHOLDER
    //Van con datos del juego
    
    private static void insertScore(Usuario u){
        if(!usuarioExiste(u.getDni())){
            String i="INSERT INTO scores VALUES(?,?,?)";
            try{
                ps=c.prepareStatement(i);
                ps.setString(1, u.getDni());
                ps.setInt(2, 1);//id reto
                ps.setInt(3, 1);//puntos
                
                ps.executeUpdate();
            }catch(SQLException ex){
                System.out.println("Operation Failed");
                System.err.println(ex.getMessage());
            }            
        }
    }
    
    public void mejoresScores(){
        String q="SELECT u.Alias,c.Nombre_Curso,a.Nombre_Aula,s.Puntos FROM scores s "
                +"INNER JOIN usuarios u ON u.DNI_usuario=s.DNI_usuario "
                +"INNER JOIN cursos c ON c.ID_curso=u.ID_Curso "
                +"INNER JOIN aulas a ON a.ID_aula=s.ID_Aula DES LIMIT 10";
        int con=0;
        try{
            s=c.createStatement();
            rs=s.executeQuery(q);
            while(rs.next()){
                con++;
                System.out.println(con+" "+rs.getString(1)+" pts: "+rs.getInt(2));
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public void usuarioPB(){
        String q="SELECT u.Alias,c.Nombre_Curso,a.Nombre_Aula,s.Puntos FROM scores s "  //1.Alias 2.Curso 3.Aula 4.Puntos
                +"INNER JOIN usuarios u ON u.DNI_usuario=s.DNI_usuario "
                +"INNER JOIN cursos c ON c.ID_curso=u.ID_Curso "
                +"INNER JOIN aulas a ON a.ID_aula=s.ID_Aula DES";
        int con=0;
        try{
            s=c.createStatement();
            rs=s.executeQuery(q);
            while(rs.next()){
                con++;
                System.out.println(con+" "+rs.getString(1)+" pts: "+rs.getInt(2));
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    //STORE DATA FROM THE DB IN JAVA

    /**
     *
     * @return
     */
    public static Usuario recogerUsuario(){
        String q="SELECT * FROM cars";
        
        try{
            s=c.createStatement();
            rs=s.executeQuery(q);
            while(rs.next()){
                Car car=new Car(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getFloat(6));
                cars.add(car);
                System.out.println(c);
            }
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
        return cars;
    }
    
}
