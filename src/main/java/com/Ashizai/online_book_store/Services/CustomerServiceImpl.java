package com.Ashizai.online_book_store.Services;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Ashizai.online_book_store.model.Customer;
import com.Ashizai.online_book_store.Repositories.CustomerRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
public class CustomerServiceImpl implements CustomerService
{
    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository)
    {
        this.customerRepository=customerRepository;
    }
    @Override
    public Customer saveCustomer(Customer customer)
    {
        return customerRepository.save(customer);
    }
    @Override
    public void deleteCustomer(Customer customer)
    {
        customerRepository.delete(customer);
    }
    @Override
    public List<Customer>getAllCustomers()
    {
        return customerRepository.findAll();
    }
    @Override
    public Customer getCustomerById(String customerId)
    {
        Optional<Customer> customer=customerRepository.findById(customerId);
        return customer.orElse(null);
    }
    @Override
    public List <Customer> findCustomerByName(String customerName)
    {
        return customerRepository.findCustomerByName(customerName);
    }
}
