package enumsEnumsWithFieldsandMethods;

public enum DaysOfWeek {
    //1. Here we have our enums with a two set of fields(day, number of day)
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    //2. Here we are creating 2 variables for the two set of fields, to be able to create constructors later on

    private final String fullName;
    private final int nrOfDay;

    //3. Here we are creating a constructor, with parameters for the fields;

    DaysOfWeek(String fullName, int nrOfDay){
        System.out.println("In Constructor Enum: " +fullName);
        this.fullName = fullName;
        this.nrOfDay = nrOfDay;
    }

    //4. Here we are creating a getter method to extract the fullname

    public String getFullName() {
        return fullName;
    }

    //5. Here we are checking whether it is the weekend or not; it is a constructor that will return a boolean true or false

    public boolean isWeekend(){
        return this == SATURDAY || this == SUNDAY;
    }
}
