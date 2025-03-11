package exerciseEnumsWithFields2;

public class EnumsWithFieldsExample {
    public static void main(String[] args) {
        for (Planet planet: Planet.values()){
            System.out.printf("%s is %.2f KMS from the Sun; The planet is also known as %s.%n", planet.getName(), planet.getDistanceFromSun(), planet.getNickname());
        }

    }
}
