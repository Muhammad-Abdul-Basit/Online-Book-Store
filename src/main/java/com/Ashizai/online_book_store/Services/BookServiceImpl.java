package com.Ashizai.online_book_store.Services;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Ashizai.online_book_store.model.Book;
import com.Ashizai.online_book_store.Repositories.BookRepository;
import java.util.List;
import java.util.Optional;
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
            return bookRepository.save(book);
    }
    @Override
    public void deleteBook(Book book)
    {
        bookRepository.delete(book);
    }
    @Override
    public Book getBookByISBN(String Isbn)
    {
        Optional<Book> book=bookRepository.findById(Isbn);
        return book.orElse(null);
    }
    @Override
    public List<Book>findBookByTitle(String Title)
    {
        return bookRepository.findBookByTitle(Title);
    }
    @Override
    public List<Book>findBookByPublication_year(int publicationYear)
    {
        return bookRepository.findBookByPublication_year(publicationYear);
    }
    @Override
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }
    @Override
    public List<Book>findBooksByAuthorId(String author_Id)
    {
        return bookRepository.findBooksByAuthorId(author_Id);
    }
    @Override
    public List<Book>findBookByAuthorName(String authorName)
    {
        return bookRepository.findBookByAuthorName(authorName);
    }
    @Override
    public List<Book>findBooksByGenreID(short Genre_Id)
    {
        return bookRepository.findBooksByGenreID(Genre_Id);
    }
    @Override
    public List<Book>findBooksByGenreName(String GenreName)
    {
        return bookRepository.findBooksByGenreName(GenreName);
    }
}
