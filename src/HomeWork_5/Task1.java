package HomeWork_5;

public class Task1 {

    public static void main(String[] args) {

        //1. Вывести все числа кратные 7 или 3 в диапазоне от 1 до 100. (можно использовать цикл for)

        for (int a = 1; a <= 100; a++) {
            if (a % 7 == 0 | a % 3 == 0) {
                System.out.println(a);
            }
        }
    }
}