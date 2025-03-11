package exerciseEnumsWithFields2;

public enum Planet {
    MERCURY("Mercury", 29384.388, "The Swift Planet"),
    VENUS("Venus",296384.388 ,"The Morning Star or The Evening Star"),
    EARTH("Earth",349384.388 ,"Terra"),
    MARS("Mars",2329384.388 ,"The Red Planet"),
    JUPITER("Jupiter",29323484.388, "The Gas Giant"),
    SATURN("Saturn",29383424254.388, "The Ringed Planet"),
    URANUS("Uranus",436475729384.388, "The Bull's Eye Planet"),
    NEPTUNE("Neptune",8997929384.388, "The Blue Giant"),
    PLUTO("Pluto",987824229384.388,"The Dwarf Planet");

    private String name;
    private double distanceFromSun;
    private String nickname;

    Planet(String name, double distanceFromSun, String nickname){
        this.name = name;
        this.distanceFromSun = distanceFromSun;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public String getNickname() {
        return nickname;
    }
}
