public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/javada-kalitim-nedir/
        */

        Customer customer = new Customer();
        Employee employee = new Employee();

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        employeeManager.BestEmployee();
    }
}
