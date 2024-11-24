package Modelo;
import java.util.Date;
import java.util.LinkedList;

public class Eleccion {
    private Date fecha;
    private String tipo; //Municipal, Nacional o Referendum
    private LinkedList<Candidato> candidatos;
    private LinkedList<MesaElectoral> mesas;

    public Eleccion(Date fecha, String tipo) 
    {
        this.fecha = fecha;
        this.tipo = tipo;
        this.candidatos = new LinkedList<>();
        this.mesas = new LinkedList<>();
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LinkedList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(LinkedList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }
    
    public void añadirCandidato(Candidato candidato) {
        if (!candidatos.contains(candidato)) {
            candidatos.add(candidato);
        }
    }
    
    public void eliminarCandidato(Candidato candidato){
        candidatos.remove(candidato);
    }

    public LinkedList<MesaElectoral> getMesas() {
        return mesas;
    }

    public void setMesas(LinkedList<MesaElectoral> mesas) {
        this.mesas = mesas;
    }
    
    public void añadirMesa(MesaElectoral mesa) {
        mesa.setNumero(String.valueOf(mesas.size() + 1));
        mesas.add(mesa);
    }

    public void eliminarMesa(MesaElectoral mesa) {
        mesas.remove(mesa);
    }
    
    public String Mostrar(){
        return "fecha: "+fecha;
    }
}