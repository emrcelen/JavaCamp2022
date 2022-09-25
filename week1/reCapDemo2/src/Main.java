public class Main {
    public static void main(String[] args) {
        // array field:
        double [] myList = {1.2,6.3,4.3,5.6};
        double totalValue = 0;
        double maxValue = myList[0];
        for (Double number : myList){
            if(maxValue < number)
                maxValue = number;
            totalValue += number;
            System.out.println(number);
        }

        System.out.println("Total Value: " + totalValue);
        System.out.println("Max Value: " + maxValue);
    }
}
