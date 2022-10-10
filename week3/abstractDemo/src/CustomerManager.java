public class CustomerManager {
    // field:
    private  BaseDatabaseManager databaseManager;
    // constructor:
    public CustomerManager (BaseDatabaseManager databaseManager){
        this.databaseManager = databaseManager;
    }
    // method:
    public void getCustomers (){
        databaseManager.getData();
    }
}
