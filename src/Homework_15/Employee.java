package Homework_15;

import java.util.Objects;

public class Employee {

    //1.1. Создать класс. Сотрудник.
    //1.2. Поля у сотрудника. Идентификационный номер, Имя, фамилия, возраст, зарплата.

    private int id;
    private String name;
    private String surname;
    private int age;
    private double salary;

    public Employee(int id, String name, String surname, int age, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double amount) {
        this.salary += amount;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + getFullName() + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        //Приведение типа Object к типу Employee
        Employee employee = (Employee) o;
        //Сравнение идентификаторов
        return this.id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}