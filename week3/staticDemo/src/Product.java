public class Product {
    // field:
    private int id;
    private String name;
    private double price;

    // constructor:
    public Product (int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // getter:
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
