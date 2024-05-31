// ControleurAccueil.java                                            30 mai 2024
package iut.info1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Classe qui joue le rôle du contrôleur dans l'application calcul du prix à payer en
 * fonction d'un taux de réduction et d'un bon de réduction
 * REMARQUE : on trouve dans cette classe un attribut de type CalculReduction. Cette
 * instance est le modèle géré par le contrôleur. C'est grâce à elle que les vérifications
 * des saisies sont faites, ainsi que les calculs des résultats (prix à payer et économie)
 * @author Louis Bonafis
 * @version 1.0
 */
public class ControleurAccueil {


    /*
     * Méthode qui affichage de la scène de choix des joueurs 
     * si l'utilisateur clique sur le bouton NouvellePartie
     */
    @FXML
    void gererClicNouvellePartie(ActionEvent event) {
        Jeu.activerScene('s');
    } 

    /*
     * Méthode qui affichage de la scène des règles du jeu 
     * si l'utilisateur clique sur le bouton Règles
     */
    @FXML
    void gererClicReglesJeu(ActionEvent event) {

        // affichage de la scène des règles du jeu
        Jeu.activerScene('r');
    }
}