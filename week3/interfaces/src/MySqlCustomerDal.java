public class MySqlCustomerDal implements  ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("Mysql veritabanına eklendi.");
    }
}
