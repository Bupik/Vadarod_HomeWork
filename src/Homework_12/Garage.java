package Homework_12;

public class Garage<T extends Vehicle> {

    //1.3 Создать generic класс Garage<T extends Vehicle >, который может хранить только объекты типа наследуемого от Vehicle.
    //1.4 Реализовать метод в классе Garage, который будет разрешать или запрещать въезд в гараж в зависимости от количества выбросов транспортного средства.
    //(Boolean isEntryPermitted()); Реализовать этот метод: если количество выбросов больше 100, тогда въезд запрещён, если меньше 100 – въезд разрешён.

    private T vehicle;

    public Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }

    public boolean isEntryPermitted() {
        if (vehicle.getEmissions() < 100) {
            System.out.println("Въезд разрешён");
            return true;
        } else {
            System.out.println("Въезд запрещён");
            return false;
        }
    }
}