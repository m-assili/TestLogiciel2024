package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UtilitaireTest2 {
    static Utilitaire utilitaire;

    @BeforeAll
    static void setUp(){
        utilitaire = new Utilitaire();
    }
    @ParameterizedTest
    @ValueSource(strings = {"radar","elle","kayak","Kayak","RADAR",""})
    void testerEstPalindrome(String ch){
        utilitaire.setChaine(ch);
        assertTrue(utilitaire.estPalindrome());
    }
    @ParameterizedTest
    @ValueSource(strings = {"radar1","Telle","kanoi","istqb"})
    void testerNonPalindrome(String ch){
        utilitaire.setChaine(ch);
        assertFalse(utilitaire.estPalindrome());
    }

}