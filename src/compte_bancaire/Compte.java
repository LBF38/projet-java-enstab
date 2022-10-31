package compte_bancaire;

public class Compte {
    private int id;
    private String titulaire;
    private double solde;
    private double decouvert_max;
    private double debit_max;

    public Compte(String titulaire, double solde) {
        this.id += 1; // vérifier incrémentation des vals. Ajouter génération UUID.
        this.titulaire = titulaire;
        this.solde = solde; // ajouter une val par défaut.
        this.decouvert_max = 800; // ajouter modif à la création ou val. défaut
        this.debit_max = 1000; // ajouter modif à la création ou val. défaut
    }

    public void montrerSolde() {
        System.out.print("Solde du compte: " + this.solde + " euros \n");
    }

    public void crediter(double montant) {
        if (montant >= 0) {
            System.out.println("Créditer le compte de " + montant + " euros");
            this.solde += montant;
        } else {
            System.out.println("Montant négatif. Veuillez indiquer un montant positif ou nul");
        }
    }

    public void debiter(double montant) {
        System.out.println("Débiter le compte de " + montant);
        // A compléter
    }

    public void effectuerVirement(double montant, Compte destinataire) {
        System.out.println("Virement de " + montant + " vers " + destinataire.titulaire);
        // A compléter
    }

    @Override
    public String toString() {
        String string_compte = "Etat du compte de " + this.titulaire + "\n";
        string_compte += "Identifiant du compte: " + this.id + "\n";
        string_compte += "Solde actuel: " + this.solde + " euros\n";
        string_compte += "Débit max: " + this.debit_max + " euros\n";
        string_compte += "Découvert max: " + this.decouvert_max + " euros\n";
        return string_compte;
    }
}
