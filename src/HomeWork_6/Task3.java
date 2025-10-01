package HomeWork_6;

public class Task3 {

    public static void main(String[] args) {

        //3.* Создать массив вручную.
        //Заменить максимальный и минимальный элемент массива.
        //Новый минимальный элемент будет (-1000), новый максимальный элемент 1000.

        int[] array = {95, 2, -1000, 136, 523, 184, 736, 1000, -203, -305};
        int minelement = 0;
        int maxelement = 0;

        for (int element : array) {

            if (element > maxelement) {
                maxelement = element;
            }
            if (element < minelement) {
                minelement = element;
            }
        }

        System.out.println("Максимальный элемент массива = " + maxelement);
        System.out.println("Минимальный элемент массива = " + minelement);
    }
}