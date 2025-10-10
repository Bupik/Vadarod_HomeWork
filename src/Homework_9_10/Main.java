package Homework_9_10;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Bird bird1 = new Bird("бирюзовый", 10, "пшено", "Какаду", 50);
        Bird bird2 = new Bird("синий", 8, "шишки", "Синица", 150);
        Bird bird3 = new Bird("белый", 20, "рыба", "Чайка", 300);
        //Одинаковый объект для проверки задания 10 - методов equals и hashCode
        Bird bird4 = new Bird("бирюзовый", 10, "пшено", "Какаду", 50);

        zoo.addAnimal(bird1);
        zoo.addAnimal(bird2);
        zoo.addAnimal(bird3);

        Dog dog1 = new Dog("коричневый", 15, "мясо", "Тузик", "Лабрадор", 35.5);
        Dog dog2 = new Dog("рыжий", 12, "роял канин", "Бобик", "Спаниель", 18.2);
        Dog dog3 = new Dog("чёрный", 10, "педигри", "Шарик", "Овчарка", 10.0);
        //Одинаковый объект для проверки задания 10 - методов equals и hashCode
        Dog dog4 = new Dog("коричневый", 15, "мясо",  "Тузик", "Лабрадор", 35.5);

        zoo.addAnimal(dog1);
        zoo.addAnimal(dog2);
        zoo.addAnimal(dog3);

        for (Animal animal : zoo.getAnimals()) {
            System.out.println(animal.toString());
            animal.animalIsMakingSound();
            animal.animalIsPlaying();
            System.out.println("-----------------------------------------------------");
        }

        System.out.println("*********************************************************");

        System.out.println(bird1.equals(bird4));
        System.out.println(dog1.equals(dog4));

        System.out.println("*********************************************************");

        System.out.println(bird1.hashCode());
        System.out.println(bird4.hashCode());
        System.out.println(dog1.hashCode());
        System.out.println(dog4.hashCode());
    }
}