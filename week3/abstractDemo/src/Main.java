public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/java-abstract-class-nedir/
        */

        CustomerManager customerManager = new CustomerManager(new MysqlDatabaseManager());
        customerManager.getCustomers();
        

    }
}
