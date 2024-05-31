/*
 * Partie.java                                           30 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

/** 
 * Classe qui gère la partie en cours
 * @author Louis Bonafis
 * @version 1.0
 */
public class Partie {
    
    /** 
     * Classe appelée quand la partie commence
     * @param args
     */
    public static void lancerPartie() {
        Carte.melangerCartes();
        String[][] pioche = Pioche.creerPioche();
        
        for(int i = 1 ; i < 50 ; i++ ) {
            System.out.printf("Carte :  %s %s \n", pioche[i][1], pioche[i][0]);
        }
    }
    
    /** TODO commenter le rôle de cette méthode (SRP)
     * @param args
     */
    public static void main(String[] args) {
        lancerPartie();
    }
}