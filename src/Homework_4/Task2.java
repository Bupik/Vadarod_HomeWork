package Homework_4;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        //2. На вход даны 3 числа. Вывести в консоль только те числа, которые делятся на 2 и на 5
        // (используйте оператор % для проверки деления без остатка)

        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        System.out.println("Введите c");
        int c = in.nextInt();

        if ((a % 2 == 0) | (a % 5 == 0)) {
            System.out.println("a = " + a);
        }
        if ((b % 2 == 0) || (b % 5 == 0)) {
            System.out.println("b = " + b);
        }
        if ((c % 2 == 0) || (c % 5 == 0)) {
            System.out.println("c = " + c);
        }
    }
}