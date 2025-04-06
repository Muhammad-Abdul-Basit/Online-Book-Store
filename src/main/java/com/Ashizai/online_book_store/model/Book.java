package com.Ashizai.online_book_store.model;
import java.util.Set;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "book")
public class Book
{
    @Id
    private String ISBN;
    @Column(nullable = false)
    private String Title;
    private int Publication_year;
    private float Price;
    private short Quantity;
    @ManyToMany
    @JoinTable
            (
                    name = "book_author",
                    joinColumns = @JoinColumn(name = "ISBN"),
                    inverseJoinColumns = @JoinColumn(name = "author_id")
            )
    private Set <Author> authors;
    @ManyToMany
    @JoinTable
            (
                    name="book_genre",
                    joinColumns = @JoinColumn(name = "ISBN"),
                    inverseJoinColumns =@JoinColumn(name = "genre_ID")
            )
    private Set <BookGenre> genres;
    @ManyToMany
    @JoinTable
            (
                    name = "book_customer",
                    joinColumns = @JoinColumn(name = "ISBN"),
                    inverseJoinColumns = @JoinColumn(name = "customer_ID")
            )
    private Set <Customer> customers;
}