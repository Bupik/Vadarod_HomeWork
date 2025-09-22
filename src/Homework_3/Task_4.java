package Homework_3;

public class Task_4 {

    public static void main(String[] args) {

        //4*. Даны значения: x=5; y=2; c=x*y;
        // Составьте операции инкремента декремента так, чтобы после выполнения операции (c=x*y) с равнялось 12, x=равнялось 6, y=1
        // Выведите полученные значения в консоль.

        int x = 5;
        int y = 2;

        int c = ++x * y--;

        System.out.println("с = " + c + " x = " + x + " y = " + y);
    }
}