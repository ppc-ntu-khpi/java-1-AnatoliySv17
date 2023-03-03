package domain;
public class Customer {
    private int ID;
    private boolean isNew;
    private double total;
public Customer() {
        this.ID = 1;
        this.isNew = true;
        this.total = 1000.0;
    }
public Customer(int ID, boolean isNew, double total) {
        this.ID = ID;
        this.isNew = isNew;
        this.total = total;
    }
public void displayCustomerInfo() {
        System.out.println("Customer ID: " + ID);
        System.out.println("Customer status: " + (isNew ? "New" : "Existing"));
        System.out.println("Total purchases are: " + total);
    }
public void setID(int ID) {
        if (ID > 0) {
            this.ID = ID;
        }
    }
public void setStatus(boolean isNew) {
        this.isNew = isNew;
    }
public void setTotal(double total) {
        if (total > 0) {
            this.total = total;
        }
    }
}
