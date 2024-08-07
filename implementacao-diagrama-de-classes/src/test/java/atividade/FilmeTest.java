package atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {
    Filme filme;

    @BeforeEach
    void setUp() {
        Genero genero = new Genero(Genero.TipoGenero.DRAMA);
        filme = new Filme("O Poderoso Chefão", 1972, "Paramount Pictures", "Estados Unidos", "175 min", genero);
    }

    @Test
    void deveRetornarTitulo() {
        assertEquals("O Poderoso Chefão", filme.getTitulo());
    }

    @Test
    void deveRetornarAno() {
        assertEquals(1972, filme.getAno());
    }

    @Test
    void deveRetornarProdutora() {
        assertEquals("Paramount Pictures", filme.getProdutora());
    }

    @Test
    void deveRetornarPaisOrigem() {
        assertEquals("Estados Unidos", filme.getPaisOrigem());
    }

    @Test
    void deveRetornarDuracao() {
        assertEquals("175 min", filme.getDuracao());
    }

    @Test
    void deveRetornarGenero() {
        assertEquals("Drama", filme.getGenero().getNomeGenero());
    }

    @Test
    void deveAdicionarAtor() {
        Ator ator = new Ator("Marlon Brando", 20, 'M', "Estadunidense");

        filme.addAtor(ator);

        assertTrue(filme.getAtores().contains(ator));
    }

    @Test
    void deveRemoverAtor() {
        Ator ator = new Ator("Marlon Brando", 20, 'M', "Estadunidense");

        filme.addAtor(ator);
        filme.removeAtor(ator);

        assertFalse(filme.getAtores().contains(ator));
    }

    @Test
    void deveRetornarAtores() {
        Ator ator = new Ator("Marlon Brando", 20, 'M', "Estaduniense");

        filme.addAtor(ator);

        assertEquals(ator, filme.getAtores().getFirst());
    }

    @Test
    void deveAdicionarDiretor() {
        Direcao diretor = new Direcao("Francis Ford Coppola", "Executivo");

        filme.addDiretor(diretor);

        assertTrue(filme.getDiretores().contains(diretor));
    }

    @Test
    void deveRemoverDiretor() {
        Direcao diretor = new Direcao("Francis Ford Coppola", "Executivo");

        filme.addDiretor(diretor);
        filme.removeDiretor(diretor);

        assertFalse(filme.getDiretores().contains(diretor));
    }

    @Test
    void deveRetornarDiretores() {
        Direcao diretor = new Direcao("Francis Ford Coppola", "Executivo");

        filme.addDiretor(diretor);

        assertEquals(diretor, filme.getDiretores().getFirst());
    }

    @Test
    void deveAdicionarProdutor() {
        Producao produtor = new Producao("Albert S. Ruddy", "Executivo");

        filme.addProdutor(produtor);

        assertTrue(filme.getProdutores().contains(produtor));
    }

    @Test
    void deveRemoverProdutor() {
        Producao produtor = new Producao("Albert S. Ruddy", "Executivo");

        filme.addProdutor(produtor);
        filme.removeProdutor(produtor);

        assertFalse(filme.getProdutores().contains(produtor));
    }

    @Test
    void deveRetornarProdutores() {
        Producao produtor = new Producao("Albert S. Ruddy", "Executivo");

        filme.addProdutor(produtor);

        assertEquals(produtor, filme.getProdutores().getFirst());
    }
}