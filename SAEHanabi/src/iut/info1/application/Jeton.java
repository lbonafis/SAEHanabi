/*
 * Jeton.java                                           2 juin 2024
 * IUT Rodez, Info1 2023-2024 groupe TP1, pas de copyrigth
 */
package iut.info1.application;

/** TODO commenter les responsabilités de cette classe
 * 
 */
public class Jeton extends Controleur5Joueurs {
    
    /** Déclaration et initialisation des jetons bleu */
    public int nbJetonsBleu = 8;
    
    /** Déclaration et initialisation des jetons rouge */
    public int nbJetonsRouge = 3;
    

    /** 
     * Initialise les valeurs du nombre de jetons
     */
    public void setJetons() {
        nbBleu.setText(Integer.toString(nbJetonsBleu));
        nbRouge.setText(Integer.toString(nbJetonsRouge));   
    }
    
    /** 
     * Incrémente le nombre de jetons bleu si il est inférieur à 8
     */
    public void incrementerJetonsBleu() {
        if (nbJetonsBleu < 8) {
            nbJetonsBleu++;
            setJetons();
        }
    }
    
    /** 
     * Décrémente le nombre de jetons bleu si il est supérieur à 0 
     */
    public void decrementerJetonsBleu() {
        if (nbJetonsBleu > 0) {
            nbJetonsBleu--;
            setJetons();
        }
    }
    
    /**
     * Décrémente le nombre de jetons rouge et appelle la fin
     * de la partie si jetonsRouge == 0  =>  true
     */
    public void decrementerJetonsRouge() {
        nbJetonsRouge--;
        if (nbJetonsRouge == 0) {
            // TODO finPartie();
        } else {
            setJetons();
        }
    }
}
