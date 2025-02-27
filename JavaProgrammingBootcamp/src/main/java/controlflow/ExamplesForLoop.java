package controlflow;

public class ExamplesForLoop {
    public static void main(String[] args) {

//        int[] myNumbers = {1,5,4,6,9,2,10,3};
//
//        int numberToSearchandExtract = 3;
//        int anIndexThatWillHelpMeKnowThatTheNumberDoesNotExistInTheArray = -1; //since -1 CANNOT BE A VALID INDEX IN AN ARRAY, IF IT PRINTS OUT -1, I will know that the value does not exist
//
//        for(int i=0; i<myNumbers.length; i++){
//            if(myNumbers[i] == numberToSearchandExtract){
//                anIndexThatWillHelpMeKnowThatTheNumberDoesNotExistInTheArray = i;
//            }
//        }
//        System.out.println(anIndexThatWillHelpMeKnowThatTheNumberDoesNotExistInTheArray);


// LET'S DO ANOTHER FOR LOOP, WITH A FOR LOOP INSIDE

        for (int row=1; row<=10; row++){

            for (int col=1; col<=10; col++){
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
}
