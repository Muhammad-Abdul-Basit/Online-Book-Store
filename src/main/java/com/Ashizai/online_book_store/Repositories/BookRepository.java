package com.Ashizai.online_book_store.Repositories;
import com.Ashizai.online_book_store.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface BookRepository extends JpaRepository <Book, String>
{
    List<Book>findBookByTitle(String Title);;
    List<Book>findBookByPublication_year(int publicationYear);
    List<Book>findBooksByAuthorId(String author_Id);
    List<Book>findBookByAuthorName(String authorName);
    List<Book>findBooksByGenreID(short Genre_Id);
    List<Book>findBooksByGenreName(String GenreName);
    List<Book> findByTitleAndPublication_year(String Title, int Publication_year);
}
