package HomeWork_6;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {

        //2. Создать массив из 5 чисел и заполните этот массив вручную.
        //Создайте второй массив с размерностью больше на 1 чем первый массив.
        //Необходимо скопировать первый массив со всеми значениями во второй массив.
        // Последний элемент во втором массиве пусть будет 0.
        // Выведите второй массив в консоль с помощью цикла for each.

        int[] array =  {21, 13, 99, 8, 71};
        int[] array2 =  new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        for (int newarray2 : array2) {
            System.out.print(newarray2 + " ");
        }

        //System.out.println(Arrays.toString(array2) + " ");
    }
}