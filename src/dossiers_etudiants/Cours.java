package dossiers_etudiants;

import java.util.UUID;

public class Cours {
    private UUID id;
    private String name;
    private String teacherName;
    private Number grade;
    private Number length;

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
        this.length = length;
    }
}
