public class Product {
    // attribute | field:
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String productCode;

    // Constructor:
    public Product(){
        System.out.println("Default Constructor!");
    }
    public Product(int id, String name, String description,double price, int stockAmount){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    // Getter:
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }
    public int getStockAmount() {
        return stockAmount;
    }
    public String getProductCode() {
        return name.substring(0,3)+description.substring(0,4)+id;
    }

    // Setter:
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
