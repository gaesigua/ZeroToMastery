package controlflow;

public class ExamplesWhile {
    public static void main(String[] args) {
        boolean notFound = true;

//        while (notFound){
//            int randomNumber = (int)(Math.random()*11);
//            System.out.println("The generated random number: " + randomNumber);
//
//            if (randomNumber == 10){
//                notFound = false;
//            }
//        }
        int i = 0;

        while (i < 50){
            int randomNumber = (int)(Math.pow(i,2));
            System.out.println("Random Number: " + randomNumber);
            i++;
        }
    }
}
