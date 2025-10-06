package Homework_8;

public class Task2 {

    //2. Дан текст:
    //2.1 В тексте после символа каждого слова с индексом k вставить заданную подстроку. Используемые методы (split(), substring())
    //Вынести это в отдельный метод с сигнатурой public String (int k, String text)

    private String originalText = "Каждая строка, создаваемая с помощью оператора new,литерала (заключенная в двойные апострофы) " +
            "и ли метода класса, создающего строку, является экземпляром класса String. Особенностью объекта класса String " +
            "является то, что его значение не может быть изменено после создания объекта при помощи любого метода класса." +
            " Изменение строки всегда приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет" +
            " прежнее значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя ссылку.";

    public String method(int k, String text) {
        String[] words = originalText.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > k) {
                String modified = word.substring(0, k + 1) + text + word.substring(k + 1);
                result.append(modified);
            } else {
                result.append(word);
            }
            result.append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        Task2 converter = new Task2();
        String result = converter.method(3, "*");
        System.out.println(result);
    }
}