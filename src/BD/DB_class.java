package BD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aitor
 */
public class DB_class {
    
    public static Connection con;
    public static final String USER="root";
    public static final String PSWD="Grupo5";
    public static final String DBN="Reto"; //DB name
    public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String URL="jdbc:mysql://192.168.24.6:3306/"+DBN;
    private static DB_class INSTANCE;

    /*In the constructor we must call for a new instance of the driver
      Create a connection (con) using the driver and establishing that
      connection through the function .getConnection.
    
      If the con isn't null a message shows to confirm the connection.
    */
    private DB_class(){
        try{
            Class.forName(JDBC_DRIVER).newInstance();
            con=DriverManager.getConnection(URL, USER, PSWD);
            if(con!=null){
                System.out.println("Connection succesful");
            }
        }catch(SQLException|InstantiationException|IllegalAccessException ex){
            System.err.println("Connection error: "+ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.err.println(ex.toString());
        }
            
    }

    /**
     *
     * @return
     */
    public static DB_class getInstance(){
        if(INSTANCE==null){
            INSTANCE= new DB_class();
        }
        return INSTANCE;
    }
    
    /**
     *
     * @return
     */
    public Connection getConnection(){
        return con;
    }
    
}
