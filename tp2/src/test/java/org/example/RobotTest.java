package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    static Robot robot;
    @BeforeAll
    static void setUp(){
        robot = new Robot("Wall-E");
    }

    @Test
    @DisplayName("avance 2")
    void testerPosition1(){
        robot.avance();
        robot.avance();
        assertEquals("(0,2)Nord", robot.getPosition());
    }

    @Test
    @DisplayName("avancer 2 tourner D avancer 1")
    void testerPosition2(){
        robot.avance();
        robot.avance();
        robot.droite();
        robot.avance();
        assertEquals("(1,4)Ouest", robot.getPosition());
    }
    @Test
    @DisplayName("tourner 3 fois")
    void testerPosition3(){
        robot.droite();
        robot.droite();
        robot.droite();
        assertEquals("(1,4)Nord", robot.getPosition());
    }
}