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
    private Tipo tipos = new Tipo();

    public Ataque(String nombre, int pot, int prio, int tipo) {
        this.nombre = nombre;
        this.pot = pot;
        this.prio = prio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ataque{" + "nombre=" + nombre + ", pot=" + pot + ", prio=" + prio + ", tipo=" + tipo + '}';
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
    //Dejar a Ruben para que aprenda la estructura del constructor

    Ataque[] ataques = {
            new Ataque("FlamaIntegral", 90, 1, 1),
            new Ataque("HojaDerivada", 70, 1, 2),
            new Ataque("LímiteAcuático", 80, 1, 3),
            new Ataque("RáfagaVectorial", 60, 1, 4),
            new Ataque("RocaRiemann", 75, 1, 5),
            new Ataque("RayoMatriz", 85, 1, 6),
            new Ataque("QuemaduraLogarítmica", 95, 1, 1),
            new Ataque("VidExponencial", 65, 1, 2),
            new Ataque("OndaDiferencial", 85, 1, 3),
            new Ataque("VientoLineal", 55, 1, 4),
            new Ataque("DeslizamientoPolinómico", 80, 1, 5),
            new Ataque("ZapCuadrático", 90, 1, 6),
            new Ataque("LlamaTrigonométrica", 100, 1, 1),
            new Ataque("HelechoFibonacci", 60, 1, 2),
            new Ataque("SalpicaduraPitágoras", 75, 1, 3),
            new Ataque("VueloEuclidiano", 65, 1, 4)
        };
}
