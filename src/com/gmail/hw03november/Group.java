package com.gmail.hw03november;

public class Group {
    private Student[] group = new Student[10];

    public void addStudent(Student person) {
    try {
        if (person == null) throw new IllegalAccessException();
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) {
                group[i] = person;
                System.out.printf("\n%s Студент был добавлен до группы", person.getSurname() + " " + person.getName());
                return;
            }
        }
        throw new NoPlacesException (person.getSurname());
    } catch (NoPlacesException e) {
        System.out.println(e.getMessage());
    } catch (IllegalAccessException e) {
        System.out.printf("\n В группу никаго не добавленно");
    }
}
    public void findStudent(String name) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getSurname().equalsIgnoreCase(name)) {
                System.out.format("\n%s есть в группе", group[i].getSurname() + " " + group[i].getName());
                return;
            }
        }
        System.out.format("\nНет %s в группе", name);
    }
    public void removeStudent(String name) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getSurname().equalsIgnoreCase(name)) {
                System.out.format("\n%s удалён с группы", group[i].getSurname() + " " + group[i].getName());
                group[i] = null;
                return;
            }
        }
        System.out.format("\n%s нет в группе", name);
    }
    public void removeStudent(Student person) {
        try {
            if (person == null) throw new IllegalAccessException();
            removeStudent(person.getSurname());
        } catch (IllegalAccessException e) {
            System.out.printf("\n Ошибка поиска");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < group.length; i++) {
            Student person = group[i];
            int iteration = i;

            for (int j = i + 1; j < group.length; j++) {
                if (group[j] != null && group[i] != null) {
                    if (group[j].getSurname().charAt(0) < person.getSurname().charAt(0)) {
                        person = group[j];
                        iteration = j;
                    }
                }
            }

            if (i != iteration) {
                Student temp = group[i];
                group[i] = person;
                group[iteration] = temp;
            }
        }
        for (int i = 0; i < group.length; i++) {
            if (group[i] == null) continue;
            sb.append("\n" + group[i]);
        }
        return sb.toString();
    }
}