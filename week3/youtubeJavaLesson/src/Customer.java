public class Customer {
    // field:
    private int id;
    private String city;
    // constructor:
    public Customer(){
        System.out.println("Müşteri nesnesi başlatıldı.");
    }
    // setter:
    public void setId(int id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }
    // getter:
    public int getId() {
        return id;
    }
    public String getCity() {
        return city;
    }
}
