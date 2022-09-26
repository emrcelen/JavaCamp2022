public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/javada-metotlar/
        */
        String message = "The weather is very nice today.";
        String newMessage = message.substring(0,3);
        System.out.println(newMessage);
        System.out.println(giveCities());
        int number = addition(5,7);
        System.out.println(number);
    }
    // Methods:
    public static void add(){
        System.out.println("Data added.");
    }
    public static void delete(){
        System.out.println("Data deleted.");
    }
    public static void update(){
        System.out.println("Data updated.");
    }
    public static int addition(int a, int b){
        return  (a+b);
    }
    public static String giveCities(){
        return "Ankara";
    }
}
