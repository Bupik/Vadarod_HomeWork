package Homework_15;

import java.util.HashMap;
import java.util.Map;

public class Main {

    //1.3. Создать сотрудников (создайте штук восемь)
    //1.4. Создать мапку и записать туда созданных сотрудников в качестве ключа., а в качестве значения им присвоить им профессию.
    //1.5 Реализуйте статический метод в классе Main, который повысит зарплату сотрудникам одной профессии. Сигнатура метода к примеру такая.
    //private static void raiseSalaryForProfession(Map<Employee, String> employees, int amountOfIncrease).
    //Например: Необходимо повысить зарплату плотникам на 200 рублей. (Обратите внимание на метод entrySet).

    public static void main(String[] args) {

        // Создание сотрудников
        Employee e1 = new Employee(1, "Иван", "Иванов", 30, 50000);
        Employee e2 = new Employee(2, "Петр", "Петров", 28, 48000);
        Employee e3 = new Employee(3, "Сергей", "Сергеев", 35, 52000);
        Employee e4 = new Employee(4, "Алексей", "Алексеев", 40, 60000);
        Employee e5 = new Employee(5, "Дмитрий", "Дмитриев", 25, 45000);
        Employee e6 = new Employee(6, "Николай", "Николаев", 32, 47000);
        Employee e7 = new Employee(7, "Андрей", "Андреев", 29, 49000);
        Employee e8 = new Employee(8, "Владимир", "Владимиров", 38, 53000);

        // Создание Map: сотрудник -> профессия
        Map<Employee, String> employeeMap = new HashMap<>();
        employeeMap.put(e1, "Плотник");
        employeeMap.put(e2, "Электрик");
        employeeMap.put(e3, "Плотник");
        employeeMap.put(e4, "Сантехник");
        employeeMap.put(e5, "Плотник");
        employeeMap.put(e6, "Электрик");
        employeeMap.put(e7, "Сантехник");
        employeeMap.put(e8, "Плотник");

        // Повышение зарплаты плотникам на 200
        raiseSalaryForProfession(employeeMap, "Плотник", 200);

        // Вывод обновленных сотрудников
        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " -- " + entry.getValue() + "\n");
        }
    }

    private static void raiseSalaryForProfession(Map<Employee, String> employees, String profession, int amountOfIncrease) {
        for (Map.Entry<Employee, String> entry : employees.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(profession)) {
                entry.getKey().increaseSalary(amountOfIncrease);
            }
        }
    }
}