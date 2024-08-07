package atividade;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private Integer ano;
    private String produtora;
    private String paisOrigem;
    private String duracao;
    private Genero genero;

    private final List<Ator> atores;
    private final List<Direcao> diretores;
    private final List<Producao> produtores;

    public Filme(String titulo, Integer ano, String produtora, String paisOrigem, String duracao, Genero genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.produtora = produtora;
        this.paisOrigem = paisOrigem;
        this.duracao = duracao;
        this.genero = genero;

        this.atores = new ArrayList<Ator>();
        this.diretores = new ArrayList<Direcao>();
        this.produtores = new ArrayList<Producao>();
    }

    public void addAtor(Ator ator) {
        this.atores.add(ator);
    }

    public void removeAtor(Ator ator) {
        this.atores.remove(ator);
    }

    public List<Ator> getAtores() {
        return this.atores;
    }

    public void addDiretor(Direcao diretor) {
        this.diretores.add(diretor);
    }

    public void removeDiretor(Direcao diretor) {
        this.diretores.remove(diretor);
    }

    public List<Direcao> getDiretores() {
        return this.diretores;
    }

    public void addProdutor(Producao produtor) {
        this.produtores.add(produtor);
    }

    public void removeProdutor(Producao produtor) {
        this.produtores.remove(produtor);
    }

    public List<Producao> getProdutores() {
        return this.produtores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
