package Homework_17;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

    //Дан текст:
    //1.1 Записать его в файл, прописав относительный путь. Реализуйте соответствующий метод в классе Main.
    //1.2 Записать его в файл прописав абсолютный путь. Реализуйте соответствующий метод в классе Main
    //1.3 Вычитать текст из первого файла. Реализуйте соответствующий метод в классе Main
    //1.4 Вычитать текст из второго файла. Реализуйте соответствующий метод в классе Main
    //2.1 Создать объект Автомобиль с полями (Марка автомобиля, максимальная скорость, страна производства).
    //Переопределите метод toString(), equals(), hashcode(), гетеры и сетеры (генерируйте с помощью идеи). В классе Main создать объект автомобиль.
    //Выполнить сериализацию объекта. Реализуйте соответствующий метод в классе Main
    //2.2 Выполнить десериализацию автомобиля и вывести его в консоли. Реализуйте соответствующий метод в классе Main

    private static String text = "The Rostóvs knew everybody in Moscow. The old count had money enough that year, as all his estates had been remortgaged, and so Nicholas, acquiring a trotter of his own, very stylish riding breeches of the latest cut, such as no one else yet had in Moscow, and boots of the latest fashion, with extremely pointed toes and small silver spurs, passed his time very gaily. After a short period of adapting himself to the old conditions of life, Nicholas found it very pleasant to be at home again. He felt that he had grown up and matured very much. His despair at failing in a Scripture examination, his borrowing money from Gavríl to pay a sleigh driver, his kissing Sónya on the sly—he now recalled all this as childishness he had left immeasurably behind. Now he was a lieutenant of hussars, in a jacket laced with silver, and wearing the Cross of St. George, awarded to soldiers for bravery in action, and in the company of well-known, elderly, and respected racing men was training a trotter of his own for a race. He knew a lady on one of the boulevards whom he visited of an evening. He led the mazurka at the Arkhárovs’ ball, talked about the war with Field Marshal Kámenski, visited the English Club, and was on intimate terms with a colonel of forty to whom Denísov had introduced him.";

    private static void writeByAbsolutePath() {

        File file = new File("C:\\Users/natalia.boytsova\\IdeaProjects", "Homework17.txt");
        char[] charStr = text.toCharArray();

        try (FileWriter fileWriter = new FileWriter(file)) {
            for (char a : charStr) {
                fileWriter.write(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка");
        }
    }

    private static void writeByRelativePath() {

        File file = new File("src\\Homework17.txt");
        char[] charStr = text.toCharArray();

        try (FileWriter fileWriter = new FileWriter(file)) {
            for (char a : charStr) {
                fileWriter.write(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Ошибка");
        }
    }

    private static void readByAbsolutePath() {

        File file = new File("C:\\Users/natalia.boytsova\\IdeaProjects", "Homework17.txt");

        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String someText = bufferedReader.readLine();
            System.out.println(someText);

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException("Необходимо закрыть поток");
        }
    }

    private static void readByRelativePath() {

        File file = new File("src\\Homework17.txt");

        try (FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8)) {

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String someText = bufferedReader.readLine();
            System.out.println("\n" + someText);

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException("Необходимо закрыть поток");
        }
    }

    //Сериализация
    public static void serializeCar(Car car, String file) {

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(car);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка сериализации");
        }
    }

    //Десериализация
    public static Car deserializeCar(String file) {

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            Car carResult = (Car) objectInputStream.readObject();
            return carResult;
        } catch (Exception e) {
            throw new RuntimeException("Ошибка десериализации");
        }
    }

    public static void main(String[] args) {

        // writeByAbsolutePath();
        // writeByRelativePath();
        // readByAbsolutePath();
        // readByRelativePath();

        Car car = new Car("BMW", 250, "Germany");

        String path = "src/serialization.txt";
        serializeCar(car, path);
        Car deserializedCar = deserializeCar(path);
        System.out.println("\nDeserialized Car:\n" + deserializedCar);
    }
}