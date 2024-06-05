/*
 * TestCarte.java                                           5 juin 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application.tests;

import iut.info1.application.*;


/** 
 * Classe de tests unitaires de la classe iut.info1.application.Carte
 * @author Louis Bonafis
 */
public class TestCarte {
    
    /** 
     * Test du constructeur mélanger cartes
     */
    public static void testMelangerCartes(){
        System.out.println("Mélange1");
        Carte.melangerCartes();
        System.out.println("Mélange2");
        Carte.melangerCartes();
    }
    
    /** 
     * test de la méthode qui affiche les couleurs de cartes
     */
    public static void testSetCouleur() {
        // teste les couleurs pour le joueur 1
        Carte.setCouleur(1,2,"vert");
        Carte.setCouleur(1,4,"jaune");
        Carte.setCouleur(1,6,"blanc");
        Carte.setCouleur(1,8,"rouge");
        Carte.setCouleur(1,4,"bleu");
        // teste les couleurs pour le joueur 2
        Carte.setCouleur(2,2,"bleu");
        Carte.setCouleur(2,4,"vert");
        Carte.setCouleur(2,6,"jaune");
        Carte.setCouleur(2,8,"blanc");
        Carte.setCouleur(2,4,"rouge");
        // teste les couleurs pour le joueur 3
        Carte.setCouleur(3,2,"rouge");
        Carte.setCouleur(3,4,"bleu");
        Carte.setCouleur(3,6,"vert");
        Carte.setCouleur(3,8,"jaune");
        Carte.setCouleur(3,4,"blanc");
        // teste les couleurs pour le joueur 4
        Carte.setCouleur(4,2,"blanc");
        Carte.setCouleur(4,4,"rouge");
        Carte.setCouleur(4,6,"bleu");
        Carte.setCouleur(4,8,"vert");
        Carte.setCouleur(4,4,"jaune");
        // teste les couleurs pour le joueur 5
        Carte.setCouleur(5,2,"bleu");
        Carte.setCouleur(5,4,"vert");
        Carte.setCouleur(5,6,"jaune");
        Carte.setCouleur(5,8,"blanc");
        Carte.setCouleur(5,4,"rouge");
    }
}


