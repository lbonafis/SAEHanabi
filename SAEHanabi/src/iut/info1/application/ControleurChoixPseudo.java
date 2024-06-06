/*
 * ControleurChoixPseudo.java                                           31 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import iut.info1.application.tests.*;

/**
 * Contrôleur de la page VueChoixPseudo.fxml
 * @author louis.bonafis
 */
public class ControleurChoixPseudo extends Controleur5Joueurs {

    /** Le nombre de joueurs sélectionné */
    public static int nbJoueur;

    private static final String TITRE_BOITE_ERREUR = "Erreur";

    
    /** TextField du joueur 1 */
    @FXML
    public TextField joueur1;
    
    /** TextField du joueur 2 */
    @FXML
    public TextField joueur2;
    
    /** TextField du joueur 3 */
    @FXML
    public TextField joueur3;
    
    /** TextField du joueur 4 */
    @FXML
    public TextField joueur4;
    
    /** TextField du joueur 5 */
    @FXML
    public TextField joueur5;
    
    
    /*
     * Méthode appelée automatiquement si l'utiliseur clique sur le bouton DEMARRER
     */
    @FXML
    void gererClicDemarrer(ActionEvent event) {
        switch (nbJoueur) {
        case 2 :
            break;
        case 3 :
            break;
        case 4 :
            break;
        case 5 :
            if(   joueur1.getText().isEmpty() || joueur2.getText().isEmpty() 
               || joueur3.getText().isEmpty() || joueur4.getText().isEmpty() 
                                              || joueur5.getText().isEmpty()) { 
                erreur();
            } else {
                j1.setText(joueur1.getText());
                j2.setText(joueur2.getText());
                j3.setText(joueur3.getText());
                j4.setText(joueur4.getText());
                j5.setText(joueur5.getText());
                //TestCarte.testMelangerCartes();
                //TestCarte.testSetCouleur();
                //TestJeton testJeton = new TestJeton();
                //testJeton.testJetons();
                Carte.melangerCartes();
                Pioche.creerPioche();
                //TestPioche.testCreerPioche();
                TestJoueur.testJoueur();
                /*new Joueur(Controleur5Joueurs.j1.getText(),1);
                new Joueur(Controleur5Joueurs.j2.getText(),2);
                new Joueur(Controleur5Joueurs.j3.getText(),3);
                new Joueur(Controleur5Joueurs.j4.getText(),4);
                new Joueur(Controleur5Joueurs.j5.getText(),5);*/

                Jeton initJetons = new Jeton();
                initJetons.setJetons();
                Pioche initPioche = new Pioche();
                initPioche.setPioche();
                Jeu.activerScene('5');
            break;
        }
        }
        
    }
    
    /*
     * Méthode appelée automatiquement si l'utiliseur clique sur le bouton DEMARRER
     */
    @FXML
    void gererClicRetour(ActionEvent event) {
        Jeu.activerScene('s');
    }


    /** 
     * Renvoie une erreur si tous les pseudo n'ont pas été saisis
     */
    private static void erreur() {
        Alert boiteAlerte = new Alert(Alert.AlertType.ERROR);
        boiteAlerte.setTitle(TITRE_BOITE_ERREUR);
        boiteAlerte.setHeaderText("Erreur de saisie");
        boiteAlerte.setContentText("Tous les joueurs doivent entrer leur pseudos !");
        boiteAlerte.showAndWait();
    }
}

