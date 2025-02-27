package controlflow;

public class ExamplesSwitch {
    public static void main(String[] args) {
        String extension1 = "pdf";
        String extension2 = "docx";

        switch (extension1){
            case "docx":
                System.out.println("This is a Word Document!!");
                break;
            case "mp3":
                System.out.println("This is a MP3 File!!");
                break;
            case "mp4":
                System.out.println("This is a MP4 File!!");
                break;
            case "pdf":
                System.out.println("This is a Pdf Document!!");
                break;
            default:
                System.out.println("Unknown File Type!!");
        }

        int month = 3;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days!!");
                break;
            case 2:
                System.out.print("This month has 28 or 29 days!");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("This month has 30 days!!");
                break;
        }
    }
}
