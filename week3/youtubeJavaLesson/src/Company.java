public class Company extends Customer {
    // field:
    private String companyName;
    private String taxNumber;
    // setter:
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
    // getter:
    public String getCompanyName() {
        return companyName;
    }
    public String getTaxNumber() {
        return taxNumber;
    }
}
