package Homework_17;

import Homework_14.Patient;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {

    //2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства).
    //Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи). В классе Main создать объект автомобиль.
    //Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main

    private String carBrand;
    private int maxSpeed   ;
    private String madeIn;

    public Car(String carBrand, int maxSpeed, String madeIn) {
        this.carBrand = carBrand;
        this.maxSpeed = maxSpeed;
        this.madeIn = madeIn;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return maxSpeed == car.maxSpeed &&
                Objects.equals(carBrand, car.carBrand) &&
                Objects.equals(madeIn, car.madeIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, maxSpeed, madeIn);
    }

    @Override
    public String toString() {
        return "Марка машины: " + carBrand + ", Максимальная скорость:  " + maxSpeed + ", Страна производства: " + madeIn;
    }
}