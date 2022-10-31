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
    }
}
