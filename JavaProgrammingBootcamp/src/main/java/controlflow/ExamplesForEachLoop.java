package controlflow;

public class ExamplesForEachLoop {
    public static void main(String[] args) {
        //1. for each loop differs from a for loop in a that a for each loop you are not interested in the index of an element
//        String[] names = {"Michael Jordan","Lionel Messi","Kobe Bryant","Gaesigua Tin","George Washington"};
//
//        for (String i:names){     //we could name "i" anything
//
//            System.out.println(i);
//        }
        //2. Let's print/extract numbers from a simple int array using a for each loop; since we don't need an index for where the elements are
        // and then

        int[] myNumbers = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (int oneNumber : myNumbers){
            System.out.println(oneNumber);
            sum += oneNumber;
        }
        System.out.println(sum);
    }
}
