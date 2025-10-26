package Homework_14;

import java.util.HashSet;
import java.util.Set;

public class Room {

    //1. Создать класс пациент, палата, отделение.
    //1.2 У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов
    //1.6 Реализовать метод добавления пациента в палату на основе диагноза. Т.е, в палате должны лежать пациенты с одинаковыми диагнозами. Метод реализовать в классе Палата.
    //1.7 В классе Палата создать метод, которые выводить информацию по всем пациентам в палате.

    private int roomNumber;
    private RoomType roomType;
    private Set<Patient> patients = new HashSet<>();

    public Room(int roomNumber, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public boolean addPatient(Patient patient) {

        if (patients.size() >= 3) return false;

        // Если палата пустая — можно добавить любого пациента
        if (patients.isEmpty()) {
            return patients.add(patient);
        }

        // Проверяем диагноз первого пациента в палате
        for (Patient p : patients) {
            if (p.getDiagnosis().equals(patient.getDiagnosis())) {
                return patients.add(patient);
            } else {
                // Диагноз не совпадает — нельзя добавить
                return false;
            }
        }
        return false; // На всякий случай, если что-то пошло не так
    }

    public void printPatients() {
        System.out.println("\nПациенты в палате №" + roomNumber + ":\n");
        for (Patient p : patients) {
            System.out.println(" - " + p);
        }
    }

    //Посчитать количество мужчин и женщин
    public int countByGender(Gender gender) {
        int count = 0;
        for (Patient patient : patients) {
            if (patient.getGender() == gender) {
                count++;
            }
        }
        return count;
    }
}