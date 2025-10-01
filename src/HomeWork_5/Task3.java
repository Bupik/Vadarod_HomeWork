package HomeWork_5;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        //3* . Ввести число с консоли, которое не заканчивается на 0.
        //Вывести число в обратном порядке. Использовать оператор %.

        Scanner scanner = new Scanner(System.in);
        int start_number;

        // Ввод числа, которое не заканчивается на 0

        do {
            System.out.print("Введите число, не заканчивающееся на 0: ");
            start_number = scanner.nextInt();
        } while (start_number % 10 == 0);

        //Вывод числа в обратном порядке

        int reversed_number = 0;

        while (start_number != 0) {
            reversed_number = reversed_number * 10 + start_number % 10;
            start_number /= 10;
            //System.out.println("Start number = " + start_number + " and reversed number = " + reversed_number);
        }
        System.out.println("Reversed number = " + reversed_number);
    }
}