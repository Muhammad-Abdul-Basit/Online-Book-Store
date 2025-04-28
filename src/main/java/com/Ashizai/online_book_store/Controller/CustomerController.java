package com.Ashizai.online_book_store.Controller;
import com.Ashizai.online_book_store.model.Customer;
import com.Ashizai.online_book_store.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/customer")
public class CustomerController
{
    private final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService)
    {
        this.customerService=customerService;
    }
    @PostMapping
    public Customer saveCustomer(@RequestBody Customer customer)
    {
        return customerService.saveCustomer(customer);
    }
    @DeleteMapping("/{customerId}")
    public void deleteCustomerById(@PathVariable String customerId)
    {
        customerService.deleteCustomerById(customerId);
    }
    @GetMapping
    public List<Customer>getAllCustomers()
    {
       return customerService.getAllCustomers();
    }
    @GetMapping("/{customerId}")
    public Customer getCustomerById(@PathVariable String customerId)
    {
        return customerService.getCustomerById(customerId);
    }
    @GetMapping("/customerName")
    public List <Customer> findCustomerByName(@RequestParam String customerName)
    {
        return customerService.findCustomerByName(customerName);
    }
}
