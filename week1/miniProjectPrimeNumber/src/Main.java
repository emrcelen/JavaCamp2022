import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int number = 0;
        boolean isPrime = true;

        if (number == 1){
            System.out.println("The number is not prime.");
            return;
        }
        if (number < 1){
            System.out.println("You entered an invalid value.");
            return;
        }

        for(int i = 2 ; i < number; i++){
            if(number % i == 0)
                isPrime = false;
        }
        if(isPrime)
            System.out.println("The number is prime.");
        else
            System.out.println("The number is not prime.");

         */
        // my solution:
        int value;
        boolean isPrime = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        value = scanner.nextInt();
        if(value < 1)
            System.out.println("You entered an invalid value.");
        else if(value == 1)
            System.out.println("The number is not prime.");
        else{
            for(int i = 2 ; i < value; i++)
                if(value % i == 0)
                    isPrime = false;

            if(isPrime)
                System.out.println("The number is prime.");
            else
                System.out.println("The number is not prime.");
        }

    }

}
