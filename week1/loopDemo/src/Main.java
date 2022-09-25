public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/javada-donguler/
        */

        //for:
        for(int i=1; i <= 10; i++)
            if(i % 2 == 0) //even numbers ( i % 2 != 0 --> odd numbers)
            System.out.println(i);
        System.out.println("For loop is finished.");

        //while:
        int j = 1;
        while(j < 10){
            System.out.println(j);
            j++;
        }
        System.out.println("While loop is finished.");

        //do-while:
        int k = 1;
        do{
            System.out.println(k);
            k+=2;
        }while (k < 10);
        System.out.println("Do-While loop is finished.");
    }
}
