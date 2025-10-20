package Homework_11;

public class Builder implements Engineer {

    //РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)
    //В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)
    //1.3 Метод включения и выключения робота должен менять поле в каждом роботе Boolean isOn.
    //1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.)

    private String model;
    private String power;
    private String country;
    private String aggregate;
    private String material;
    private boolean isOn;

    public Builder(String model, String power, String country, String aggregate, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.country = country;
        this.aggregate = aggregate;
        this.material = material;
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
        System.out.println(model + " выключен.");
    }

    @Override
    public void uniquePossibility() {
        System.out.println(model + " строит");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт бетон");
    }
}