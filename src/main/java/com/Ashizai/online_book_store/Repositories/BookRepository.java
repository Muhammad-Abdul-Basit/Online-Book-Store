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
    List<Book>findByAuthorId(String authorId);
    List<Book>findByAuthorName(String Name);
    List<Book>findBooksByGenreID(short Genre_Id);
    List<Book> findBooksByGenreName(String GenreName);
    List<Book> findByTitleAndPublication_year(String Title, int Publication_year);
}
