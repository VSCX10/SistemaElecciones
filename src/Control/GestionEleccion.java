package Control;

import Modelo.Eleccion;
import java.util.LinkedList;

/**
 *
 * @author VICTOR
 */
public class GestionEleccion 
{
    private static LinkedList <Eleccion> lista = new LinkedList<>();
    
    public GestionEleccion(){
    }
    
    public static LinkedList<Eleccion> getLista() {
        return lista;
    }

    public static void setLista(LinkedList<Eleccion> listaElecciones) {
        lista = listaElecciones;
    }
}
