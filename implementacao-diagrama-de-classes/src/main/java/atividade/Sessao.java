package atividade;

import java.util.Date;

public class Sessao {
    private Date dataSessao;
    private String horaSessao;
    private EstadoSessao estadoSessao;
    private Integer ingressosSessao;
    private Integer ingressosComprados;
    private Integer ingressosRestantes;

    private Filme filme;
    private Sala sala;

    public enum EstadoSessao {
        ABERTA,
        EM_ANDAMENTO,
        ENCERRADA
    }

    public Sessao(Date dataSessao, String horaSessao, EstadoSessao estadoSessao, Filme filme, Sala sala) {
        this.dataSessao = dataSessao;
        this.horaSessao = horaSessao;
        this.estadoSessao = estadoSessao;
        this.ingressosSessao = sala.getCapacidade();
        this.ingressosComprados = 0;
        this.ingressosRestantes = ingressosSessao;

        this.filme = filme;
        this.sala = sala;
    }

    public void exibirSessao() {
        System.out.println("Sessão:");
        System.out.println("Data: " + this.dataSessao);
        System.out.println("Hora: " + this.horaSessao);
        System.out.println("Estado: " + this.estadoSessao);
        System.out.println("Ingressos: " + this.ingressosSessao);
        System.out.println("Ingressos comprados: " + this.ingressosComprados);
        System.out.println("Ingressos restantes: " + this.ingressosRestantes);
    }

    public void venderIngressos(Ingresso ingresso) {
        if(this.ingressosRestantes > 0) {
            this.ingressosRestantes--;
            this.ingressosComprados++;
        } else {
            throw new RuntimeException("Não há mais ingressos disponíveis!");
        }
    }

    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public String getHoraSessao() {
        return horaSessao;
    }

    public void setHoraSessao(String horaSessao) {
        this.horaSessao = horaSessao;
    }

    public EstadoSessao getEstadoSessao() {
        return estadoSessao;
    }

    public void setEstadoSessao(EstadoSessao estadoSessao) {
        this.estadoSessao = estadoSessao;
    }

    public Integer getIngressosSessao() {
        return ingressosSessao;
    }

    public void setIngressosSessao(Integer ingressosSessao) {
        this.ingressosSessao = ingressosSessao;
    }

    public Integer getIngressosComprados() {
        return ingressosComprados;
    }

    public void setIngressosComprados(Integer ingressosComprados) {
        this.ingressosComprados = ingressosComprados;
    }

    public Integer getIngressosRestantes() {
        return ingressosRestantes;
    }

    public void setIngressosRestantes(Integer ingressosRestantes) {
        this.ingressosRestantes = ingressosRestantes;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
