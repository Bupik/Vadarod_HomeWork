package Homework_4;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        //1. На вход даны 3 числа. Вывести в консоль только четные числа

        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();
        System.out.println("Введите c");
        int c = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("a = " + a);
        }
        if (b % 2 == 0) {
            System.out.println("b = " + b);
        }
        if (c % 2 == 0) {
            System.out.println("c = " + c);
        }
    }
}