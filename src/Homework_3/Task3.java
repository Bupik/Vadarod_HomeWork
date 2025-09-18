package Homework_3;

public class Task3 {

    public static void main(String[] args) {

        //3. Даны числа a=35, b=65.
        // Если а>b, то присвоить числу c значение 5 иначе, присвоить числу c значение 10. (тернарный оператор)

        int a = 35;
        int b = 65;

        int c = a > b ? 5 : 10;

        System.out.println(c);
    }
}