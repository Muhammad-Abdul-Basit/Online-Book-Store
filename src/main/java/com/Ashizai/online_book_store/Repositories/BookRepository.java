package com.Ashizai.online_book_store.Repositories;
import com.Ashizai.online_book_store.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface BookRepository extends JpaRepository <Book, String>
{
    List<Book>findByTitle(String Title);
    List<Book>findByPublication_year(int Publication_year);
    List<Book> findByTitleAndPublication_year(String Title, int Publication_year);
    List<Book>findByTitleAndQuantity(String Title,short Quantity);
    List<Book>findByQuantity(short Quantity);
    List<Book>findByTitleAndPrice(String Title, float Price);
}
