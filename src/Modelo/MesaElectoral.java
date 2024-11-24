package Modelo;

public class MesaElectoral {
    private String numero;
    private String ubicacion;
    private MiembroMesa presidente;
    private MiembroMesa secretario;
    private MiembroMesa vocal;
    private ActaElectoral acta;

    public MesaElectoral(){
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public ActaElectoral getActa() {
        return acta;
    }

    public void setActa(ActaElectoral acta) {
        this.acta = acta;
    }

    public MiembroMesa getPresidente() {
        return presidente;
    }

    public void setPresidente(MiembroMesa presidente) {
        this.presidente = presidente;
    }

    public MiembroMesa getSecretario() {
        return secretario;
    }

    public void setSecretario(MiembroMesa secretario) {
        this.secretario = secretario;
    }

    public MiembroMesa getVocal() {
        return vocal;
    }

    public void setVocal(MiembroMesa vocal) {
        this.vocal = vocal;
    }
    
    public void generarActaElectoral(String fechaEleccion) {
        String idActaGenerado = "Acta " + numero;
        String tituloGenerado = "Acta Electoral de " + ubicacion + " para elección del " + fechaEleccion;
        this.acta = new ActaElectoral(idActaGenerado, tituloGenerado);
    }

    @Override
    public String toString() {
        return "Mesa "+ numero;
    }
}
