public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/java-overloading-nedir/
        */

        FourTransactions fourTransactions = new FourTransactions();
        int value = fourTransactions.plus(3,2);
        System.out.println(value);
        value = fourTransactions.plus(2,3,5);
        System.out.println(value);
    }
}
