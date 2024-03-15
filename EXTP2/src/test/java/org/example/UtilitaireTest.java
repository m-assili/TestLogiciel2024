package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UtilitaireTest {
    static Utilitaire utilitaire;

    @BeforeAll
    static void setUp(){
        utilitaire = new Utilitaire();
    }
    @ParameterizedTest
    @CsvSource({"bonsoir, o, 2", "test logiciel, a, 0", "bonjour, j, 1"})
    void testerNbOccurrence(String ch, char c, int exp){
        utilitaire.setChaine(ch);
        int res = utilitaire.nbOccurrence(c);
        assertEquals(exp, res);
    }
}