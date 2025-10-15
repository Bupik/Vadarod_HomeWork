package Homework_9_10;

public class Dog extends Animal {

    private String name;
    private String breed;
    private double avgWeight;


    public Dog(String color, int maxAge, String typeOfFood, String name, String breed, double avgWeight) {
        super(color, maxAge, typeOfFood);
        this.name = name;
        this.breed = breed;
        this.avgWeight = avgWeight;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getAvgWeight() {
        return avgWeight;
    }

    public void toBark() {
        System.out.println(name + " гавкает");
    }

    public void toBite() {
        System.out.println(name + " кусается");
    }

    public void toRun() {
        System.out.println(name + " бежит");

    }

    public void jump() {
        System.out.println(name + " прыгает");
    }

    public void animalIsPlaying() {
        System.out.println(name + " играет");
    }

    public void animalIsMakingSound() {
        System.out.println(name + " рычит");
    }

    public String toString() {
        return "Собака: имя = " + name + ", порода = " + breed + ", вес = " + avgWeight + " кг, окрас = " + color + ", макс. возраст = " + maxAge + ", тип еды = " + typeOfFood;
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof Dog)) {
            return false;
        }

        Dog dog = (Dog) obj;

        if (name.equals(dog.getName()) && breed.equals(dog.getBreed()) && avgWeight == dog.getAvgWeight()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = (int) (avgWeight + name.hashCode() + breed.hashCode());
        return result;
    }
}