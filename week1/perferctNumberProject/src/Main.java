public class Main {
    public static void main(String[] args) {
        // 6 --> 1 + 2 + 3 = 6
        // 28 --> 1 + 2 + 4 + 7 + 14 = 28

        int number = 5;
        int isPerfect = 0;
        for (int i = 1; i < number; i++){
            if(number % i == 0)
                isPerfect += i;
        }
        if(isPerfect != number)
            System.out.println("This is not a perfect number.");
        else
            System.out.println("This is a perfect number.");
    }
}
