public class Main {
    public static void main(String[] args) {
        // fields:
        int n1 = 20, n2 = 25, n3 = 2;
        int maxN = n1;

        if(maxN < n2)
            maxN = n2;
        if(maxN < n3)
            maxN = n3;

        System.out.println("Maximum value: " + maxN);
    }
}
