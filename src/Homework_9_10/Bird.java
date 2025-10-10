package Homework_9_10;

public class Bird extends Animal {

    private String family;
    private int maxHeightOfFlight;


    public Bird(String color, int maxAge, String typeOfFood, String family, int maxHeightOfFlight) {
        super(color, maxAge, typeOfFood);
        this.family = family;
        this.maxHeightOfFlight = maxHeightOfFlight;
    }

    public String getFamily() {
        return family;
    }

    public int getMaxHeightOfFlight() {
        return maxHeightOfFlight;
    }

    public void toPeck() {
        System.out.println(family + " клюёт");
    }

    public void incubateEggs() {
        System.out.println(family + " высиживает птенцов");
    }

    public void animalIsMakingSound() {
        System.out.println(family + " чирикает");
    }

    public void animalIsPlaying() {
        System.out.println(family + " играет");
    }

    public String toString() {
        return "Птица: семейство = " + family + ", макс. высота полета = " + maxHeightOfFlight + " м, окрас = " + color + ", макс. возраст = " + maxAge + ", тип еды = " + typeOfFood;
    }

    public boolean equals(Object obj) {

        if (!(obj instanceof Bird)) {
            return false;
        }

        Bird bird = (Bird) obj;

        if (family.equals(bird.getFamily()) && maxHeightOfFlight == bird.getMaxHeightOfFlight()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = family.hashCode() + maxHeightOfFlight;
        return result;
    }
}