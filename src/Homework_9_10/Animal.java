package Homework_9_10;

public class Animal {

    protected String color;
    protected int maxAge;
    protected String typeOfFood;

    public Animal(String color, int maxAge, String typeOfFood) {
        this.color = color;
        this.maxAge = maxAge;
        this.typeOfFood = typeOfFood;
    }

    public void animalIsMakingSound() {
        System.out.println("животное издаёт звук");
    }

    public void animalIsPlaying() {
        System.out.println("животное играет");
    }

    public String toString() {
        return "Животное: окрас = " + color + ", макс. возраст = " + maxAge + ", тип еды = " + typeOfFood;
    }
}