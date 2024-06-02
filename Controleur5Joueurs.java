/*
 * Controleur5Joueurs.java                                           30 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

/** TODO commenter les responsabilités de cette classe
 * 
 */
public class Controleur5Joueurs {
    
    
    @FXML
    private Text pseudo1;
    
    @FXML
    private Text pseudo2;

    @FXML
    private Text pseudo3;
    
    @FXML
    private Text pseudo4;

    @FXML
    private Text pseudo5;
    
    /** TODO commenter le rôle du champ (attribut, lien associatif) */
    @FXML
    public Label jetonsRouge;
    
    /** TODO commenter le rôle du champ (attribut, lien associatif) */
    @FXML
    public Label jetonsBleu;
    
    /** TODO commenter le rôle du champ (attribut, lien associatif) */
    @FXML
    public Label nbCartePioche;
    
    /** Affecte son contenu au champ Text pseudo1 */
    public static Text j1;
    
    /** Affecte son contenu au champ Text pseudo2 */
    public static Text j2;
    
    /** Affecte son contenu au champ Text pseudo3 */
    public static Text j3;
    
    /** Affecte son contenu au champ Text pseudo4 */
    public static Text j4;
    
    /** Affecte son contenu au champ Text pseudo5 */
    public static Text j5;
    
    /** Affecte son contenu au champ Label jetonsBleu */
    public static Label nbBleu;
    
    /** Affecte son contenu au champ Label jetonsRouge */
    public static Label nbRouge;
    
    /** Affecte son contenu au champ Label nbCartePioche */
    public static Label nbPioche; 
    
    /**
     * Méthode appelée automatiquement lorsque la vue est chargée
     * On crée le modèle calcul et on finit de préparer la vue
     */
    @FXML
    private void initialize() {
        
        j1 = pseudo1;
        j2 = pseudo2;
        j3 = pseudo3;
        j4 = pseudo4;
        j5 = pseudo5;
        nbBleu = jetonsBleu;
        nbRouge = jetonsRouge;
        nbPioche = nbCartePioche;
    }
    
    
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


    /** TODO commenter le rôle de cette méthode (SRP)
     * 
     */
    public void setJetons() {
        nbBleu = jetonsBleu;
        nbRouge = jetonsRouge;
    }
}
