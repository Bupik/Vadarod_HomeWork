package Homework_11;

public class Main {

    public static void main(String[] args) {

        //1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод отремонтировать робота (результаты выполнения методы выведите в консоль)
        //1.6 Создать 3 выставки (массива) роботов в классе Main.
        //Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель).
        //Вторая выставка - только для инженерных роботов. Третья выставка- для роботов сапёров.
        //Продемонстрировать способности всех роботов, которые представлены на выставках (вызвать метод uniquePossibility)
        //Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод createItem на каждом Роботе, который есть на выставке.


        Chef chef = new Chef("Повар", "200 Вт", "Вьетнам", "миксер", true);
        Sapper sapper = new Sapper("Сапёр", "1000 Вт", "шасси", "сталь", true);
        Builder builder = new Builder("Строитель", "500 Вт", "Китай", "домов", "железо", true);

        //вызов метода отремонтировать робота
        chef.repairRobot();
        sapper.repairRobot();
        builder.repairRobot();

        System.out.println("***********************************************************");

        //Выставки
        Robot[] allRobots = {chef, sapper, builder};
        Engineer[] engineerRobots = {sapper, builder};
        Sapper[] sapperRobots = {sapper};

        System.out.println("----- Все роботы -----");
        for (Robot robot : allRobots) {
            robot.uniquePossibility();
        }

        System.out.println("----- Инженерные роботы -----");
        for (Engineer engineer : engineerRobots) {
            engineer.uniquePossibility();
            engineer.createItem();
        }

        System.out.println("----- Роботы-сапёры -----");
        for (Sapper someSapper : sapperRobots) {
            someSapper.uniquePossibility();
        }
    }
}