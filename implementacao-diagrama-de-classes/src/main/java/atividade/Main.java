package atividade;

import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        Sessao sessao = getSessao();

        Ingresso ingresso1 = new Ingresso(1, 1, Ingresso.TipoIngresso.INTEIRA, 50.0f, "01/01/2021");
        Ingresso ingresso2 = new Ingresso(2, 2, Ingresso.TipoIngresso.MEIA, 25.0f, "01/01/2021");

        sessao.exibirSessao();

        ingresso1.imprimirIngresso();
        ingresso2.imprimirIngresso();

        sessao.venderIngressos(ingresso1);
        sessao.venderIngressos(ingresso2);

        sessao.exibirSessao();
    }

    private static Sessao getSessao() {
        Genero genero = new Genero(Genero.TipoGenero.DRAMA);

        Ator ator1 = new Ator("Ator 1", 30, 'M', "Brasileiro");
        Ator ator2 = new Ator("Ator 2", 40, 'F', "Estadunidense");

        Direcao diretor = new Direcao("Diretor 1", "Executivo");

        Producao producao1 = new Producao("Produtor 1", "Executivo");
        Producao producao2 = new Producao("Produtor 2", "Auxiliar");

        Filme filme = new Filme("Filme 1", 2021, "Produtora", "Brasil", "2h", genero);
        filme.addAtor(ator1);
        filme.addAtor(ator2);
        filme.addDiretor(diretor);
        filme.addProdutor(producao1);
        filme.addProdutor(producao2);

        Sala sala = new Sala(1, "Sala 1", 100);

        return new Sessao(new Date(), "20:00", Sessao.EstadoSessao.ABERTA, filme, sala);
    }
}