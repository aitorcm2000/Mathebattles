/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

/**
 *
 * @author aitor
 */
public class Ataque {
    private static String nombre;
    private static int pot;
    private static int prio;
    private static int tipo;
    
    

    public Ataque(String nombre, int pot, int prio, int tipo) {
        this.nombre = nombre;
        this.pot = pot;
        this.prio = prio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String string_tipo="";
        switch (tipo) {
            case 1:
               string_tipo="Fuego"; 
            break;
            case 2:
                string_tipo="Planta";
            break;
            case 3:
                string_tipo="Agua";
            break;
            case 4:
                string_tipo="Electrico";
            break;
            case 5:
                string_tipo="Roca";
            break;
            case 6:
                string_tipo="Volador";
            break;
        }
        return nombre + " Potencia: " + pot + " Tipo: " + string_tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPot() {
        return pot;
    }

    public int getPrio() {
        return prio;
    }

    public int getTipo() {
        return tipo;
    }
    
    
    //Declarar todos los ataques, son ataques pokemon en version matematica



    
//    Ataque[] at_c2 = {
//        new Ataque("HojaDerivada", 70, 1, 2),
//        new Ataque("VidExponencial", 65, 1, 2),
//        new Ataque("HelechoFibonacci", 60, 1, 2),
//    };
//    Ataque[] at_c3 = {
//        new Ataque("LímiteAcuático", 80, 1, 3),
//        new Ataque("SalpicaduraPitágoras", 75, 1, 3),
//        new Ataque("RáfagaVectorial", 60, 1, 4),
//        new Ataque("OndaDiferencial", 85, 1, 3),
//    };
//    
    
//            
//            
//            
//            new Ataque("RocaRiemann", 75, 1, 5),
//            new Ataque("RayoMatriz", 85, 1, 6),
//            
//            
//            
//            new Ataque("VientoLineal", 55, 1, 4),
//            new Ataque("DeslizamientoPolinómico", 80, 1, 5),
//            new Ataque("ZapCuadrático", 90, 1, 6),
//            
//            new Ataque("HelechoFibonacci", 60, 1, 2),
//
//            new Ataque("VueloEuclidiano", 65, 1, 4)
}
