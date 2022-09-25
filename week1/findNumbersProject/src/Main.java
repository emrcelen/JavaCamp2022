public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 7, 9, 0};
        int findNumber = 5;
        int index = 0;
        boolean check = false;

        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == findNumber) {
                check = true;
                index = i;
                break;
            }

        if (check)
            System.out.println("The value you are looking for exists in the array. (" + index + "th index)");
        else
            System.out.println("The value you are looking for does not exist in the array.");
    }
}
