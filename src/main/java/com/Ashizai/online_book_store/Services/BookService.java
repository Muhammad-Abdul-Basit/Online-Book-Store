package com.Ashizai.online_book_store.Services;
import java.util.List;
import com.Ashizai.online_book_store.model.Book;
public interface BookService
{
    Book saveBook(Book book);
    void deleteBook(Book book);
    Book getBookByISBN(String Isbn);
    List<Book>findBookByTitle(String Title);
    List<Book>findBookByPublication_year(int publicationYear);
    List<Book> getAllBooks();
    List<Book>findBooksByAuthorId(String author_Id);
    List<Book>findBookByAuthorName(String authorName);
    List<Book>findBooksByGenreID(short Genre_Id);
    List<Book>findBooksByGenreName(String GenreName);
}
