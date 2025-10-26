package Homework_14;

public class Main {

    //1.4 Создать пациентов. Распределить их по палатам. В одной палате по 3 пациента максимум.
    //При этом попробуйте добавит двух пациентов, с одинаковыми полями. Если количество пациентов в палате увеличилось, значит неправильно реализованы equals и hashСode.
    //Палаты распределить по отделениям.
    //1.5 Посчитать количество мужчин и женщин в отделении.

    public static void main(String[] args) {

        Patient p1 = new Patient(1,"Иван", "Иванов", "Пневмония", 30, Gender.MALE);
        Patient p2 = new Patient(2, "Петр", "Петров", "Пневмония", 25, Gender.MALE);
        Patient p3 = new Patient(3, "Сергей", "Сергеев", "Пневмония", 40, Gender.MALE);
        Patient p4 = new Patient(4, "Анна", "Антонова", "Бронхит", 28, Gender.FEMALE);
        Patient p5 = new Patient(5, "Мария", "Маркова", "Бронхит", 35, Gender.FEMALE);
        Patient p6 = new Patient(6, "Анна", "Антонова", "Бронхит", 28, Gender.FEMALE); // Дубликат

        Room maleRoom = new Room(101, RoomType.MALE);
        Room femaleRoom = new Room(102, RoomType.FEMALE);

        maleRoom.addPatient(p1);
        maleRoom.addPatient(p2);
        maleRoom.addPatient(p3);

        femaleRoom.addPatient(p4);
        femaleRoom.addPatient(p5);
        femaleRoom.addPatient(p6); // Проверка equals/hashCode

        Department therapy = new Department("Терапия");
        therapy.addRoom(maleRoom);
        therapy.addRoom(femaleRoom);

        System.out.println("Мужчин в отделении: " + therapy.countGender(Gender.MALE));
        System.out.println("Женщин в отделении: " + therapy.countGender(Gender.FEMALE));

        System.out.println("\n************************************************************");

        maleRoom.printPatients();
        femaleRoom.printPatients();
    }
}