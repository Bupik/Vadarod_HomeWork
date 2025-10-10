package Homework_9_10;

public class Zoo {

    private Animal[] animals = new Animal[0];

    public void addAnimal(Animal animal) {

        Animal[] newAnimals = new Animal[animals.length + 1];

        for (int i = 0; i < animals.length; i++) {
            newAnimals[i] = animals[i];
        }

        newAnimals[animals.length] = animal;
        animals = newAnimals;
    }

    public Animal[] getAnimals() {
        return animals;
    }
}