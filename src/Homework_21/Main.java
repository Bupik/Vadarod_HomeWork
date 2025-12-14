package Homework_21;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

//1. Вывести текущую дату в формате (пример формата: 1 апреля 2023). На выходе дата должна быть класса String
//2. Вывести текущую дату в формате (пример формата: 1 апреля 2023, 10:59:20 PM). На выходе дата должна быть класса String
//3. Перевести String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime по умолчанию:
//4. Перевести String (пн 20.03.23 г. время: 15:07:28) в формат LocalDateTime по умолчанию:

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        DateTimeFormatter localDate = DateTimeFormatter.ofPattern("d MMMM yyyy");
        String formattedDate = today.format(localDate);
        System.out.println("\n" + "Текущую дата в формате '1 апреля 2023' - " + formattedDate);


        System.out.println("\n********************************************************");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter localDate2 = DateTimeFormatter.ofPattern("d MMMM yyyy, hh:mm:ss a");;
        String formattedDateTime = now.format(localDate2);
        System.out.println("\n" + "Текущую дата в формате '1 апреля 2023, 10:59:20 PM' - " + formattedDateTime);

        System.out.println("\n********************************************************");


        String stringDate = "2023-03-19 : 10:12:24 AM";
        DateTimeFormatter stringToLocalDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd : hh:mm:ss a");
        LocalDateTime dateTime = LocalDateTime.parse(stringDate, stringToLocalDateTime);
        System.out.println("\n" + "Переведена String (2023-03-19 : 10:12:24 AM) в формат LocalDateTime - "  + dateTime);


        System.out.println("\n********************************************************");

        String stringDate2 = "пн 20.03.23 г. время: 15:07:28";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EE dd.MM.yy 'г.' 'время:' HH:mm:ss");
        LocalDateTime dateTime2 = LocalDateTime.parse(stringDate2, formatter);
        System.out.println("\n" + "Переведена String (пн 20.03.23 г. время: 15:07:28) в формат LocalDateTime - "  + dateTime2);
    }
}