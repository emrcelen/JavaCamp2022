public class Main {
    public static void main(String[] args) {
        //220 - 284
        int v1 = 220;
        int v2 = 284;
        int t1 = 0, t2 = 0;

        for (int i = 1; i < v1; i++)
            if (v1 % i == 0)
                t1 += i;

        for (int i = 1; i < v2; i++)
            if (v2 % i == 0)
                t2 += i;

        if (v1 == t2 && v2 == t1)
            System.out.println("These two numbers are friends.");
        else
            System.out.println("These two numbers are not friends.");
    }
}
