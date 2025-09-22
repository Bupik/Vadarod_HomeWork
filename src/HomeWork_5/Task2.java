package HomeWork_5;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        //2. Ввести 2 положительных числа с консоли с помощью сканера.
        //Вывести сумму всех чисел от одного числа до другого.
        //(Используйте цикл while).Подсказка. До цикла объявите переменную int sum=0.
        //В самом цикле перезаписывайте в эту переменную сумму чисел.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = in.nextInt();
        System.out.println("Введите число b");
        int b = in.nextInt();

        int sum =0;

        while (a <= b) {
            sum += a;
            a++;
        }
        System.out.println("Сумма всех чисел от a до b = " + sum);
    }
}