package Control;

import Modelo.Candidato;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author VICTOR
 */
public class GestionCandidato 
{
    private static LinkedList <Candidato> lista = new LinkedList<>();
    
    public GestionCandidato(){
    }
    
    public static LinkedList<Candidato> getLista() {
        return lista;
    }

    public static void setLista(LinkedList<Candidato> lista) {
        GestionCandidato.lista = lista;
    }
    
    public static Candidato buscarCandidato(String dni) { //Se busca al candidato por DNI
    for (Candidato candidato : lista) {
        if (candidato.getDNI().equals(dni)) {
            return candidato;
        }
    }
    return null;
}
}
