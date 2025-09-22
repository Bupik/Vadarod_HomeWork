package HomeWork_5;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        //4*. Ввести число с консоли, которое не заканчивается на 0.
        //Вывести чётные и нечётные числа через while and if. Использовать оператор %.

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Введите число, не заканчивающееся на 0: ");
            number = scanner.nextInt();
        } while (number % 10 == 0);

        int a = 0;

        while (a <= number) {
            if (a % 2 == 0) {
                System.out.println(a + " — чётное число");
            } else {
                System.out.println(a + " — нечётное число");
            }
            a++;
        }
    }
}