public class Main {
    public static void main(String[] args) {
         /* My blog post:
        https://emrecelen.com.tr/javada-metotlar/
        */
        System.out.println(addition(2,3,4,5,6,10));
    }
    public static int addition (int ...numbers){
        int value = 0;
        for(Integer number : numbers)
            value += number;
        return  value;
    }

}
