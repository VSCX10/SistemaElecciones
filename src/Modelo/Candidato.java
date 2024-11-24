package Modelo;

public class Candidato extends Persona{
    private String partidoPolitico;

    public Candidato(String nombre, String apellidoPaterno, String apellidoMaterno, String DNI, String partidoPolitico) {
        super(nombre, apellidoPaterno, apellidoMaterno, DNI);
        this.partidoPolitico = partidoPolitico;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellidoPaterno + " " + this.apellidoMaterno;
    }
}
