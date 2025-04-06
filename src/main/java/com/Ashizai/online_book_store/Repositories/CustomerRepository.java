package com.Ashizai.online_book_store.Repositories;
import com.Ashizai.online_book_store.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository <Customer, String>
{
    List<Customer>findByCustomerName (String customerName);
}
