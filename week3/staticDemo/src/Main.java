public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"Mause",10);
        Product emptyProduct = new Product(2,"",500);
        ProductManager manager = new ProductManager();
        manager.add(product);
        manager.add(emptyProduct);

        DatabaseHelper.Connection.createConnection();
    }
}
