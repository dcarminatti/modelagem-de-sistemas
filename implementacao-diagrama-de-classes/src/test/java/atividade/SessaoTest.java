package atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SessaoTest {
    Sessao sessao;
    Genero genero;
    Filme filme;
    Sala sala;

    @BeforeEach
    void setUp() {
        genero = new Genero(Genero.TipoGenero.DRAMA);
        filme = new Filme("O Poderoso Chefão", 1972, "Paramount Pictures", "Estados Unidos", "175 min", genero);
        sala = new Sala(1, "Sala 1", 100);

        sessao = new Sessao(new Date(), "20:00", Sessao.EstadoSessao.ABERTA, filme, sala);
    }

    @Test
    void deveVenderIngresso() {
        Ingresso ingresso = new Ingresso(1, 50, Ingresso.TipoIngresso.MEIA, 20.0f, "01/01/2021");

        sessao.venderIngressos(ingresso);

        assertEquals(99, sessao.getIngressosRestantes());
    }

    @Test
    void deveNaoVenderIngresso() {
        Ingresso ingresso = new Ingresso(1, 50, Ingresso.TipoIngresso.MEIA, 20.0f, "01/01/2021");

        for (int i = 0; i < 100; i++) {
            sessao.venderIngressos(ingresso);
        }

        assertThrows(RuntimeException.class, () -> sessao.venderIngressos(ingresso));
    }

    @Test
    void deveExibirSessao() {
        sessao.exibirSessao();
    }

    @Test
    void deveRetornarDataSessao() {
        assertNotNull(sessao.getDataSessao());
    }

    @Test
    void deveRetornarHoraSessao() {
        assertEquals("20:00", sessao.getHoraSessao());
    }

    @Test
    void deveRetornarEstadoSessao() {
        assertEquals(Sessao.EstadoSessao.ABERTA, sessao.getEstadoSessao());
    }

    @Test
    void deveRetornarIngressosSessao() {
        assertEquals(100, sessao.getIngressosSessao());
    }

    @Test
    void deveRetornarIngressosComprados() {
        assertEquals(0, sessao.getIngressosComprados());
    }

    @Test
    void deveRetornarIngressosRestantes() {
        assertEquals(100, sessao.getIngressosRestantes());
    }

    @Test
    void deveRetornarFilme() {
        assertEquals(filme, sessao.getFilme());
    }

    @Test
    void deveRetornarSala() {
        assertEquals(sala, sessao.getSala());
    }
}