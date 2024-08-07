package atividade;

public class Papel {
    private String nome;
    private String papel;

    public Papel(String nome, String papel) {
        this.nome = nome;
        this.papel = papel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
}
