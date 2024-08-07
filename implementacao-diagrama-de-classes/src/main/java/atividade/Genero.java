package atividade;

public class Genero {
    private String nomeGenero;

    public enum TipoGenero {
        ACAO,
        AVENTURA,
        COMEDIA,
        DRAMA,
        FICCAO,
        TERROR
    }

    public Genero(TipoGenero tipoGenero) {
        this.setNomeGenero(tipoGenero);
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(TipoGenero tipoGenero) {
        switch (tipoGenero) {
            case ACAO:
                this.nomeGenero = "Ação";
                break;
            case AVENTURA:
                this.nomeGenero = "Aventura";
                break;
            case COMEDIA:
                this.nomeGenero = "Comédia";
                break;
            case DRAMA:
                this.nomeGenero = "Drama";
                break;
            case FICCAO:
                this.nomeGenero = "Ficção";
                break;
            case TERROR:
                this.nomeGenero = "Terror";
                break;
        }
    }
}
