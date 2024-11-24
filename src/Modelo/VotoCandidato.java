package Modelo;

public class VotoCandidato {
    private Candidato candidato;
    private int votos;

    public VotoCandidato(Candidato candidato, int votos) {
        this.candidato = candidato;
        this.votos = votos;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }
}