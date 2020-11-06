package com.gmail.hw03november;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        Student person1 = new Student("Иванов", "Иван", 17, "мужчина", 1, "Психология");

        group.addStudent(person1);
        group.addStudent(new Student("Смирнова", "Anna", 19, "женщина", 3, "Право"));
        group.addStudent(new Student("Кузнецов", "Олег", 22, "мужчина", 6, "Социология"));
        group.addStudent(new Student("Попова", "Светлана", 19, "женщина", 3, "Филология"));
        group.addStudent(new Student("Васильев", "Антон", 18, "мужчина", 1, "Экономика"));
        group.addStudent(new Student("Петров", "Игорь", 19, "мужчина", 3, "Педагогика"));
        group.addStudent(new Student("Соколова", "Наталия", 21, "женщина", 2, "Металлургия"));
        group.addStudent(new Student("Михайлов", "Михаил", 18, "мужчина", 1, "Информационные технологии"));
        group.addStudent(new Student("Новиков", "Сергей", 19, "мужчина", 3, "Кибербезопасность"));
        group.addStudent(new Student("Морозова", "Евгения", 21, "женщина", 5, "Менеджмент"));
        group.addStudent(new Student("Фёдоров", "Алексей", 19, "мужчина", 3, "Металлургия"));
        group.addStudent(new Student("Козлов", "Андрей", 20, "мужчина", 3, "Педагогика"));

        group.findStudent("Попова");
        group.findStudent("Степанов");
        group.removeStudent(person1);
        group.removeStudent("Захаров");
        System.out.print("\n" + group.toString());

    }
}
