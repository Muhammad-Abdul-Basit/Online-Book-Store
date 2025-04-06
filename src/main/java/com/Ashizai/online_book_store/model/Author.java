package com.Ashizai.online_book_store.model;
import jakarta.persistence.*;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "author")
public class Author
{
    @Id
    @Column(name = "author_ID")
    private String authorID;
    @Column(name = "Name", nullable = false)
    private String authorName;
    @Column(name = "Biography")
    private String authorBiography;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> authoredBooks;
}