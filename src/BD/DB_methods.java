/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    
    //DOES THE CAR EXIST

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
        }catch(SQLException ex){
            System.out.println("Failed to execute");
            System.err.println(ex.getMessage());
        }
        return false;
    }
    
    //INSERTION OF DATA
    private static void insertUsuario(Usuario u){
        if(!usuarioExiste(u.getDni())){
            String i="INSERT INTO usuarios VALUES(?,?,?,?,?)";
            try{
                ps=c.prepareStatement(i);
                ps.setString(1, u.getDni());
                ps.setInt(2, u.getAula());
                ps.setInt(3, u.getCurso());
                ps.setString(4, u.getAlias());
                ps.setInt(5, u.getEdad());
                
                ps.executeUpdate();
            }catch(SQLException ex){
                System.out.println("Operation Failed");
                System.err.println(ex.getMessage());
            }            
        }
    }
    
    public void mejoresScores(){
        String q="SELECT * FROM score LIMIT 10";
        try{
            s=c.createStatement();
            rs=s.executeQuery(q);
            while(rs.next()){
                Score s=new Score(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getInt(4));
                System.out.println(s);
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
    public static List<Car> getCars(){
        List<Car> cars = new ArrayList();
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
