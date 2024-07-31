package Exercise11;

public class CustomerRepositoryImpl implements CustomerRepository {

    public Customer findCustomerById(String id) {
        // for demonstration purposes, we'll return a dummy customer
        return new Customer(id, "Jadeja");
    }
    
}
