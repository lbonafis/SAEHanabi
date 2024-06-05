/*
 * Joueur.java                                           30 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

/** 
 * Classe qui définit les joueurs présents dans la partie
 */
public class Joueur extends Controleur5Joueurs {
    
    
    /** Informations sur le joueur 1 */
    public String[] joueur1 = new String[9];
    
    /** Informations sur le joueur 2 */
    public String[] joueur2 = new String[9];
    
    /** Informations sur le joueur 3 */
    public String[] joueur3 = new String[9];
    
    /** Informations sur le joueur 4 */
    public String[] joueur4 = new String[9];
    
    /** Informations sur le joueur 5 */
    public String[] joueur5 = new String[9];
    
    /** Copie du joueur 1 */
    public static String[] cpJ1 = new String[9];
    
    /** Copie du joueur 2 */
    public static String[] cpJ2 = new String[9];
    
    /** Copie du joueur 3 */
    public static String[] cpJ3 = new String[9];
    
    /** Copie du joueur 4 */
    public static String[] cpJ4 = new String[9];
    
    /** Copie du joueur 5 */
    public static String[] cpJ5 = new String[9];

    /** 
     * Crée les différents joueurs et initialise la couleur et le numéro
     * de leurs cartes sauf celle du Joueur 1 qui sera le 1er à jouer
     * @param nom le nom du joueur
     * @param numJoueur le numéro du joueur à créer
     */
    public Joueur(String nom, int numJoueur) {
        switch(numJoueur) {
        case 1 :
            joueur1[0] = nom;
            Pioche.initPiocheJoueurs(joueur1);
            for (int i = 0 ; i < 9 ; i++) {
                System.out.println(joueur1[i]);
            }
            cpJ1 = joueur1;
            break;
        case 2 :
            joueur2[0] = nom;
            Pioche.initPiocheJoueurs(joueur2);
            for (int i = 0 ; i < 9 ; i++) {
                System.out.println(joueur2[i]);
            }
            cpJ2 = joueur2;
            Controleur5Joueurs.n21.setText(cpJ2[1]);
            Carte.setCouleur(2,2,joueur2[2]);
            Controleur5Joueurs.n22.setText(cpJ2[3]);
            Carte.setCouleur(2,4,joueur2[4]);
            Controleur5Joueurs.n23.setText(cpJ2[5]);
            Carte.setCouleur(2,6,joueur2[6]);
            Controleur5Joueurs.n24.setText(cpJ2[7]);
            Carte.setCouleur(2,8,joueur2[8]);
            break;
        case 3 :
            joueur3[0] = nom;
            Pioche.initPiocheJoueurs(joueur3);
            for (int i = 0 ; i < 9 ; i++) {
                System.out.println(joueur3[i]);
            }
            cpJ3 = joueur3;
            Controleur5Joueurs.n31.setText(cpJ3[1]);
            Carte.setCouleur(3,2,joueur3[2]);
            Controleur5Joueurs.n32.setText(cpJ3[3]);
            Carte.setCouleur(3,4,joueur3[4]);
            Controleur5Joueurs.n33.setText(cpJ3[5]);
            Carte.setCouleur(3,6,joueur3[6]);
            Controleur5Joueurs.n34.setText(cpJ3[7]);
            Carte.setCouleur(3,8,joueur3[8]);
            break;
        case 4 :
            joueur4[0] = nom;
            Pioche.initPiocheJoueurs(joueur4);
            for (int i = 0 ; i < 9 ; i++) {
                System.out.println(joueur4[i]);
            }
            cpJ4 = joueur4;
            Controleur5Joueurs.n41.setText(cpJ4[1]);
            Carte.setCouleur(4,2,joueur4[2]);
            Controleur5Joueurs.n42.setText(cpJ4[3]);
            Carte.setCouleur(4,4,joueur4[4]);
            Controleur5Joueurs.n43.setText(cpJ4[5]);
            Carte.setCouleur(4,6,joueur4[6]);
            Controleur5Joueurs.n44.setText(cpJ4[7]);
            Carte.setCouleur(4,8,joueur4[8]);
            break;
        case 5 :
            joueur5[0] = nom;
            Pioche.initPiocheJoueurs(joueur5);
            for (int i = 0 ; i < 9 ; i++) {
                System.out.println(joueur5[i]);
            }
            cpJ5 = joueur5;
            Controleur5Joueurs.n51.setText(cpJ5[1]);
            Carte.setCouleur(5,2,joueur5[2]);
            Controleur5Joueurs.n52.setText(cpJ5[3]);
            Carte.setCouleur(5,4,joueur5[4]);
            Controleur5Joueurs.n53.setText(cpJ5[5]);
            Carte.setCouleur(5,6,joueur5[6]);
            Controleur5Joueurs.n54.setText(cpJ5[7]);
            Carte.setCouleur(5,8,joueur5[8]);
            break;
        }  
    }
}

