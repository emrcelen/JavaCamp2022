public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/java-polymorphism-nedir/
        */

        BaseLogger [] loggers = {new FileLogger(),new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};
        //for(BaseLogger logger : loggers)
            //logger.log("message is here.");

        CustomerManager customerManager = new CustomerManager(loggers);
        customerManager.add();
    }
}
