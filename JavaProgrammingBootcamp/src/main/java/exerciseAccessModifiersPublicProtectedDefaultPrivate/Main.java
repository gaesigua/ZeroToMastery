package exerciseAccessModifiersPublicProtectedDefaultPrivate;

public class Main{
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "Tin Tin";
        String userName = person.name;

        person.age = 57;
        int userAge = person.age;

        person.address = "KK 1 ST";
        String userAddress = person.address;

        //person.ssn = 9839429f; //Cannot access a private variable

        System.out.println("1. Username: " + userName);
        System.out.println("2. Age: " + userAge);
        System.out.println("3. Address: " + userAddress);
    }
}
