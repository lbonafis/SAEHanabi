/*
 * Carte.java                                           31 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

import java.util.Random;

/** TODO commenter les responsabilités de cette classe
 * 
 */
public class Carte extends Controleur5Joueurs {
    
    private static String[] couleur = {"blanc", "blanc", "blanc", "blanc", "blanc", "blanc", "blanc", "blanc", "blanc", "blanc", 
                                       "rouge", "rouge", "rouge", "rouge", "rouge", "rouge", "rouge", "rouge", "rouge", "rouge",
                                       "jaune", "jaune", "jaune", "jaune", "jaune", "jaune", "jaune", "jaune", "jaune", "jaune",
                                       "vert", "vert", "vert", "vert", "vert", "vert", "vert", "vert", "vert", "vert",
                                       "bleu", "bleu", "bleu", "bleu", "bleu", "bleu", "bleu", "bleu", "bleu", "bleu" };
    
    private static String[] numero = {"1", "1", "1", "2", "2", "3", "3", "4", "4", "5",
                                      "1", "1", "1", "2", "2", "3", "3", "4", "4", "5",
                                      "1", "1", "1", "2", "2", "3", "3", "4", "4", "5",
                                      "1", "1", "1", "2", "2", "3", "3", "4", "4", "5",
                                      "1", "1", "1", "2", "2", "3", "3", "4", "4", "5" };
    
    /** indice de la carte à créer */
    public static int indiceCarte = 49;
    
    
    /** 
     * mélange les cartes du jeu 
     */
    public static void melangerCartes() {
        
        String couleurAEchanger;
        String numeroAEchanger;
        
        java.util.Random r = new Random();
        for(int i = 0 ; i < 500 ; i++) {
            int a = r.nextInt(50);
            int b = r.nextInt(50);
            
            couleurAEchanger = couleur[a];
            couleur[a] = couleur[b];
            couleur[b] = couleurAEchanger;
            
            numeroAEchanger = numero[a];
            numero[a] = numero[b];
            numero[b] = numeroAEchanger;
        }
        for(int i = 0 ; i < 50 ; i++) {
            System.out.printf("couleur : %s   numero : %s \n", couleur[i], numero[i]);
        }  
    }
    
    /** TODO commenter le rôle de cette méthode (SRP)
     * @param args
     */
    public static void main(String[] args) {
        melangerCartes();
    }
    

    /** TODO commenter le rôle de cette méthode (SRP)
     * @return nouvelleCarte la carte crée
     */
    public static String[] getCarte() {
        String[] nouvelleCarte = new String [2];
        nouvelleCarte[0] = couleur[indiceCarte];
        nouvelleCarte[1] = numero[indiceCarte];
        
        
        indiceCarte--;
        return nouvelleCarte;
    }
}
