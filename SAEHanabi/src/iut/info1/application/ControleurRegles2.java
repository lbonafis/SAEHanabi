/*
 * ControleurRegles2.java                                           31 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/** TODO commenter les responsabilités de cette classe
 * 
 */
public class ControleurRegles2 {
    
    /*
     * Méthode qui affichage de la scène de choix des joueurs 
     * si l'utilisateur clique sur le bouton Retour
     */
    @FXML
    void gererClicRetour(ActionEvent event) {
        Jeu.activerScene('r');
    } 

    /*
     * Méthode qui affiche la page d'accueil
     * si l'utilisateur clique sur le bouton OK
     */
    @FXML
    void gererClicOK(ActionEvent event) {
        Jeu.activerScene('a');
    }
}
