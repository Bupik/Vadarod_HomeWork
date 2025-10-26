package Homework_14;

import java.util.HashSet;
import java.util.Set;

public class Department {

    //1. Создать класс пациент, палата, отделение.
    //1.3 У отделения поля: наименование отделения, список палат (коллекция Set)
    //Палаты распределить по отделениям.
    //1.5 Посчитать количество мужчин и женщин в отделении.

    private String departmentName;
    private Set<Room> rooms = new HashSet<>();

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    //Добавление палаты в отделение
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int countGender(Gender gender) {
        int count = 0;
        for (Room room : rooms) {
            count += room.countByGender(gender);
        }
        return count;
    }
}