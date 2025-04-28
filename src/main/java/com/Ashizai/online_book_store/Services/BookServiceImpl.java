package com.Ashizai.online_book_store.Services;
import com.Ashizai.online_book_store.model.Author;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Ashizai.online_book_store.model.Book;
import com.Ashizai.online_book_store.Repositories.BookRepository;

import java.util.*;

@Service
public class BookServiceImpl implements BookService
{
    private final BookRepository bookRepository;
    @Autowired
    public BookServiceImpl(BookRepository bookRepository)
    {
        this.bookRepository=bookRepository;
    }
    @Override
    public Book saveBook(Book book)
    {
        if (book==null)
        {
            throw new EntityNotFoundException("Book data is missing");
        }
            return bookRepository.save(book);
    }
    @Override
    public void deleteBookbyIsbn(String isbn) {
        if (isbn == null) {
            throw new IllegalArgumentException("ISBN cannot be null.");
        }
        if (!bookRepository.existsById(isbn)) {
            throw new EntityNotFoundException("Book not found with ISBN: " + isbn);
        }
        bookRepository.deleteById(isbn);
    }
    @Override
    public Book getBookByISBN(String Isbn)
    {
        Optional<Book> book=bookRepository.findById(Isbn);
        return book.orElse(null);
    }
    @Override
    public List<Book>findBookByTitle(String title)
    {
        List<Book> books = bookRepository.findBookByTitle(title);
        if (books==null||books.isEmpty())
        {
            throw new RuntimeException("No books found with title: " + title);
        }
        return books;
    }
    @Override
    public List<Book>findBookByPublication_year(int publicationYear)
    {
        List<Book> books= bookRepository.findBookByPublication_year(publicationYear);
        return books!=null && !books.isEmpty() ? books : new ArrayList<>();
    }
    @Override
    public List<Book> getAllBooks()
    {
        List<Book> books= bookRepository.findAll();
        if (books.isEmpty())
        {
            throw new RuntimeException("No books found in Database");
        }
        return books;
    }
    @Override
    public List<Book>findBooksByAuthorId(String author_Id)
    {
        List<Book> books= bookRepository.findBooksByAuthorId(author_Id);
        if (books.isEmpty())
        {
            throw new RuntimeException("There is no books found by AuthorId of " + author_Id+ " in Database");
        }
        return books;
    }
    @Override
    public List<Book>findBookByAuthorName(String authorName)
    {
        List<Book> books= bookRepository.findBookByAuthorName(authorName);
        if (books.isEmpty())
        {
            throw new RuntimeException("There is no books found by author name of " + authorName+ " in Database");
        }
        return books;
    }
    @Override
    public List<Book>findBooksByGenreID(short Genre_Id)
    {
        List<Book> books= bookRepository.findBooksByGenreID(Genre_Id);
        if (books.isEmpty())
        {
            throw new RuntimeException("There is no books found by Genre Id of " + Genre_Id+ " in Database");
        }
        return books;
    }
    @Override
    public List<Book>findBooksByGenreName(String GenreName)
    {
        List<Book> books= bookRepository.findBooksByGenreName(GenreName);
        if (books.isEmpty())
        {
            throw new RuntimeException("There is no books found by Genre Name of " + GenreName+ " in Database");
        }
        return books;
    }
}
