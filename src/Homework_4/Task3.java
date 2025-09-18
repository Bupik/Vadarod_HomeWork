package Homework_4;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        //3. Дано 15/x=result, где x-число, которое вводится с командной строки, result-результат вычисления.
        // Написать программу, которая будет выводит разный текст, в зависимости от значения result.
        // В случае result=3, вывести: "Результат деления равен 3"
        // В случае result=5 вывести: "Результат деления равен 5"
        // В других случаях вывести: "Результат деления равен дробному числу".
        // При этом в последнем случае вывести точный результат деления (использовать приведение типов)
        //Для выполнения задания использовать оператор switch- case

        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        double x = in.nextInt();
        double result = 15 / x;


        if (result % 1 == 0) {
            int result2 = (int) result;

            switch (result2) {
                case 3:
                    System.out.println("Результат деления равен 3");
                    break;
                case 5:
                    System.out.println("Результат деления равен 5");
                    break;
            }
        } else {
            System.out.println("Результат деления равен дробному числу " + result);
        }
    }
}