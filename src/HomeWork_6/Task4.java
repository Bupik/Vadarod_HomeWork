package HomeWork_6;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        //4.*Создать массив (вручную).
        //Отсортировать элементы массива в порядке возрастания.
        //Вывести полученный массив.
        //Выполнить с помощью цикла for

        int[] array = {10, 3, 35, 18, 100, 65, 29, 74, 31, 88};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array) + " ");

    }
}