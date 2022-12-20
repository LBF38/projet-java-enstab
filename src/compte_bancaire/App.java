package compte_bancaire;

import java.util.*;

/**
 * @author Mathis URIEN (LBF38)
 * @version 1.0
 * @since 2019-10-15
 */
public class App {
    
    /** 
     * Lancement de l'application
     * On réalise de simples tests sur l'utilisation de la classe Compte.
     * => Utilisation de tests unitaires serait plus pertinent.
     * @param args
     */
    public static void main(String[] args) {
        List<Compte> Banque = new ArrayList<>();
        Banque.add(new Compte("DUPONT"));
        Banque.add(new Compte("GOLDMAN"));
        Banque.add(new Compte("BENOIT", 50, 1000, 1000));

        // Tests
        Compte premierCompte = Banque.get(0);
        Compte secondCompte = Banque.get(1);
        premierCompte.montrerSolde();
        System.out.println(premierCompte);

        // Tests crédits
        // premierCompte.crediter(5);
        // premierCompte.montrerSolde();
        // premierCompte.crediter(-5);
        // premierCompte.montrerSolde();

        // Tests débits
        // premierCompte.debiter(200);
        // premierCompte.montrerSolde();
        // premierCompte.debiter(1000);
        // premierCompte.debiter(1500);
        // premierCompte.debiter(10);
        // premierCompte.montrerSolde();

        // Tests effectuerVirement
        premierCompte.montrerSolde();
        secondCompte.montrerSolde();
        premierCompte.effectuerVirement(100, secondCompte);
        premierCompte.montrerSolde();
        secondCompte.montrerSolde();
        premierCompte.effectuerVirement(1000, secondCompte);
        premierCompte.montrerSolde();
        secondCompte.montrerSolde();
        premierCompte.effectuerVirement(1500, secondCompte);
    }
}
