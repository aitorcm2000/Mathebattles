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

public class DB_methods {
    private static Connection c = DB_class.getInstance().getConnection();
    private static PreparedStatement ps;
    private static Statement s;
    private static ResultSet rs;
    private static BufferedReader br;
    
    //CREATE CARS TABLE

    /**
     *
     */
    public static void createCarsTable(){
        final String sql= "CREATE TABLE IF NOT EXISTS cars"
                        +"(plate VARCHAR(8), brand VARCHAR(40), model VARCHAR(40),"
                        + "colour VARCHAR(40), year INT NOT NULL,"
                        +"price DECIMAL NOT NULL, PRIMARY KEY (plate))";
        try{
            s=c.createStatement();
            s.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println("Failed to create table");
            System.err.println(ex.getMessage());
        }
    }
    
    //DOES THE CAR EXIST

    /**
     * Takes the parameter
     * @param plate
     * and executes a query searching for the number of instances
     * of a car with the plate that equals the parameter
     * @return
     */
    public static boolean carExist(String plate){
        String q= "SELECT COUNT(DNI) FROM cars WHERE dni=?";
        try{
            ps=c.prepareStatement(q);
            ps.setString(1, plate);
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
    private static void insertCar(Car car){
        if(!carExist(car.getPlate())){
            String i="INSERT INTO scores VALUES(?,?,?,?,?,?)";
            try{
                ps=c.prepareStatement(i);
                ps.setString(1, car.getPlate());
                ps.setString(2, car.getBrand());
                ps.setString(3, car.getModel());
                ps.setString(4, car.getColour());
                ps.setInt(5, car.getYear());
                ps.setFloat(6, car.getPrice());
                
                ps.executeUpdate();
            }catch(SQLException ex){
                System.out.println("Operation Failed");
                System.err.println(ex.getMessage());
            }            
        }
    }
    
    //LOAD DATA FROM A .txt FILE

    /**
     *
     */
    public static void loadCars(){
        String aux;
        try{
            br=new BufferedReader(new FileReader(new File("cars.txt")));
            aux=br.readLine();
            while(aux!=null){
                
                String[] str=aux.split(";");
                Car car = new Car(str[0], str[1], str[2],str[3],Integer.parseInt(str[4]),Float.parseFloat(str[5]));
                insertCar(car);
                aux=br.readLine();
            }
            System.out.println("Data loaded");
        }catch(IOException ex){
            System.err.println(ex.getMessage());
        }finally{
            try{
                if(br!=null){br.close();}
            }catch(IOException ex){
                System.err.println(ex.getMessage());
            }
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
