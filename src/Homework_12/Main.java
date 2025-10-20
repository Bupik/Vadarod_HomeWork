package Homework_12;

public class Main {

    //1.5 Класс Main. Создать 2 объекта класса Garage. Вывести на экран имя хранимого транспортного средства и проверить разрешён ли въезд транспортного средства в гараж.

    public static void main(String[] args) {

        Garage<Car> carGarage = new Garage<>(new Car("Лада Веста", 120));
        Garage<Motorcycle> motoGarage = new Garage<>(new Motorcycle("Иж", 80));

        System.out.println("Транспорт: " + carGarage.getVehicle().getName());
        carGarage.isEntryPermitted(); // метод сам выводит сообщение

        System.out.println("**********************************");

        System.out.println("Транспорт: " + motoGarage.getVehicle().getName());
        motoGarage.isEntryPermitted(); // метод сам выводит сообщение

    }
}