package atividade;

public class Ator extends Papel {
    private Integer idade;
    private Character sexo;
    private String nacionalidade;

    public Ator(String nome, Integer idade, Character sexo, String nacionalidade) {
        super(nome, "Ator");
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
