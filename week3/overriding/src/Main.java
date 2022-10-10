public class Main {
    public static void main(String[] args) {
       /* My blog post:
        https://emrecelen.com.tr/java-overriding-nedir/
        */

        BaseKrediManager [] krediManager = {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

        for (BaseKrediManager manager : krediManager)
            System.out.println(manager.hesapla(1000));
    }
}
