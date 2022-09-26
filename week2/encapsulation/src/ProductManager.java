public class ProductManager {
    public void add (Product product){
        System.out.println("Product added - " + product.getName());
    }
    public  void add (int id, String name, String description,int stockAmount, double price){
        System.out.println("Product added - " + name);
    }
}
