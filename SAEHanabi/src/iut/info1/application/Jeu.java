package iut.info1.application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** 
 * Classe principale de l'application
 * @author Louis Bonafis
 * @version 1.0
 */
public class Jeu extends Application {


    /**
     * code de la scène principale
     */
    public static final char CODE_SCENE_ACCUEIL = 'a';

    /**
     * code de la scène des règles du jeu
     */
    public static final char CODE_SCENE_REGLES = 'r';
    
    /**
     * code de la scène de selection du nombre de joueurs
     */
    public static final char CODE_SCENE_SELECTION_JOUEURS = 's';
    
    /**
     * code de la scène de selection du nombre de joueurs
     */
    public static final char CODE_SCENE_CHOIX_PSEUDO = 'p';
    
    /**
     * code de la scène des du plateau de jeu avec 2 joueurs
     */
    public static final char CODE_SCENE_DEUX_JOUEURS = '2';
    
    /**
     * code de la scène des du plateau de jeu avec 3 joueurs
     */
    public static final char CODE_SCENE_TROIS_JOUEURS = '3';
    
    /**
     * code de la scène des du plateau de jeu avec 4 joueurs
     */
    public static final char CODE_SCENE_QUATRE_JOUEURS = '4';
    
    /**
     * code de la scène des du plateau de jeu avec 5 joueurs
     */
    public static final char CODE_SCENE_CINQ_JOUEURS = '5';

    
    /** Scène pour l'accueil lors du lancement du jeu */
    private static Scene sceneAccueil;

    /** Scène pour la page de choix du nombre de joueurs */
    private static Scene sceneSelectionJoueurs;
    
    /** Scène pour la page de choix des pseudo */
    private static Scene sceneChoixPseudo;

    /** Scène de la partie avec 5 joueurs */
    private static Scene scene5Joueurs;
    
    /** Fenêtre principale de l'application, la scène affichée sera
     * modifiée en fonction des clics de l'utilisateur
     */
    private static Stage fenetrePrincipale;


    /**
     * Permet de modifier la scène de la fenêtre principale
     * pour qu'elle devienne celle spécifiée en paramètre
     * Si le code caractère argument est invalide : aucun changement de scène
     * @param codeScene code la scène à charger
     */
    public static void activerScene(char codeScene) {

        switch(codeScene) {
        case CODE_SCENE_ACCUEIL :
            fenetrePrincipale.setScene(sceneAccueil);
            break;
        case CODE_SCENE_REGLES :
            fenetrePrincipale.setScene(sceneAccueil);
            break;
        case CODE_SCENE_SELECTION_JOUEURS :
            fenetrePrincipale.setScene(sceneSelectionJoueurs);
            break;
        case CODE_SCENE_CHOIX_PSEUDO : 
            fenetrePrincipale.setScene(sceneChoixPseudo);
            break;
        case CODE_SCENE_CINQ_JOUEURS :
            fenetrePrincipale.setScene(scene5Joueurs);
            break;
        default : // ne rien faire
        }
    }


    @Override
    public void start(Stage primaryStage) {
        try {
            
            /*
             * chargement de la vue de la scène d'accueil dans le conteneur
             * de type Parent
             */
            FXMLLoader chargeurFXML = new FXMLLoader();
            chargeurFXML.setLocation(getClass().getResource("VueAccueil.fxml"));
            Parent conteneur = chargeurFXML.load();
            sceneAccueil = new Scene(conteneur, 1000, 600);

            /*
             * chargement de la vue de la scène de choix des joueurs dans le conteneur
             * de type Parent
             */
            FXMLLoader chargeurFXMLSelectionJoueurs = new FXMLLoader();
            chargeurFXMLSelectionJoueurs.setLocation(getClass().getResource("VueSelectionNbJoueurs.fxml"));
            conteneur = chargeurFXMLSelectionJoueurs.load();
            sceneSelectionJoueurs = new Scene(conteneur, 1000, 600);
            
            /*
             * chargement de la vue de la scène de choix des pseudos des joueurs
             * de type Parent
             */
            FXMLLoader chargeurFXMLPseudo = new FXMLLoader();
            chargeurFXMLPseudo.setLocation(getClass().getResource("VueChoixPseudo.fxml"));
            conteneur = chargeurFXMLPseudo.load();
            sceneChoixPseudo = new Scene(conteneur, 1000, 600);
            
            /*
             * chargement de la vue de la scène de la partie à 5 joueurs
             * de type Parent
             */
            FXMLLoader chargeurFXML5Joueurs = new FXMLLoader();
            chargeurFXML5Joueurs.setLocation(getClass().getResource("Vue5Joueurs.fxml"));
            conteneur = chargeurFXML5Joueurs.load();
            scene5Joueurs = new Scene(conteneur, 1000, 600);
            
            
            // on définit le titre, la hauteur et la largeur de la fenêtre principale
            primaryStage.setTitle("Hanabi");
            primaryStage.setHeight(600);
            primaryStage.setWidth(1000);

            /*
             * on associe la scène principale à la fenêtre principale
             * Cette dernière est stockée en tant qu'attribut afin d'être accessible
             * dans les méthodes activer... Celles qui permettent de rendre active
             * l'une des 3 scènes
             */
            primaryStage.setScene(sceneAccueil);
            fenetrePrincipale = primaryStage;
            primaryStage.show();

        } catch (IOException e) {

            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Programme principal
     * @param args non utilisé
     */
    public static void main(String[] args) {
        launch(args);
    }
} 