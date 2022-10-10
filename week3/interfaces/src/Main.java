public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/java-interface-nedir/
        */

        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
