import java.util.HashMap;
import java.util.Map;

public class CustomerManager {
    private Map<String, Customer> customers = new HashMap<>();

    public void addCustomer(String customerId, String name) {
        customers.put(customerId, new Customer(customerId, name));
    }

    public void removeCustomer(String customerId) {
        customers.remove(customerId);
    }

    public Customer getCustomerDetails(String customerId) {
        return customers.get(customerId);
    }

    public void listAllCustomers() {
        for (Customer customer : customers.values()) {
            System.out.println("Customer ID: " + customer.getCustomerId() + ", Name: " + customer.getName());
        }
    }
}
