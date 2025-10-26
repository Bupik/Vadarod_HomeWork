package Homework_13;

public class Student {

    //Создать класс студент (Student), группа (Group), факультет (Faculty).
    //У студента поля: имя, фамилия, дата рождения, город рождения, средний бал.
    //Реализовать во всех классах методы геттеры и сеттеры.

    private String name;
    private String surname;
    private int birthDate;
    private String birthCity;
    private double avgmark;

    public Student(String name, String surname, int birthDate, String birthCity, double avgmark) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
        this.avgmark = avgmark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public double getAvgmark() {
        return avgmark;
    }

    public void setAvgmark(double avgmark) {
        this.avgmark = avgmark;
    }
}