package test;
import domain.Customer;
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer(1, true, 1000.0);
        customer.displayCustomerInfo();
            customer.setID(5);
            customer.setStatus(false);
            customer.setTotal(2000);
        customer.displayCustomerInfo();
    }
}
