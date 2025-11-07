package Homework_18;

public class Car extends Thread {

    //1. Создать класс авто. Поля в классе будут: имя машины, гос. номер, время остановки.
    //Определить в нём метод, при котором авто будет просто ехать (выводить в консоль сообщение в цикле).

    private String carName;
    private String carNumber;
    private int stopTime;

    public Car(String carName, String carNumber, int stopTime) {
        this.carName = carName;
        this.carNumber = carNumber;
        this.stopTime = stopTime;
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(carName + " [" + carNumber + "] едет... шаг " + (i + 1));
            try {
                Thread.sleep(stopTime);
            } catch (InterruptedException e) {
                System.out.println(carName + " прерван.");
            }
        }
        System.out.println(carName + " завершил движение.");
    }
}