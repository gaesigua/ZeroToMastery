package enumsBasicEnums;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.SATURDAY;
        DaysOfWeek tomorrow = DaysOfWeek.SUNDAY;

        if(today == tomorrow) {
            System.out.println("The Same Day!!");
        }else {
            System.out.println("Not The Same Day!!");
        }

        //Enums have Built-in Methods
        //1. toString
        //2. ordinal()
        //3. values()

        //1.
        System.out.println("My Enum toString: "+ today.toString());

        //2.
        System.out.println("My Enum ordinal"+ today.ordinal());

        //3.
        System.out.println("My Enum values"+ Arrays.toString(DaysOfWeek.values()));
    }
}
