package Homework_18;

public class CarRunnable implements Runnable {

    //1.4 Сделать задачу 1.1 и 1.2 через интерфейс Runnable. Для этого создайте в пакете с домашним заданием, пакет с названием runnable.
    //В этом пакете реализуйте (скопируйте) класс Авто с последующим изменением.

    private String carName;
    private String carNumber;
    private int stopTime;

    public CarRunnable(String carName, String carNumber, int stopTime) {
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