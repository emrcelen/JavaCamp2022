public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/javada-kontrol-yapilari/
        */

        // fields:
        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Congratulations.\nYou passed the study with an excellent degree.");
                break;
            case 'B':
                System.out.println("Congratulations.\nYou passed the study with a good degree.");
                break;
            case 'C':
                System.out.println("Congratulations.\nYou passed the study with an intermediate degree.");
                break;
            case 'D':
                System.out.println("Congratulations.\nYou passed the study with a bad degree.");
                break;
            case 'F':
                System.out.println("Sorry!\nYou failed the lesson.");
                break;
            default:
                System.out.println("An invalid value.");
        }
    }
}
