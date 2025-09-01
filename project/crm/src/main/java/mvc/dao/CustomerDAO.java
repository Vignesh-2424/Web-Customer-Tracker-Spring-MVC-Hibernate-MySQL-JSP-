package mvc.dao;

import java.util.List;

import mvc.entity.Customer;

public interface CustomerDAO {

    public List<Customer> getCustomers();


    void saveCustomer(Customer theCustomer);

    Customer getCustomer(int theId);

    void deleteCustomer(int theId);
}
