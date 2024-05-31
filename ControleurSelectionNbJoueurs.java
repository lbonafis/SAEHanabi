/*
 * ControleurSelectionNbJoueurs.java                                           30 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
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