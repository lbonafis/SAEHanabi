/*
 * Carte.java                                           31 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

import java.util.Random;
import javafx.scene.paint.Color;

/** 
 * Classe qui crée et manipule les cartes selon les demandes de l'utilisateur
 * @author Louis Bonafis
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
     * mélange les cartes du jeu en changeant leur position 
     * dans les listes à l'aide de Math.Random 
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

    /** 
     * 
     * @return nouvelleCarte la carte crée
     */
    public static String[] getCarte() {
        String[] nouvelleCarte = new String [2];
        nouvelleCarte[0] = couleur[indiceCarte];
        nouvelleCarte[1] = numero[indiceCarte];
        
        
        indiceCarte--;
        return nouvelleCarte;
    }
    
    /** 
     * Affiche la couleur de la carte passée en paramètre
     * @param couleur Couleur de la carte
     * @param indiceCouleur Indice de la couleur dans le tableau du joueur
     * @param indiceJoueur Indice du joueur pour lequel il faut afficher la carte
     */
    public static void setCouleur(int indiceJoueur, int indiceCouleur, String couleur) {
        switch(couleur) {
        case "vert" : 
            switch(indiceJoueur) {
            case 1 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j11.setFill(Color.YELLOWGREEN);
                    break;
                case 4 :
                    Controleur5Joueurs.j12.setFill(Color.YELLOWGREEN);
                    break;
                case 6 :
                    Controleur5Joueurs.j13.setFill(Color.YELLOWGREEN);
                    break;
                case 8 :
                    Controleur5Joueurs.j14.setFill(Color.YELLOWGREEN);
                    break;
                }
                break;
            case 2 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j21.setFill(Color.YELLOWGREEN);
                    break;
                case 4 :
                    Controleur5Joueurs.j22.setFill(Color.YELLOWGREEN);
                    break;
                case 6 :
                    Controleur5Joueurs.j23.setFill(Color.YELLOWGREEN);
                    break;
                case 8 :
                    Controleur5Joueurs.j24.setFill(Color.YELLOWGREEN);
                    break;
                }
                break;
            case 3 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j31.setFill(Color.YELLOWGREEN);
                    break;
                case 4 :
                    Controleur5Joueurs.j32.setFill(Color.YELLOWGREEN);
                    break;
                case 6 :
                    Controleur5Joueurs.j33.setFill(Color.YELLOWGREEN);
                    break;
                case 8 :
                    Controleur5Joueurs.j34.setFill(Color.YELLOWGREEN);
                    break;
                }
                break;
            case 4 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j41.setFill(Color.YELLOWGREEN);
                    break;
                case 4 :
                    Controleur5Joueurs.j42.setFill(Color.YELLOWGREEN);
                    break;
                case 6 :
                    Controleur5Joueurs.j43.setFill(Color.YELLOWGREEN);
                    break;
                case 8 :
                    Controleur5Joueurs.j44.setFill(Color.YELLOWGREEN);
                    break;
                }
                break;
            case 5 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j51.setFill(Color.YELLOWGREEN);
                    break;
                case 4 :
                    Controleur5Joueurs.j52.setFill(Color.YELLOWGREEN);
                    break;
                case 6 :
                    Controleur5Joueurs.j53.setFill(Color.YELLOWGREEN);
                    break;
                case 8 :
                    Controleur5Joueurs.j54.setFill(Color.YELLOWGREEN);
                    break;
                }
                break;
            }
            break;
        case "bleu" : 
            switch(indiceJoueur) {
            case 1 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j11.setFill(Color.CYAN);
                    break;
                case 4 :
                    Controleur5Joueurs.j12.setFill(Color.CYAN);
                    break;
                case 6 :
                    Controleur5Joueurs.j13.setFill(Color.CYAN);
                    break;
                case 8 :
                    Controleur5Joueurs.j14.setFill(Color.CYAN);
                    break;
                }
            case 2 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j21.setFill(Color.CYAN);
                    break;
                case 4 :
                    Controleur5Joueurs.j22.setFill(Color.CYAN);
                    break;
                case 6 :
                    Controleur5Joueurs.j23.setFill(Color.CYAN);
                    break;
                case 8 :
                    Controleur5Joueurs.j24.setFill(Color.CYAN);
                    break;
                }
                break;
            case 3 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j31.setFill(Color.CYAN);
                    break;
                case 4 :
                    Controleur5Joueurs.j32.setFill(Color.CYAN);
                    break;
                case 6 :
                    Controleur5Joueurs.j33.setFill(Color.CYAN);
                    break;
                case 8 :
                    Controleur5Joueurs.j34.setFill(Color.CYAN);
                    break;
                }
                break;
            case 4 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j41.setFill(Color.CYAN);
                    break;
                case 4 :
                    Controleur5Joueurs.j42.setFill(Color.CYAN);
                    break;
                case 6 :
                    Controleur5Joueurs.j43.setFill(Color.CYAN);
                    break;
                case 8 :
                    Controleur5Joueurs.j44.setFill(Color.CYAN);
                    break;
                }
                break;
            case 5 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j51.setFill(Color.CYAN);
                    break;
                case 4 :
                    Controleur5Joueurs.j52.setFill(Color.CYAN);
                    break;
                case 6 :
                    Controleur5Joueurs.j53.setFill(Color.CYAN);
                    break;
                case 8 :
                    Controleur5Joueurs.j54.setFill(Color.CYAN);
                    break;
                }
                break;
            }
            break;
        case "blanc" : 
            switch(indiceJoueur) {
            case 1 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j11.setFill(Color.WHITE);
                    break;
                case 4 :
                    Controleur5Joueurs.j12.setFill(Color.WHITE);
                    break;
                case 6 :
                    Controleur5Joueurs.j13.setFill(Color.WHITE);
                    break;
                case 8 :
                    Controleur5Joueurs.j14.setFill(Color.WHITE);
                    break;
                }
            case 2 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j21.setFill(Color.WHITE);
                    break;
                case 4 :
                    Controleur5Joueurs.j22.setFill(Color.WHITE);
                    break;
                case 6 :
                    Controleur5Joueurs.j23.setFill(Color.WHITE);
                    break;
                case 8 :
                    Controleur5Joueurs.j24.setFill(Color.WHITE);
                    break;
                }
                break;
            case 3 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j31.setFill(Color.WHITE);
                    break;
                case 4 :
                    Controleur5Joueurs.j32.setFill(Color.WHITE);
                    break;
                case 6 :
                    Controleur5Joueurs.j33.setFill(Color.WHITE);
                    break;
                case 8 :
                    Controleur5Joueurs.j34.setFill(Color.WHITE);
                    break;
                }
                break;
            case 4 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j41.setFill(Color.WHITE);
                    break;
                case 4 :
                    Controleur5Joueurs.j42.setFill(Color.WHITE);
                    break;
                case 6 :
                    Controleur5Joueurs.j43.setFill(Color.WHITE);
                    break;
                case 8 :
                    Controleur5Joueurs.j44.setFill(Color.WHITE);
                    break;
                }
                break;
            case 5 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j51.setFill(Color.WHITE);
                    break;
                case 4 :
                    Controleur5Joueurs.j52.setFill(Color.WHITE);
                    break;
                case 6 :
                    Controleur5Joueurs.j53.setFill(Color.WHITE);
                    break;
                case 8 :
                    Controleur5Joueurs.j54.setFill(Color.WHITE);
                    break;
                }
                break;
            }
            
            break;
        case "jaune" : 
            switch(indiceJoueur) {
            case 1 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j11.setFill(Color.YELLOW);
                    break;
                case 4 :
                    Controleur5Joueurs.j12.setFill(Color.YELLOW);
                    break;
                case 6 :
                    Controleur5Joueurs.j13.setFill(Color.YELLOW);
                    break;
                case 8 :
                    Controleur5Joueurs.j14.setFill(Color.YELLOW);
                    break;
                }
            case 2 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j21.setFill(Color.YELLOW);
                    break;
                case 4 :
                    Controleur5Joueurs.j22.setFill(Color.YELLOW);
                    break;
                case 6 :
                    Controleur5Joueurs.j23.setFill(Color.YELLOW);
                    break;
                case 8 :
                    Controleur5Joueurs.j24.setFill(Color.YELLOW);
                    break;
                }
                break;
            case 3 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j31.setFill(Color.YELLOW);
                    break;
                case 4 :
                    Controleur5Joueurs.j32.setFill(Color.YELLOW);
                    break;
                case 6 :
                    Controleur5Joueurs.j33.setFill(Color.YELLOW);
                    break;
                case 8 :
                    Controleur5Joueurs.j34.setFill(Color.YELLOW);
                    break;
                }
                break;
            case 4 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j41.setFill(Color.YELLOW);
                    break;
                case 4 :
                    Controleur5Joueurs.j42.setFill(Color.YELLOW);
                    break;
                case 6 :
                    Controleur5Joueurs.j43.setFill(Color.YELLOW);
                    break;
                case 8 :
                    Controleur5Joueurs.j44.setFill(Color.YELLOW);
                    break;
                }
                break;
            case 5 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j51.setFill(Color.YELLOW);
                    break;
                case 4 :
                    Controleur5Joueurs.j52.setFill(Color.YELLOW);
                    break;
                case 6 :
                    Controleur5Joueurs.j53.setFill(Color.YELLOW);
                    break;
                case 8 :
                    Controleur5Joueurs.j54.setFill(Color.YELLOW);
                    break;
                }
                break;
            }
            break;
        case "rouge" : 
            switch(indiceJoueur) {
            case 1 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j11.setFill(Color.RED);
                    break;
                case 4 :
                    Controleur5Joueurs.j12.setFill(Color.RED);
                    break;
                case 6 :
                    Controleur5Joueurs.j13.setFill(Color.RED);
                    break;
                case 8 :
                    Controleur5Joueurs.j14.setFill(Color.RED);
                    break;
                }
            case 2 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j21.setFill(Color.RED);
                    break;
                case 4 :
                    Controleur5Joueurs.j22.setFill(Color.RED);
                    break;
                case 6 :
                    Controleur5Joueurs.j23.setFill(Color.RED);
                    break;
                case 8 :
                    Controleur5Joueurs.j24.setFill(Color.RED);
                    break;
                }
                break;
            case 3 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j31.setFill(Color.RED);
                    break;
                case 4 :
                    Controleur5Joueurs.j32.setFill(Color.RED);
                    break;
                case 6 :
                    Controleur5Joueurs.j33.setFill(Color.RED);
                    break;
                case 8 :
                    Controleur5Joueurs.j34.setFill(Color.RED);
                    break;
                }
                break;
            case 4 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j41.setFill(Color.RED);
                    break;
                case 4 :
                    Controleur5Joueurs.j42.setFill(Color.RED);
                    break;
                case 6 :
                    Controleur5Joueurs.j43.setFill(Color.RED);
                    break;
                case 8 :
                    Controleur5Joueurs.j44.setFill(Color.RED);
                    break;
                }
                break;
            case 5 :
                switch(indiceCouleur) {
                case 2 :
                    Controleur5Joueurs.j51.setFill(Color.RED);
                    break;
                case 4 :
                    Controleur5Joueurs.j52.setFill(Color.RED);
                    break;
                case 6 :
                    Controleur5Joueurs.j53.setFill(Color.RED);
                    break;
                case 8 :
                    Controleur5Joueurs.j54.setFill(Color.RED);
                    break;
                }
                break;
            }
            break;
        }
    }
}
