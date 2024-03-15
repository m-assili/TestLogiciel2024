package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import static org.junit.jupiter.api.Assertions.*;

@Suite
@SelectClasses({UtilitaireTest.class,UtilitaireTest2.class})
class UtilitaireTestSuite {

}