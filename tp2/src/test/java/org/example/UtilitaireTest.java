package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitaireTest {

    static Utilitaire utilitaire;
    @BeforeAll
    static void setUp(){
        utilitaire = new Utilitaire();
    }
    @Test
    @DisplayName("o dans bonjour")
    void nbOccurrence1() {
        utilitaire.setChaine("bonjour");
        assertEquals(2,utilitaire.nbOccurrence('o'));
    }
    @Test
    @DisplayName("O dans bonjour")
    void nbOccurrence2() {
        utilitaire.setChaine("bonjour");
        assertEquals(2,utilitaire.nbOccurrence('O'));
    }
    @Test
    @DisplayName("b dans bonjour")
    void nbOccurrence3() {
        utilitaire.setChaine("bonjour");
        assertEquals(1,utilitaire.nbOccurrence('b'));
    }
    @Test
    @DisplayName("z dans bonjour")
    void nbOccurrence4() {
        utilitaire.setChaine("bonjour");
        assertEquals(0,utilitaire.nbOccurrence('z'));
    }
}