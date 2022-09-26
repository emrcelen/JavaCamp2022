public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/java-constructor-nedir/
        */
        // Product defaultProduct = new Product(); --> default constructor.
        Product product = new Product(1,"Laptop","Asus Laptop",5000,3);
        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getProductCode());
    }
}
