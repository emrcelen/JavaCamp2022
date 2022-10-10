public class CustomerManager {
    private BaseLogger [] loggers;

    public CustomerManager(BaseLogger [] loggers){
        this.loggers = loggers;
    }

    public void add(){
        System.out.println("Müşteri eklendi.");
        for(BaseLogger logger : loggers)
           logger.log("Customer added.");
    }
}
