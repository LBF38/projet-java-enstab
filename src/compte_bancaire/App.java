package compte_bancaire;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Compte> Banque = new ArrayList<>();
        Banque.add(new Compte("DUPONT", 100));

        // Tests
        Compte premierCompte = Banque.get(0);
        premierCompte.montrerSolde();
        System.out.println(premierCompte);
        // Tests crédits
        premierCompte.crediter(5);
        premierCompte.montrerSolde();
        premierCompte.crediter(-5);
        premierCompte.montrerSolde();
        // Tests débits
        premierCompte.debiter(200);
        premierCompte.montrerSolde();
        premierCompte.debiter(1000); 
        premierCompte.debiter(1500); 
        premierCompte.debiter(10);
        premierCompte.montrerSolde();
    }
}
