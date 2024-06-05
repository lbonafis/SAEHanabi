/*
 * TestJeton.java                                           5 juin 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application.tests;

import iut.info1.application.*;

/** 
 * Classe de test de la classe Jeton
 */
public class TestJeton extends Jeton {
    
    /** 
     * test des méthodes de la classe Jeton
     */
    public void testJetons() {
        decrementerJetonsBleu();
        decrementerJetonsBleu();
        decrementerJetonsBleu();
        incrementerJetonsBleu();
        decrementerJetonsRouge();
    }
}
