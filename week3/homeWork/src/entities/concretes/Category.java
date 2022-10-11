package entities.concretes;

public class Category {
    // field | veriable:
    private int categoryId;
    private String categoryName;
    private String categoryDetail;

    // constructor:
    public Category(){
        // default.
    }
    public Category (int categoryId, String categoryName, String categoryDetail){
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDetail = categoryDetail;
    }

    // getter method:
    public int getCategoryId() {
        return categoryId;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public String getCategoryDetail() {
        return categoryDetail;
    }

    // setter method:
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public void setCategoryDetail(String categoryDetail) {
        this.categoryDetail = categoryDetail;
    }
}
