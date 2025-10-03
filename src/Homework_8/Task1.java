package Homework_8;

public class Task1 {

//1. Задание
//1.1. Напишите метод, который будет возвращать String и принимать в качестве 1-ого параметра и 2-ого параметра объекты типа String.
//1.2. В этом методе необходимо выполнить следующую логику. Если строка в 1-ом параметре заканчивается строкой из второго параметра, то необходимо вырезать из строки 1-ого параметра значение
//строки не включающей строку из второго параметра. Иначе вернуть строку из 1-ого параметра приведённую к верхнему регистру.
//Пример. Есть 1-ая строка «Я люблю java» и 2-ая строка «java». Так как первая строка оканчивается такой же строкой, что и 2-ая строка (java), то метод должен
//вернуть «Я люблю» иначе метод должен вернуть «Я ЛЮБЛЮ». В этом методе нужно использовать методы для работы со строками: endWith(), indexOf(), substring(), toUpperCase();
//1.3. В методе main вызовите этот метод, передайте любые строки, в качестве аргументов и выведите результат в консоль.

    public static String modifyStrings(String string1, String string2) {
        if (string1.endsWith(string2)) {
            int endIndex = string1.lastIndexOf(string2);
            return string1.substring(0, endIndex).trim(); // удаляем вторую строку из конца
        } else {
            return string1.toUpperCase(); // если не заканчивается — возвращаем в верхнем регистре
        }
    }

    public static void main(String[] args) {
        String str1 = "Я люблю java";
        String str2 = "java";

        String result = modifyStrings(str1, str2);
        System.out.println("Результат: " + result);

        String str3 = "Я люблю";
        String str4 = "java";

        System.out.println("Результат: " + modifyStrings(str3, str4));
    }
}