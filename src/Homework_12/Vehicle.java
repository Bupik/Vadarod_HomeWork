package Homework_12;

public class Vehicle {

    //Создать классы Car и Motorcycle, которые наследуются от общего класса Vehicle (транспорт)
    //1.1 Создать поле name и количество выбросов(Integer) в классе Vehicle и проинициализировать его через конструктора.
    //1.2 Реализовать методы геттеры и сеттеры для соответствующих полей класса Vehicle

    private String name;
    private int emissions;

    public Vehicle(String name, int emissions) {
        this.name = name;
        this.emissions = emissions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEmissions() {
        return emissions;
    }

    public void setEmissions(int emissions) {
        this.emissions = emissions;
    }
}