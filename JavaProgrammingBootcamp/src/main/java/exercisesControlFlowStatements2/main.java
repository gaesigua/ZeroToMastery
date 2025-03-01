package exercisesControlFlowStatements2;

public class main {
    public static void main(String[] args) {

//2. Exercise: Comment on a Student's Grade Using A Switch Statement

        char grade = 'C';
        String comment;

        switch (grade){
            case 'F':
                comment = "Failed!!";
                break;
            case 'E':
                comment = "You have poor grade!! Work harder the next time";
                break;
            case 'D':
                comment = "That's not good!! Work hard the next time!!";
                break;
            case 'C':
                comment = "\"C\" is average!! not bad, but improve next time!!";
                break;
            case 'B':
                comment = "Well Done!! Good Job!! Congratulations!!";
                break;
            case 'A':
                comment = "Oh Wow!!Excellent!! You aced it!! Congratulations!!";
                break;
            default:
                comment = "Invalid Grade!";
        }
        System.out.println("My comment: " + comment);

    }
}
