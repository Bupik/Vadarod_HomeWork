package Homework_8;

public class Task2 {

    //2. Дан текст:
    //2.1 В тексте после символа каждого слова с индексом k вставить заданную подстроку. Используемые методы (split(), substring())
    //Вынести это в отдельный метод с сигнатурой public String (int k, String text)

    public String isertSubstring(int k, String text) {
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            if (i == k) {
                // Вставляем подстроку в конец слова с индексом k
                result.append(words[i]).append("*").append(" ");
            } else {
                result.append(words[i]).append(" ");
            }
        }
        return result.toString().trim();
    }


    public static void main(String[] args) {

        Task2 converter = new Task2();
        String text = "Каждая строка, создаваемая с помощью оператора new,литерала (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса. Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";
        int k = 5;

        String result = converter.isertSubstring(k, text);
        System.out.println(result);
    }
}