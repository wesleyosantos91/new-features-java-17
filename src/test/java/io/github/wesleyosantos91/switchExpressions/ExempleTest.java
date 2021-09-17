package io.github.wesleyosantos91.switchExpressions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExempleTest {

    private Exemple exemple;

    @BeforeEach
    void setUp() {
        exemple = new Exemple();
    }

    @Test
    void getNumberMonth() {
        Integer expected = 6;
        Integer result = exemple.getNumberMonth(Month.JUNE);
        assertEquals(result, expected);
    }
}