/*
 * ControleurChoixPseudo.java                                           31 mai 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

/** TODO commenter les responsabilités de cette classe
 * 
 */
public class ControleurChoixPseudo extends Controleur5Joueurs {

    /** Le nombre de joueurs sélectionné */
    public static int nbJoueur;

    private static final String TITRE_BOITE_ERREUR = "Erreur";

    
    @FXML
    private TextField joueur1;

    @FXML
    private TextField joueur2;
    
    @FXML
    private TextField joueur3;

    @FXML
    private TextField joueur4;

    @FXML
    private TextField joueur5;
    
    
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
                Partie.lancerPartie();
                j1.setText(joueur1.getText());
                j2.setText(joueur2.getText());
                j3.setText(joueur3.getText());
                j4.setText(joueur4.getText());
                j5.setText(joueur5.getText());
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
        boiteAlerte.setHeaderText("Jcrois t'as fait de la merde");
        boiteAlerte.setContentText("Tous les joueurs doivent entrer leur pseudos !");
        boiteAlerte.showAndWait();
    }
}

