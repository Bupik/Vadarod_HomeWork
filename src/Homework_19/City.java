package Homework_19;

public class City {

    //2. Создать класс Город. Поля id, имя города, население, континент (Enum)

    private int id;
    private String cityName;
    private int population;
    private Continent continent;

    public City(int id, String cityName, int population, Continent continent) {
        this.id = id;
        this.cityName = cityName;
        this.population = population;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getPopulation() {
        return population;
    }

    public Continent getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return cityName + " (" + population + ")";
    }
}