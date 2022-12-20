package dossiers_etudiants;

public class Main {
    public static void main(String[] args) {
        // génère 50 étudiants aléatoirement et ajoute les à l'école
        Ecole ecole = new Ecole();
        for (int i = 0; i < 50; i++) {
            ecole.ajouterEtudiant(new Etudiant("Etudiant" + i, "Nom" + i, "01/01/2000", "06 00 00 00 00",
                    "etudiant" + i + "@gmail.com", 1, "A"));
        }
        // ajouter des cours aléatoires à tous les étudiants
        for (Etudiant etudiant : ecole.getStudents()) {
            for (int i = 0; i < 5; i++) {
                etudiant.ajouterCours(new Cours("Cours" + i, "Prof" + i, Math.random() * 20, Math.random() * 120));
            }
        }
        // afficher la liste des étudiants de l'école
        ecole.tousEtudiant();
        // Calcul de la moyenne pour 2 étudiants :
        Etudiant etudiant1 = ecole.getStudents().get(0);
        Etudiant etudiant2 = ecole.getStudents().get(1);
        System.out.println("La moyenne de " + etudiant1.getFirstname() + " " + etudiant1.getLastname() + " est de "
                + etudiant1.calculerMoyenne());
        System.out.println("La moyenne de " + etudiant2.getFirstname() + " " + etudiant2.getLastname() + " est de "
                + etudiant2.calculerMoyenne());
    }
}
