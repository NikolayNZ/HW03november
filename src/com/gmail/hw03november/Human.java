package com.gmail.hw03november;

public class Human {
    private String surname;
    private String name;
    private int age;
    private String sex;


    public Human(String surname, String name, int age, String sex) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Human(){
        super();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Фамилия: '" + surname + '\'' +
                ", Имя: '" + name + '\'' +
                ", возраст: " + age +
                ", стать: " + sex;
    }
}
