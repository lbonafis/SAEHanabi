/*
 * ControleurSelectionNbJoueurs.java                                           30 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Contrôleur de la page VueSelectionNbJoueurs.fxml
 * @author louis.bonafis
 */
public class ControleurSelectionNbJoueurs {


    /*
     * Méthode qui affichage de la scène de la partie
     * à 2 joueur si l'utilisateur clique sur le bouton 2
     */
    @FXML
    void gererClic2Joueurs(ActionEvent event) {
        Jeu.activerScene('p');
        ControleurChoixPseudo.nbJoueur = 2;
    } 

    /*
     * Méthode qui affichage de la scène de la partie
     * à 3 joueur si l'utilisateur clique sur le bouton 3
     */
    @FXML
    void gererClic3Joueurs(ActionEvent event) {
        Jeu.activerScene('p');
        ControleurChoixPseudo.nbJoueur = 3;
    } 

    /*
     * Méthode qui affichage de la scène de la partie
     * à 4 joueur si l'utilisateur clique sur le bouton 4
     */
    @FXML
    void gererClic4Joueurs(ActionEvent event) {
        Jeu.activerScene('p');
        ControleurChoixPseudo.nbJoueur = 4;
    } 

    /*
     * Méthode qui affichage de la scène de la partie
     * à 5 joueur si l'utilisateur clique sur le bouton 5
     */
    @FXML
    void gererClic5Joueurs(ActionEvent event) {
        Jeu.activerScene('p');
        ControleurChoixPseudo.nbJoueur = 5;
    }   
    
    /*
     * Méthode qui affichage de la scène d'accueil
     * si l'utilisateur clique sur le bouton Retour
     */
    @FXML
    void gererClicRetour(ActionEvent event) {
        Jeu.activerScene('a');
    } 
}