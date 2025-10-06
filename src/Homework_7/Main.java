package Homework_7;

public class Main {

    public static void main(String[] args) {

        //В классе main создать массив из пяти студентов.

        Student[] students = new Student[5];
        students[0] = new Student(1, "Natallia", "Baitsova", "Java", 1, "Basic", 100);
        students[1] = new Student(2, "Anna", "Sidorova", "Math", 3, "B2", 78);
        students[2] = new Student(3, "Pavel", "Ivanov", "Physics", 1, "C3", 92);
        students[3] = new Student(4, "Olga", "Smirnova", "Biology", 4, "D4", 88);
        students[4] = new Student(5, "Sergey", "Kuznetsov", "Chemistry", 2, "E5", 74);


        //8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом студенте метод info, который вы создавали в задании 2

        Student[] topStudents = Student.getStudents(students, 80);

        for (Student student : topStudents) {
            student.info();
        }
    }
}