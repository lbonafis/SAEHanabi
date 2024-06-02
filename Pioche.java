/*
 * Pioche.java                                           30 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

/** 
 * Demande la création de cartes à la classe Carte
 * et s'en sert pour créer la pioches dans laquelle 
 * les différentes cartes seront distribuées 
 */
public class Pioche extends Controleur5Joueurs {

    /** Nombre de cartes dans la pioche */
    public final int NB_CARTES_PIOCHE = 50;
    /** 
     * Crée la pioche du jeu
     * @return pioche la pioche crée
     */
    public static String[][] creerPioche() {

        String[][] pioche = new String[50][2] ;
        String[] nouvelleCarte = new String[10];
        
        for(int i = 0 ; i < 50 ; i++ ) {
            nouvelleCarte = Carte.getCarte();
            pioche[i][0]= nouvelleCarte[0];
            pioche[i][1]= nouvelleCarte[1];
        }
        return pioche;

    }
    
    /** 
     * Initialise le nombre de cartes dans la pioche
     */
    public void setPioche() {
        nbPioche.setText(Integer.toString(NB_CARTES_PIOCHE));
    }
    

}