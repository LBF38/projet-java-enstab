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
        System.out.print("Solde du compte de " + this.titulaire + ": " + this.solde + " euros \n");
    }

    public boolean crediter(double montant) {
        if (montant >= 0) {
            System.out.println("Créditer le compte de " + montant + " euros");
            this.solde += montant;
            return true;
        } else {
            System.out.println("Montant négatif. Veuillez indiquer un montant positif ou nul");
            return false;
        }
    }

    public boolean debiter(double montant) {
        System.out.println("Débiter le compte de " + montant + " euros");
        if (montant > this.debit_max) {
            System.out.println(
                    "Montant à débiter non autorisé. La limite de débit est de : " + this.debit_max + " euros.");
            return false;
        }
        double solde_resultant = this.solde - montant;
        if (Math.abs(solde_resultant) > this.decouvert_max) {
            System.out.println(
                    "Montant non autorisé. Votre limite de découvert est de " + this.decouvert_max + " euros.");
            return false;
        }
        this.solde = solde_resultant;
        return true;
    }

    public boolean effectuerVirement(double montant, Compte destinataire) {
        System.out.println("Virement de " + montant + " vers " + destinataire.titulaire);
        if (this.debiter(montant)) {
            destinataire.crediter(montant);
            return true;
        } else {
            System.out.println("Virement non effectué. Solde insuffisant.");
            return false;
        }
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
