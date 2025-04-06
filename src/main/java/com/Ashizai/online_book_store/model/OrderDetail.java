package com.Ashizai.online_book_store.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "order_detail")
public class OrderDetail
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private int orderDetailId;
    @Column(name = "total_books")
    private short totalBooks;
    @Column(name = "quantity_per_book")
    private int quantityPerBook;
    @Column(name = "Price_at_time_of_purchase")
    private BigDecimal priceAtPurchase;
    @ManyToOne
    @JoinColumn(name = "order_ID", nullable = false)
    private BookOrder bookOrder;
}
