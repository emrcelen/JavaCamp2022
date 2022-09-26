public class Product {
    // attribute | field:
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String productCode;

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
