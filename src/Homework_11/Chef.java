package Homework_11;

public class Chef implements Robot {

    //РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).

    private String model;
    private String power;
    private String country;
    private String aggregate;
    private boolean isOn;

    public Chef(String model, String power, String country, String aggregate, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.aggregate = aggregate;
        this.isOn = false;
    }

    @Override
    public void turnOnRobot() {
        isOn = true;
        System.out.println(model + " включён");
    }

    @Override
    public void turnOffRobot() {
        isOn = false;
        System.out.println(model + " выключен");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " готовит блюдо");
    }
}