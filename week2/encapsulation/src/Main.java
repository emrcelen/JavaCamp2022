public class Main {
    public static void main(String[] args) {
        /* My blog post:
        https://emrecelen.com.tr/java-encapsulation-nedir/
        */

        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getProductCode());
        // productManager.add(1,"","",2,200);  no no no :)
    }
}
