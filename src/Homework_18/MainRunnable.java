package Homework_18;

public class MainRunnable {

    public static void main(String[] args) {

        Runnable car1 = new CarRunnable("BMW", "1234AB-7", 1000);
        Runnable car2 = new CarRunnable("Audi", "5678CD-7", 1200);
        Runnable car3 = new CarRunnable("Tesla", "9999EF-7", 800);

        // 1.1: Два потока параллельно
        Thread t1 = new Thread(car1);
        Thread t2 = new Thread(car2);

        t1.start();
        t2.start();

        // 1.3: Один поток, затем два после join
        Thread t3 = new Thread(car3);
        Thread t4 = new Thread(new CarRunnable("BMW", "1234AB-7", 1000));
        Thread t5 = new Thread(new CarRunnable("Audi", "5678CD-7", 1200));

        t3.start();
        try {
            t3.join(); // ждём завершения car3
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t4.start();
        t5.start();
    }
}