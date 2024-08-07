package atividade;

public class Sala {
    private Integer numeroSala;
    private String nomeSala;
    private Integer capacidade;

    public Sala(Integer numeroSala, String nomeSala, Integer capacidade) {
        this.numeroSala = numeroSala;
        this.nomeSala = nomeSala;
        this.capacidade = capacidade;
    }

    public Integer getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(Integer numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }
}
