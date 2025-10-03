package Homework_7;

public class Student {

    //Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ), course(тип int) , Группа(тип String), средняя оценка (тип int).
    //Инициализацию студента в классе main выполнять через конструктор с параметрами.
    //Также определите конструктор без параметров.

    int id;
    String name;
    String surname;
    String faculty;
    int course;
    String group;
    int averageMark;

    //Конструктор без параметров
    public Student() {

    }

    //Конструктор с параметрами
    public Student(int id, String name, String surname, String faculty, int course, String group, int averageMark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.averageMark = averageMark;
    }

    //2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info

    public String info() {

        String info = "Id of student = " + id +
                ", Name of student = " + name +
                ", Surname of student = " + surname +
                ", Faculty of student = " + faculty +
                ", Course of student = " + course +
                ", Group of student = " + group +
                ", Average mark of student = " + averageMark;
        System.out.println(info);
        return info;
    }

    //3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)

    public void changeGroup (String newGroup) {

        this.group = newGroup;
    }

    //4. Создать метод, который будет возвращать текущую группу студента.

    public String getStudentGroup() {

        return this.group;
    }

    //5. Создать метод, который будет изменять оценку студента и группу студента.

    public void changeMarkAndGroup(int newMark, String newGroup) {

        this.averageMark = newMark;
        this.group = newGroup;
    }

    //7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из этих студентов массив студентов, у которых оценка выше переданной оценки в методе.
    // (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)

    public static Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        for (Student s : students) {
            if (s.averageMark > mark) count++;
        }

        Student[] result = new Student[count];
        int index = 0;
        for (Student student : students) {
            if (student.averageMark > mark) {
                result[index++] = student;
            }
        }
        return result;
    }
}