package com.Ashizai.online_book_store.model;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @Column(name = "customer_ID")
    private String customerId;
    @Column(name = "Name",nullable = false)
    private String customerName;
    @Column(name = "Email_address")
    private String customerEmailAddress;
    @Column(name = "Shipping_address")
    private String shippingAddress;
    @ManyToMany(mappedBy = "customers")
    private Set <Book> customerBooks;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set <BookOrder> bookOrders;
}
