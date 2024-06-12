import java.util.List;

public class Main {
    public static void main(String[] args) {
        AccountTypes accountTypes = new AccountTypes();

        accountTypes.addCustomer("Melih KALKAN", "1234567890");
        accountTypes.addCustomer("Asiye Özcan", "0987654321");

        accountTypes.removeCustomer("Asiye Özcan", "0987654321");

        Customer customer = accountTypes.getCustomerDetails("Melih KALKAN");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Customer Account Number: " + customer.getAccountNumber());

        List<Customer> customers = accountTypes.listAllCustomers();
        for (Customer c : customers) {
            System.out.println("Customer Name: " + c.getName());
            System.out.println("Customer Account Number: " + c.getAccountNumber());
        }
    }
}