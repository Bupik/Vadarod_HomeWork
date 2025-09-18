package Homework_3;

public class Task2 {

    public static void main(String[] args) {

//        2. x=x+5; y=y*9; z=z-6;
//        Необходимо укоротить данные выражения, чтобы результат не изменился. x=8; y=9; z=12;
//        (операции присваивания, нужно просто написать по-другому)

        int x = 3;
        int y = 1;
        int z = 18;

        x += 5;
        y *= 9;
        z -= 6;

        System.out.println("x = " + x + " y = " + y + " z = " + z);
    }
}