public class Main {
    public static void main(String[] args) {
        /*
        Youtube video: https://youtu.be/H3QOQRh8cgk?list=PLqG356ExoxZWfcrBP53Njxir4a-OgqRki
         */
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.giveCredit();
    }
}
