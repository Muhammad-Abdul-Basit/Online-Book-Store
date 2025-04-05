package com.Ashizai.online_book_store.model;
import jakarta.persistence.*;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.JpaRepository;
@Getter
@Setter
@Entity
@Table(name = "genre")
public class BookGenre
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="genre_ID")
    private short genreId;
    @Column(name = "genre_name", nullable = false)
    private String genreName;
    @ManyToMany(mappedBy = "genres")
    private Set <Book> books;
}
