package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilitaireTest2 {

    static Utilitaire utilitaire;
    @BeforeAll
    static void setUp(){
        utilitaire = new Utilitaire();
    }
    @Test
    @DisplayName("radar")
    void estPalindrome1() {
        utilitaire.setChaine("radar");
        assertTrue(utilitaire.estPalindrome());
    }
    @Test
    @DisplayName("elle")
    void estPalindrome2() {
        utilitaire.setChaine("elle");
        assertTrue(utilitaire.estPalindrome());
    }
    @Test
    @DisplayName("KayAk")
    void estPalindrome3() {
        utilitaire.setChaine("KayAk");
        assertTrue(utilitaire.estPalindrome());
    }
    @Test
    @DisplayName("istqb")
    void NonPalindrome1() {
        utilitaire.setChaine("istqb");
        assertFalse(utilitaire.estPalindrome());
    }
    @Test
    @DisplayName("TesT Logiciel")
    void NonPalindrome2() {
        utilitaire.setChaine("Test Logiciel");
        assertFalse(utilitaire.estPalindrome());
    }
}