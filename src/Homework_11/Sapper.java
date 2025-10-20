package Homework_11;

public class Sapper implements Engineer {

    //РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)

    private String model;
    private String power;
    private  String tool;
    private String material;
    private boolean isOn;

    public Sapper(String model, String power, String tool, String material, boolean isOn) {
        this.model = model;
        this.power = power;
        this.tool = tool;
        this.material = material;
        this.isOn = false;
    }

    @Override
    public void repairRobot() {
        System.out.println(model + " проводит разминирование");
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
        System.out.println(model + " минирует");
    }

    @Override
    public void createItem() {
        System.out.println(model + " создаёт приспособление для разминирования");
    }
}
