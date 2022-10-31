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
        System.out.print("Solde du compte: " + this.solde);
        // A compléter
    }

    public void crediter(double montant) {
        System.out.println("Créditer le compte de " + montant);
        // A compléter
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
        System.out.println("Etat du Compte de " + this.titulaire);
        System.out.println(this.id + " " + this.debit_max + " " + this.decouvert_max);
        // A compléter
        return "Compte de " + this.titulaire;
    }
}
