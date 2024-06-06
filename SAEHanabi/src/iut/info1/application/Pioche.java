/*
 * Pioche.java                                           30 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

/** 
 * Demande la création de cartes à la classe Carte
 * et s'en sert pour créer la pioches dans laquelle 
 * les différentes cartes seront distribuées 
 * @author louis.bonafis
 */
public class Pioche {

    /** Nombre de cartes dans la pioche */
    public static int NB_CARTES_PIOCHE = 50;
    
    /** Pioche du jeu */
    public static String[][] pioche;    
    
    /** Indice de la carte à piocher dans la pioche */
    public static int indiceCarteAPiocher = 49;
    
    /** 
     * Crée la pioche du jeu
     */
    public static void creerPioche() {

        pioche = new String[50][2] ;
        String[] nouvelleCarte = new String[10];
        
        for(int i = 0 ; i < NB_CARTES_PIOCHE ; i++ ) {
            nouvelleCarte = Carte.getCarte();
            pioche[i][0]= nouvelleCarte[0];
            pioche[i][1]= nouvelleCarte[1];
        }
        for(int i = 0 ; i < 50 ; i++ ) {
            System.out.printf("Carte :  %s %s \n", pioche[i][1], pioche[i][0]);
        }
    }
    
    /** 
     * Modifie l'affichage nombre de cartes dans la pioche
     */
    public void setPioche() {
        Controleur5Joueurs.nbPioche.setText(Integer.toString(NB_CARTES_PIOCHE));
    }
    
    /**
     * Initialise les cartes de chaque joueur
     * @param joueur le joueur qui doit piocher
     * @return le joueur avec ses nouvelles cartes
     */
    public static String[] initPiocheJoueurs(String[] joueur) {
        for (int i = 1 ; i < 9 ; i++) {
            joueur[i] = pioche[indiceCarteAPiocher][1];
            i++;
            joueur[i] = pioche[indiceCarteAPiocher][0];
            indiceCarteAPiocher--;
            NB_CARTES_PIOCHE--;
        }
        return joueur;
        
    }   

}