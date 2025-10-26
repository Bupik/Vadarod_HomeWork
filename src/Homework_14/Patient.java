package Homework_14;

import java.util.Objects;

public class Patient {

    //1. Создать класс пациент, палата, отделение.
    //1.1 У пациента поля: уникальный идентификатор, имя, фамилия, диагноз, возраст, пол (сделать enum класс: Мужской, Женский).

    private int id;
    private String name;
    private String surname;
    private String diagnosis;
    private int age;
    private Gender gender;

    public Patient(int id, String name, String surname, String diagnosis, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age &&
                Objects.equals(name, patient.name) &&
                Objects.equals(surname, patient.surname) &&
                Objects.equals(diagnosis, patient.diagnosis) &&
                gender == patient.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, diagnosis, age, gender);
    }

    @Override
    public String toString() {
        return name + " " + surname + ", возраст: " + age + ", диагноз: " + diagnosis + ", пол: " + gender;
    }
}