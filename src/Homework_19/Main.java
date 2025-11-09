package Homework_19;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    //1 Создать интерфейс, который будет обрабатывать входящий параметр типа String.
    //1.1 На основании этого интерфейса создать лямбда выражение, которое будет возвращать строку с большими буквами.
    //1.1. Создать города
    //1.2. Найти самый густонаселённый город на континенте (filter по континенту+ max)
    //1.3. Найти город, с минимальным населением на континенте. (filter по континенту+ min)
    //1.4. Найти самый густонаселённый город (max)
    //1.5. Найти город с самым маленьким населением. (min)
    //1.6. Найти первый попавшиеся город, у которого население больше 1млн. (filter + findFirst).
    //1.7. Отобрать города с населением больше 1 млн. (filter)
    //1.8. Создать коллекцию из названий городов, на основании объектов (map)

    public static Optional<City> getMaxCityOnContinent(List<City> cities, Continent continent) {
        return cities.stream()
                .filter(c -> c.getContinent() == continent)
                .max(Comparator.comparingInt(City::getPopulation));
    }

    public static Optional<City> getMinCityOnContinent(List<City> cities, Continent continent) {
        return cities.stream()
                .filter(c -> c.getContinent() == continent)
                .min(Comparator.comparingInt(City::getPopulation));
    }

    public static Optional<String> getMaxCityName(List<City> cities) {
        return cities.stream()
                .max(Comparator.comparingInt(City::getPopulation))
                .map(City::getCityName);  // берём только название
    }

    public static Optional<String> getMinCityName(List<City> cities) {
        return cities.stream()
                .min(Comparator.comparingInt(City::getPopulation))
                .map(City::getCityName);   // берём только название
    }

    public static Optional<City> getFirstBigCityName(List<City> cities) {
        return cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .findFirst();
    }

    public static List<City> getBigCities(List<City> cities) {
        return cities.stream()
                .filter(c -> c.getPopulation() > 1_000_000)
                .collect(Collectors.toList());
    }

    public static List<String> getCityNames(List<City> cities) {
        return cities.stream()
                .map(City::getCityName)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {


        WorkWithString upperCase = someString -> {
            return someString.toUpperCase();
        };
        System.out.println(upperCase.workWithString("привет"));


        List<City> cities = List.of(
                new City(1, "Минск", 2000000, Continent.EUROPE),
                new City(2, "Берлин", 3500000, Continent.EUROPE),
                new City(3, "Токио", 14000000, Continent.ASIA),
                new City(4, "Сидней", 5000000, Continent.AUSTRALIA),
                new City(5, "Кейптаун", 4300000, Continent.AFRICA),
                new City(6, "Лима", 9700000, Continent.SOUTH_AMERICA),
                new City(7, "Осло", 700000, Continent.EUROPE)
        );

        getMaxCityOnContinent(cities, Continent.EUROPE)
                .map(City::getCityName)
                .ifPresent(name -> System.out.println("\nГород с максимумом жителей на континенте Европа: " + name));

        getMinCityOnContinent(cities, Continent.EUROPE)
                .map(City::getCityName)
                .ifPresent(name -> System.out.println("\nГород с минимумом жителей на континенте Европа: " + name));

        getFirstBigCityName(cities)
                .map(City::getCityName)
                .ifPresent(name -> System.out.println("\nПервый город в коллекции с населением >1 млн человек человек: " + name));

        getMaxCityName(cities)
                .ifPresent(name -> System.out.println("\nСамый густонаселённый город: " + name));

        getMinCityName(cities)
                .ifPresent(name -> System.out.println("\nСамый маленький город по количеству населения: " + name));


        List<City> bigCities = getBigCities(cities);
        System.out.println("\nГорода с населением  > 1 млн человек из всех континентов: " + bigCities);

        List<String> names = getCityNames(cities);
        System.out.println("\nНазвания городов: " + names);
    }
}