package com.Ashizai.online_book_store.model;
import java.time.LocalDate;
import java.math.BigDecimal;
import jakarta.persistence.*;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "book_order")
public class BookOrder
{
    @Id
    @Column(name = "order_ID")
    private String orderId;
    @Column(name = "Order_date")
    private LocalDate orderDate;
    @Column(name = "Total_price")
    private BigDecimal totalPrice;
    @ManyToOne
    @JoinColumn(name = "customer_ID", nullable = false)
    private Customer customer; // Foreign key from customer table.
    @OneToMany(mappedBy = "bookOrder", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set <OrderDetail> orderDetail;

}
