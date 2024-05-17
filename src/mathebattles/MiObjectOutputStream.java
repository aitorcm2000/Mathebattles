/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathebattles;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;


    
/*
 * Redefinición para que no escriba las cabeceras
 */


public class MiObjectOutputStream extends ObjectOutputStream {
    /** Constructor que recibe OutputStream
     * @param out
     * @throws java.io.IOException */
    public MiObjectOutputStream(OutputStream out) throws IOException
    {
        super(out);
    }

    /** Constructor sin parámetros
     * @throws java.io.IOException */
    protected MiObjectOutputStream() throws IOException, SecurityException
    {
        super();
    }

    /** Redefinición del método de escribir la cabecera para que no haga nada.
     * @throws java.io.IOException */
    @Override
    protected void writeStreamHeader() throws IOException
    {
        //vacio-->no hace nada
    }
}

