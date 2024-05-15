/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

/**
 *
 * @author aitor
 */
public class Tipo {
    public static final int FUEGO=1;
    public static final int PLANTA=2;
    public static final int AGUA=3;
    public static final int VOLADOR=4;
    public static final int ROCA=5;
    public static final int ELECTRICO=6;
    public final int[][]efectividad={
            //tipo1,tipo2 ,tipo3,tipo4,tipo5,tipo6    
    /*tipo1*/{0    ,PLANTA,0   ,0      ,ROCA,0},
    /*tipo2*/{0    ,0     ,AGUA,0      ,0   ,ELECTRICO},
    /*tipo3*/{FUEGO,PLANTA,0   ,0      ,ROCA,0},
    /*tipo4*/{0    ,PLANTA,AGUA,0      ,ROCA,ELECTRICO},
    /*tipo5*/{FUEGO,PLANTA,0   ,VOLADOR,0   ,0},
    /*tipo6*/{0    ,0     ,AGUA,VOLADOR,ROCA,0}};

    public Tipo() {
    }
    
    
}
