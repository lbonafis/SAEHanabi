/*
 * TestJoueur.java                                           5 juin 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application.tests;

import iut.info1.application.*;

/** 
 * Classe de test de la classe iut.info1.application.Joueur
 * @author Louis Bonafis 
 */
public class TestJoueur {
    
    /** 
     * teste la méthode de création des joueurs
     */
    public static void testJoueur() {
        new Joueur("Jean",1);
        new Joueur("Pierre",2);
        new Joueur("Feuille",3);
        new Joueur("Camion",4);
        new Joueur("Parallélépipède",5);
        for(int i = 0 ; i < 9 ; i++ ) {
            System.out.println(  Joueur.cpJ1[i] +"     |     "+ Joueur.cpJ2[i] +"     |     "
                               + Joueur.cpJ3[i] +"     |     "+ Joueur.cpJ4[i] +"     |     "
                                                          + Joueur.cpJ5[i]);
        }
    }
}
