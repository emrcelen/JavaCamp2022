public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/javada-diziler/
        */

        // array field:
        String [] students = new String[4];
        students[0] = "Engin";
        students[1] = "Derin";
        students[2] = "Salih";
        students[3] = "Ahmet";
        // foreach loop:
        for(String student : students)
            System.out.println(student);
    }
}
