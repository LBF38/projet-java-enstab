package dossiers_etudiants;

import java.util.ArrayList;

public class Etudiant {
    private String firstname;
    private String lastname;
    private String birthdate;
    private String cellphone;
    private String parentEmail;
    private Number studyYear;
    private String studentSection;
    private ArrayList<Cours> courses;

    public Etudiant(String firstname, String lastname, String birthdate, String cellphone, String parentEmail,
            Number studyYear, String studentSection) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.cellphone = cellphone;
        this.parentEmail = parentEmail;
        this.studyYear = studyYear;
        this.studentSection = studentSection;
    }

    public Etudiant(String firstname, String lastname, String birthdate, String cellphone, String parentEmail,
            Number studyYear, String studentSection, ArrayList<Cours> courses) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.cellphone = cellphone;
        this.parentEmail = parentEmail;
        this.studyYear = studyYear;
        this.studentSection = studentSection;
        this.courses = courses;
    }

    public boolean ajouterCours(Cours cours) {
        if (this.courses == null) {
            this.courses = new ArrayList<Cours>();
        }
        return this.courses.add(cours);
    }

    public boolean supprimerCours(Cours cours) {
        if (this.courses == null) {
            System.out.println("L'étudiant n'a pas de cours");
            return false;
        }
        return this.courses.remove(cours);
    }

    public Number calculerMoyenne() {
        Number moyenne = 0;
        for (Cours cours : this.courses) {
            moyenne = moyenne.doubleValue() + cours.getGrade().doubleValue();
        }
        return moyenne.doubleValue() / this.courses.size();
    }

    @Override
    public String toString() {
        return "{" +
                " firstname='" + getFirstname() + "'" +
                ", lastname='" + getLastname() + "'" +
                ", birthdate='" + getBirthdate() + "'" +
                ", cellphone='" + getCellphone() + "'" +
                ", parentEmail='" + getParentEmail() + "'" +
                ", studyYear='" + getStudyYear() + "'" +
                ", studentSection='" + getStudentSection() + "'" +
                ", courses='" + getCourses() + "'" +
                "}";
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getCellphone() {
        return this.cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getParentEmail() {
        return this.parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public Number getStudyYear() {
        return this.studyYear;
    }

    public void setStudyYear(Number studyYear) {
        this.studyYear = studyYear;
    }

    public String getStudentSection() {
        return this.studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    public ArrayList<Cours> getCourses() {
        return this.courses;
    }

    public void setCourses(ArrayList<Cours> courses) {
        this.courses = courses;
    }
}
