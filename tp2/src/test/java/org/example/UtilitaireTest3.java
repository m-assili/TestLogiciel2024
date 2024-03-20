package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class UtilitaireTest3 {

    private static Utilitaire utilitaire;
    @BeforeAll
    static void setUp() {
        utilitaire = new Utilitaire();
    }
    @ParameterizedTest
    @CsvSource({"gabes, g, 1","tunisie, i, 2", "abracadabra, a, 5", "bonjour, z, 0", "welcome, L, 1"})
    void testerNbOccurrence(String ch, char c, int expect){
       utilitaire.setChaine(ch);
       int res = utilitaire.nbOccurrence(c);
       assertEquals(expect,res);
    }
}
/*
* Pour utiliser les tests paramétrés il faut ajouter la dépendance
* junit-jupiter-params
* */