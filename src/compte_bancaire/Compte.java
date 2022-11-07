package compte_bancaire;

import java.util.*;

public class Compte {
    private UUID id;
    private String titulaire;
    private double solde;
    private double decouvert_max;
    private double debit_max;

    public Compte(String titulaire) {
        this.id = UUID.randomUUID(); // vérifier incrémentation des vals. Ajouter génération UUID.
        this.titulaire = titulaire;
        this.solde = 0; // ajouter une val par défaut.
        this.decouvert_max = 800; // ajouter modif à la création ou val. défaut
        this.debit_max = 1000; // ajouter modif à la création ou val. défaut
    }

    public Compte(String titulaire, double solde, double decouvert_max, double debit_max) {
        this.id = UUID.randomUUID();
        this.titulaire = titulaire;
        this.solde = solde;
        this.decouvert_max = decouvert_max;
        this.debit_max = debit_max;
    }

    public UUID getID() {
        return id;
    }

    public String getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double value) {
        // A vérifier
        if (value < 0) {
            System.out.println("Please use a valid value.");
        }
        this.solde = value;
    }

    public double getDecouvertMax() {
        return decouvert_max;
    }

    public double getDebitMax() {
        return debit_max;
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
