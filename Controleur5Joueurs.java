/*
 * Controleur5Joueurs.java                                           30 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/** TODO commenter les responsabilités de cette classe
 * 
 */
public class Controleur5Joueurs {
    /*
     * Méthode qui affichage de la scène d'accueil
     * si l'utilisateur clique sur le bouton Quitter
     */
    @FXML
    void gererClicQuitter(ActionEvent event) {
        Jeu.activerScene('a');
    } 

    /*
     * Méthode qui permet d'enregistrer la partie
     * si l'utilisateur clique sur le bouton Sauvegarder
     */
    @FXML
    void gererClicSauvegarder(ActionEvent event) {
        Jeu.activerScene('a'); // temporaire
    } 

    /*
     * Méthode qui passe au tour suivant de la partie
     * si l'utilisateur clique sur le bouton Tour suivant
     */
    @FXML
    void gererClicTourSuivant(ActionEvent event) {
        Jeu.activerScene('a'); // temporaire
    }  
}
