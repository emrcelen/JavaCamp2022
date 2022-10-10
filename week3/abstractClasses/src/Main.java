public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/java-abstract-class-nedir/
        */
        GameCalculator [] calculators = {new KidsGameCalculator(), new WomanGameCalculator(), new ManGameCalculataor()};
        for (GameCalculator calculator : calculators)
            calculator.hesapla();
    }
}
