package exerciseEnumsWithFields2;

public class EnumsWithFieldsExample {
    public static void main(String[] args) {

        for (Planet planet: Planet.values()){
            System.out.println(planet.getName() + " Planet is " + planet.getDistanceFromSun()+ " kms away from the sun." + " It is also known as " + planet.getNickname());
        }

        for (Planet planet: Planet.values()){
            System.out.println("%s is %.2f AU from the Sun%n", planet.getName(), planet.getDistanceFromSun());
        }

    }
}
