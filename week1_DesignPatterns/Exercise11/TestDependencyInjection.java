package Exercise11;

public class TestDependencyInjection {
    public static void main(String[] args) {
        // creat e repository instance
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService customerService = new CustomerService(customerRepository);

        // use the service to find a customer
        Customer customer = customerService.getCustomerById("1");
        System.out.println(customer);
    }
}
