package Modelo;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ActaElectoral {
    private String idActa;
    private String titulo;
    private int totalVotantesRegistrados;
    private int totalVotantesEfectivos;
    private Stack<VotoCandidato> votosPorCandidato = new Stack<>();
    private int votosBlancos;
    private int votosNulos;
    private Queue<String> observaciones = new LinkedList<>();

    public ActaElectoral(String idActa, String titulo) {
        this.idActa = idActa;
        this.titulo = titulo;
    }

    public void registrarVotos(Candidato candidato, int votos) {
        if (votos < 0) throw new IllegalArgumentException("Los votos no pueden ser negativos.");
        for (VotoCandidato vc : votosPorCandidato) {
            if (vc.getCandidato().equals(candidato)) {
                vc.setVotos(vc.getVotos() + votos);
                return;
            }
        }
        votosPorCandidato.add(new VotoCandidato(candidato, votos));
    }

    public Stack<VotoCandidato> getResultados() {
        return votosPorCandidato;
    }

    public void setVotosBlanco(int votosBlancos) {
        this.votosBlancos = votosBlancos;
    }

    public void setVotosNulos(int votosNulos) {
        this.votosNulos = votosNulos;
    }

    public void agregarObservacion(String observacion) {
        observaciones.add(observacion);
    }

    public Queue<String> getObservaciones() {
        return observaciones;
    }

    public String getIdActa() {
        return idActa;
    }

    public void setIdActa(String idActa) {
        this.idActa = idActa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalVotantesRegistrados() {
        return totalVotantesRegistrados;
    }

    public void setTotalVotantesRegistrados(int totalVotantesRegistrados) {
        this.totalVotantesRegistrados = totalVotantesRegistrados;
    }

    public int getTotalVotantesEfectivos() {
        return totalVotantesEfectivos;
    }

    public void setTotalVotantesEfectivos(int totalVotantesEfectivos) {
        this.totalVotantesEfectivos = totalVotantesEfectivos;
    }

    public Stack<VotoCandidato> getVotosPorCandidato() {
        return votosPorCandidato;
    }

    public void setVotosPorCandidato(Stack<VotoCandidato> votosPorCandidato) {
        this.votosPorCandidato = votosPorCandidato;
    }

    public int getVotosBlancos() {
        return votosBlancos;
    }

    public void setVotosBlancos(int votosBlancos) {
        this.votosBlancos = votosBlancos;
    }

    public int getVotosNulos() {
        return votosNulos;
    }

    public void setObservaciones(Queue<String> observaciones) {
        this.observaciones = observaciones;
    }
}