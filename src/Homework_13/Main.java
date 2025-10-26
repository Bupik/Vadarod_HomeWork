package Homework_13;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //1.1. Создать несколько студентов.
    //1.2. Создать несколько групп. По этим группам распределить студентов. (метод коллекции add)
    //1.3. Создать Факультет. Распределить туда группы. (метод коллекции add)


    public static void main(String[] args) {

     Student student1 = new Student("Anatol", "Ivanov", 2001, "Warsaw", 4.5);
     Student student2 = new Student("Black", "Panther", 2005, "Cape Town", 3.4);
     Student student3 = new Student("Jacky", "Chan", 1960, "Beijing", 2.1);
     Student student4 = new Student("Captain", "America", 1910, "Warsaw", 4.2);
     Student student5 = new Student("Germiona", "Greinger", 1991, "London", 5.0);
     Student student6 = new Student("Chupakabra", "Makabr", 1850, "Mexico", 3.9);

     Group group1 = new Group(1);
     Group group2 = new Group(2);

     group1.addStudent(student1);
     group1.addStudent(student3);
     group1.addStudent(student5);
     group2.addStudent(student2);
     group2.addStudent(student4);
     group2.addStudent(student6);

     Faculty faculty = new Faculty("Technology");

     faculty.addGroup(group1);
     faculty.addGroup(group2);

     //Удаление студентов с оценкой ниже, чем заданная в параметре метода.
     group1.removeStudentsByMark(3.5);
     group2.removeStudentsByMark(3.5);

     System.out.println("\n***************************************************************");

     //1.5 Перевод студентов, если их < 2
     System.out.println("\nВыполняется перевод студентов из группы 2 в группу 1, если количество студентов в группе 2 меньше 2-х");
     group2.transferToGroup(group1);

     System.out.println("\nСостав группы 1 после перевода:");
        for (Student s : group1.getStudents()) {
            System.out.println(s.getName() + " " + s.getSurname());
        }

      System.out.println("\nСостав группы 2 после перевода:");
        for (Student s : group2.getStudents()) {
            System.out.println(s.getName() + " " + s.getSurname());
        }

     System.out.println("\n***************************************************************");

     //1.6 Средний балл по каждой группе
     System.out.println("Средний балл группы 1: " + group1.calculateAverageMark());
     System.out.println("Средний балл группы 2: " + group2.calculateAverageMark());

    }
}