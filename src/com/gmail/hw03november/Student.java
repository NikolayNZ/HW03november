package com.gmail.hw03november;

public class Student extends Human {
    private int course;
    private String specialty;

    public Student(String surname,String name, int age, String sex, int course, String specialty) {
        super(surname, name, age, sex);
        this.course = course;
        this.specialty = specialty;
    }

    public Student(){
        super();
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return  super.toString() +
                " СТУДЕНТ " +
                "Курс: " + course +
                ", специальность: '" + specialty + '\'';
    }
}
