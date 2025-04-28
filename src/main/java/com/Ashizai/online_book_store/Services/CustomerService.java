package com.Ashizai.online_book_store.Services;
import java.util.List;
import com.Ashizai.online_book_store.model.Customer;
public interface CustomerService
{
    Customer saveCustomer(Customer customer);
    void deleteCustomerById(String customerId);
    List<Customer>getAllCustomers();
    Customer getCustomerById(String customerId);
    List <Customer> findCustomerByName(String customerName);
}
