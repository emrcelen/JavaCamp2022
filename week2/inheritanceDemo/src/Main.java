public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/javada-kalitim-nedir/ &
        https://emrecelen.com.tr/java-polymorphism-nedir/
        */
        CreditUI creditUI = new CreditUI();
        creditUI.calculation(new SoldierCreditManager());
    }
}
