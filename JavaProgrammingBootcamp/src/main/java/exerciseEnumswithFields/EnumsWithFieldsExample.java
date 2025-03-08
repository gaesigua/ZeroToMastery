package exerciseEnumswithFields;

public class EnumsWithFieldsExample {
    public static void main(String[] args) {

        for (Planet planet: Planet.values()){
            System.out.println(planet.getName() + " is " + planet.getDistanceFromSun() + " From the Sun!!");
        }
    }
}
