/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BD;

/**
 *
 * @author aitor
 */
public class TestMYSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DB_methods.createCarsTable();
        DB_methods.loadCars();
        for(Car car:DB_methods.getCars()){
            System.out.println(car);
        }
    }
    
}
