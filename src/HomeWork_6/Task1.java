package HomeWork_6;

import java.lang.reflect.Array;

public class Task1 {

    public static void main(String[] args) {

        //1. Создать массив из 10 элементов.
        // Заполните массив числами и вывести их в консоль (выводите через цикл for each).
        // Замените каждый элемент с нечётным индексом на ноль.
        // Выведите полученный массив в консоль через цикл for each

        int[] array = new int[10];;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {

            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        for (int numbers : array) {
            System.out.print(numbers + " ");
        }
    }
}