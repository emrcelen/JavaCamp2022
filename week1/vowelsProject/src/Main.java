public class Main {
    public static void main(String[] args) {
        char character = 'I';
        switch (character){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Back vowel.");
                break;
            default:
                System.out.println("Front vowel.");
        }
    }
}
