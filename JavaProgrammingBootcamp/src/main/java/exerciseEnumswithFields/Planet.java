package exerciseEnumswithFields;

public enum Planet{
    MERCURY ("Mercury", 23.3),
    VENUS("Venus", 25.2),
    EARTH ("Earth", 28),
    MARS ("Mars", 34),
    JUPITER("Jupiter", 49.0009),
    SATURN("Saturn", 70),
    URANUS("Uranus", 100.2938),
    NEPTUNE("Neptune", 125),
    PLUTO("Pluto", 400.2349);


    private String name;
    private double distanceFromSun;

    Planet(String name, double distanceFromSun){
        this.name = name;
        this.distanceFromSun = distanceFromSun;
    }

    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }
}
