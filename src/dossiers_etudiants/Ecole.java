package dossiers_etudiants;

import java.util.ArrayList;

public class Ecole {
    private ArrayList<Etudiant> students;

    /**
     * Pour récupérer la liste des étudiants de l'école
     * @return
     */
    public ArrayList<Etudiant> getStudents() {
        return this.students;
    }

    /**
     * Pour ajouter un étudiant à l'école
     */
    public void addStudent(Etudiant student) {
        if (this.students == null) {
            this.students = new ArrayList<Etudiant>();
        }
        this.students.add(student);
    }

    /**
     * Pour définir une liste d'étudiants à l'école
     */
    public void setStudents(ArrayList<Etudiant> students) {
        this.students = students;
    }
}
