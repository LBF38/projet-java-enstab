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
