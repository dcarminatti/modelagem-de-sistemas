package atividade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngressoTest {
    Ingresso ingresso;

    @BeforeEach
    void setUp() {
        ingresso = new Ingresso(1, 1, Ingresso.TipoIngresso.INTEIRA, 50.0f, "01/01/2021");
    }

    @Test
    void deveImprimirIngresso() {
        ingresso.imprimirIngresso();
    }
}