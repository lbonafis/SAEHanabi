/*
 * ControleurRegles.java                                           31 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/** TODO commenter les responsabilités de cette classe
 * 
 */
public class ControleurRegles {
    
    /*
     * Méthode qui affiche de la scène d'accueil
     * si l'utilisateur clique sur le bouton Fermer
     */
    @FXML
    void gererClicFermer(ActionEvent event) {
        Jeu.activerScene('a');
    } 

    /*
     * Méthode qui affiche la 2eme page des règles du jeu
     * si l'utilisateur clique sur le bouton Suivant
     */
    @FXML
    void gererClicSuivant(ActionEvent event) {
        Jeu.activerScene('g');
    }
}
