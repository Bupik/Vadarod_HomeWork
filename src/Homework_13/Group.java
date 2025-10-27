package Homework_13;

import java.util.ArrayList;
import java.util.List;

public class Group {

    //У группы поля: номер группы, коллекция студентов (List<Student> students)
    //Реализовать во всех классах методы геттеры и сеттеры.
    //1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)
    //1.4. Реализовать метод классе Group, который должен пройти по всем студентам в группе и удалить тех, у кого средний бал ниже переданной оценки в параметре метода.
    //(метод remove). Сигнатура метода: public void removeStudentsByMark(int mark).
    //1.5. Реализовать метод, если в группе меньше 2 человек, перевести этих студентов в другую группу. (методы коллекций size(), addAll());
    //Сигнатура метода: public void transferToGroup(Group newGroup);
    //1.6. Реализовать метод в классе Group, который считает средний бал по группе. Сигнатуру и название придумайте сами.

    private int groupNumber;
    List<Student> students = new ArrayList<>();

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
        this.students = new ArrayList<>();
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentsByMark(double mark) {

        List<Student> toRemove = new ArrayList<>();

        for (Student student : students) {
            if (student.getAvgmark() < mark) {
                toRemove.add(student);
            }
        }
        students.removeAll(toRemove);

        System.out.println("\nСтуденты, оставшиеся в группе: " + groupNumber);
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public void transferToGroup(Group newGroup) {
        if (students.size() < 2) {
            newGroup.getStudents().addAll(students);
            students.clear();
        }
    }

    public double calculateAverageMark() {
        double sum = 0.0;
        for (Student student : students) {
            sum += student.getAvgmark();
        }
        return sum / students.size();
    }
}