package controlflow;

public class ExamplesIf {
    public static void main(String[] args) {
//        int input = 2;
//
//        if (input > 0){
//            System.out.println("2 divided by the input equals: " + (2/input));
//        }
//        int input = 0;
//
//        if(input!=0){
//
//            System.out.println("2 divided by input equals: " + (2/input));
//        }else{
//            System.out.println("Input can not be zero");
//        }

          int hour = 2;

          if(hour >= 0 && hour<12){
              System.out.println("Guten Morgen!!");
          } else if (hour >= 12 && hour < 18) {
              System.out.println("Guten Tag!!");
          }else if(hour>=18 && hour<24) {
              System.out.println("Guten Abend!!");
          }else {
              System.out.println("Ich kenne diese Stunde nicht!!!");
          }
    }
}
