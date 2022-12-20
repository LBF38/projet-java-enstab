package dossiers_etudiants;

import java.util.UUID;

public class Cours {
    private UUID id;
    private String name;
    private String teacherName;
    private Number grade;
    private Number length;

    public Cours() {
        this.id = UUID.randomUUID();
    }
    
    public Cours(String name, String teacherName, Number grade, Number length) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.teacherName = teacherName;
        this.grade = grade;
        this.length = length;
    }

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacherName() {
        return this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Number getGrade() {
        return this.grade;
    }

    public void setGrade(Number grade) {
        this.grade = grade;
    }

    public Number getLength() {
        return this.length;
    }

    public void setLength(Number length) {
        if (length.intValue() < 0){
            throw new IllegalArgumentException("La durée d'un cours ne peut pas être négative");
        }
        this.length = length;
    }
}
