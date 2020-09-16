package model;

public class ListCustomer {
    private String id;
    private String CustomerName;

    public ListCustomer() {
    }

    public ListCustomer(String id, String customerName) {
        this.id = id;
        CustomerName = customerName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
}
