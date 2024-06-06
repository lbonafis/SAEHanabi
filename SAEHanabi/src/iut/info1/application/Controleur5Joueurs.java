/*
 * Controleur5Joueurs.java                                           30 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.shape.*;

/**
 * Contrôleur de la page Vue5Joueurs.fxml
 * @author louis.bonafis
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
    
    @FXML
    private Label jetonsRouge;

    @FXML
    private Label jetonsBleu;
    
    @FXML
    private Label nbCartePioche;
    
    @FXML
    private Rectangle p11;
    
    @FXML
    private Rectangle p12;
    
    @FXML
    private Rectangle p13;
    
    @FXML
    private Rectangle p14;
    
    @FXML
    private Rectangle p21;
    
    @FXML
    private Rectangle p22;
    
    @FXML
    private Rectangle p23;
    
    @FXML
    private Rectangle p24;
    
    @FXML
    private Rectangle p31;
    
    @FXML
    private Rectangle p32;
    
    @FXML
    private Rectangle p33;
    
    @FXML
    private Rectangle p34;
    
    @FXML
    private Rectangle p41;
    
    @FXML
    private Rectangle p42;
    
    @FXML
    private Rectangle p43;
    
    @FXML
    private Rectangle p44;
    
    @FXML
    private Rectangle p51;
    
    @FXML
    private Rectangle p52;
    
    @FXML
    private Rectangle p53;
    
    @FXML
    private Rectangle p54;
    
    @FXML
    private Label v11;
    
    @FXML
    private Label v12;
    
    @FXML
    private Label v13;
    
    @FXML
    private Label v14;
    
    @FXML
    private Label v21;
    
    @FXML
    private Label v22;
    
    @FXML
    private Label v23;
    
    @FXML
    private Label v24;
    
    @FXML
    private Label v31;
    
    @FXML
    private Label v32;
    
    @FXML
    private Label v33;
    
    @FXML
    private Label v34;
    
    @FXML
    private Label v41;
    
    @FXML
    private Label v42;
    
    @FXML
    private Label v43;
    
    @FXML
    private Label v44;
    
    @FXML
    private Label v51;
    
    @FXML
    private Label v52;
    
    @FXML
    private Label v53;
    
    @FXML
    private Label v54;
  
    /** Le numéro de la carte 1 du joueur 1 */
    @FXML
    public static Label n11;
    
    /** Le numéro de la carte 2 du joueur 1 */
    @FXML
    public static Label n12;
    
    /** Le numéro de la carte 3 du joueur 1 */
    @FXML
    public static Label n13;
    
    /** Le numéro de la carte 4 du joueur 1 */
    @FXML
    public static Label n14;
    
    /** Le numéro de la carte 1 du joueur 2 */
    @FXML
    public static Label n21;
    
    /** Le numéro de la carte 2 du joueur 2 */
    @FXML
    public static Label n22;
    
    /** Le numéro de la carte 3 du joueur 2 */
    @FXML
    public static Label n23;
    
    /** Le numéro de la carte 4 du joueur 2 */
    @FXML
    public static Label n24;
    
    /** Le numéro de la carte 1 du joueur 3 */
    @FXML
    public static Label n31;
    
    /** Le numéro de la carte 2 du joueur 3 */
    @FXML
    public static Label n32;
    
    /** Le numéro de la carte 3 du joueur 3 */
    @FXML
    public static Label n33;
    
    /** Le numéro de la carte 4 du joueur 3 */
    @FXML
    public static Label n34;
    
    /** Le numéro de la carte 1 du joueur 4 */
    @FXML
    public static Label n41;
    
    /** Le numéro de la carte 1 du joueur 4 */
    @FXML
    public static Label n42;
    
    /** Le numéro de la carte 3 du joueur 4 */
    @FXML
    public static Label n43;
    
    /** Le numéro de la carte 4 du joueur 4 */
    @FXML
    public static Label n44;
    
    /** Le numéro de la carte 1 du joueur 5 */
    @FXML
    public static Label n51;
    
    /** Le numéro de la carte 2 du joueur 5 */
    @FXML
    public static Label n52;
    
    /** Le numéro de la carte 3 du joueur 5 */
    @FXML
    public static Label n53;
    
    /** Le numéro de la carte 4 du joueur 5 */
    @FXML
    public static Label n54;
    
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
    
    /** Carte 1 du joueur 1 */
    public static Rectangle j11;
    
    /** Carte 2 du joueur 1 */
    public static Rectangle j12;
    
    /** Carte 3 du joueur 1 */
    public static Rectangle j13;
    
    /** Carte 4 du joueur 1 */
    public static Rectangle j14;
    
    /** Carte 1 du joueur 2 */
    public static Rectangle j21;
    
    /** Carte 2 du joueur 2 */
    public static Rectangle j22;
    
    /** Carte 3 du joueur 2 */
    public static Rectangle j23;
    
    /** Carte 4 du joueur 2 */
    public static Rectangle j24;
    
    /** Carte 1 du joueur 3 */
    public static Rectangle j31;
    
    /** Carte 2 du joueur 3 */
    public static Rectangle j32;
    
    /** Carte 3 du joueur 3 */
    public static Rectangle j33;
    
    /** Carte 4 du joueur 3 */
    public static Rectangle j34;
    
    /** Carte 1 du joueur 4 */
    public static Rectangle j41;
    
    /** Carte 2 du joueur 4 */
    public static Rectangle j42;
    
    /** Carte 3 du joueur 4 */
    public static Rectangle j43;
    
    /** Carte 4 du joueur 4 */
    public static Rectangle j44;
    
    /** Carte 1 du joueur 5 */
    public static Rectangle j51;
    
    /** Carte 2 du joueur 5 */
    public static Rectangle j52;
    
    /** Carte 3 du joueur 5 */
    public static Rectangle j53;
    
    /** Carte 4 du joueur 5 */
    public static Rectangle j54;
    
    
    
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
        j14 = p14;
        j13 = p13;
        j12 = p12;
        j11 = p11;
        j24 = p24;
        j23 = p23;
        j22 = p22;
        j21 = p21;
        j34 = p34;
        j33 = p33;
        j32 = p32;
        j31 = p31;
        j44 = p44;
        j43 = p43;
        j42 = p42;
        j41 = p41;
        j54 = p54;
        j53 = p53;
        j52 = p52;
        j51 = p51;
        n14 = v14;
        n13 = v13;
        n12 = v12;
        n11 = v11;
        n24 = v24;
        n23 = v23;
        n22 = v22;
        n21 = v21;
        n34 = v34;
        n33 = v33;
        n32 = v32;
        n31 = v31;
        n44 = v44;
        n43 = v43;
        n42 = v42;
        n41 = v41;
        n54 = v54;
        n53 = v53;
        n52 = v52;
        n51 = v51;
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


    /**
     * Gère l'affichage de la valeur des jetons
     */
    public void setJetons() {
        nbBleu = jetonsBleu;
        nbRouge = jetonsRouge;
    }
}
