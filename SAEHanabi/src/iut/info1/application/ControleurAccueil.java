// ControleurAccueil.java                                            30 mai 2024
package iut.info1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Contrôleur de la page VueAccueil.fxml
 * @author louis.bonafis
 */
public class ControleurAccueil {


    /*
     * Méthode qui affiche de la scène de choix des joueurs 
     * si l'utilisateur clique sur le bouton NouvellePartie
     */
    @FXML
    void gererClicNouvellePartie(ActionEvent event) {
        Jeu.activerScene('s');
    } 

    /*
     * Méthode qui affiche la scène des règles du jeu 
     * si l'utilisateur clique sur le bouton Règles
     */
    @FXML
    void gererClicReglesJeu(ActionEvent event) {
        Jeu.activerScene('r');
    }
}