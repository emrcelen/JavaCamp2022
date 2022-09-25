public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/javada-string-kullanimi/
        */


        String message = "The weather is very nice today.";
        System.out.println(message);
        //part 1:
        System.out.println("Message Length: " + message.length());
        System.out.println("5th: " + message.charAt(4));
        System.out.println(message.concat(" Nice!"));
        System.out.println(message.startsWith("T"));
        System.out.println(message.endsWith("."));
        char [] chars = new char[5];
        message.getChars(0,5,chars,0);
        System.out.println(chars);
        System.out.println(message.indexOf('i'));
        System.out.println(message.lastIndexOf('i'));
        //part 2:
        System.out.println(message.replace('i','ı'));
        System.out.println(message.substring(4));
        for(String word : message.split(" "))
            System.out.println(word);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
