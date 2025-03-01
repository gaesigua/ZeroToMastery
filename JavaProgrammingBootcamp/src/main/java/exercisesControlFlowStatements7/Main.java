//Exercise 7: Determine the Highest and Lowest Grades Using Control Flow Statements

package exercisesControlFlowStatements7;

public class Main {
    public static void main(String[] args) {
//        int[] numbers = {39, 52, 75, 92};
//
////1. HERE WE ARE GOING TO USE A FOR LOOP (MY WAY)
//
//        for (int i = 0; i < numbers.length; i++) {
//            if (i == 0) {
//
//                System.out.println("The Lowest Grade is: " + numbers[0]);
//
//            } else if (i == numbers.length - 1) {
//                System.out.println("The Highest Grade is: " + numbers[numbers.length-1]);
//            }
//        }

//2. HERE WE ARE GOING TO USE FOR EACH LOOP (ZTM WAY)

        int[] grades = {24,48,78,98};

        int highestGrade = grades[0];
        int lowestGrade = grades[0];

        for(int grade: grades){
            if (grade > highestGrade){
                highestGrade = grade;
            }
            if (grade < lowestGrade)
            {
                lowestGrade = grade;
            }
        }
        System.out.println("The Highest Grade: "+ highestGrade);
        System.out.println("The Lowest Grade: " + lowestGrade);





    }
}
