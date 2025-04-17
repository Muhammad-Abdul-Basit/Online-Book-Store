package com.Ashizai.online_book_store.Services;
import com.Ashizai.online_book_store.model.Author;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Ashizai.online_book_store.model.Book;
import com.Ashizai.online_book_store.Repositories.BookRepository;

import java.util.*;

@Service
public class BookServiceImpl implements BookService
{
    private final BookRepository bookRepository;
    Scanner input=new Scanner(System.in);
    @Autowired
    public BookServiceImpl(BookRepository bookRepository)
    {
        this.bookRepository=bookRepository;
    }
    @Override
    public Book saveBook(Book book)
    {
        String bookIsbn=null;
        while (true)
        {
            try
            {
                System.out.println("Enter book ISBN number: ");
                bookIsbn=input.nextLine();
                if(bookIsbn==null || bookIsbn.trim().isEmpty())
                {
                    throw new IllegalArgumentException("Book ISBN can't be empty");
                }
                break;
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("⚠️ Error: " + e.getMessage());
            }
        }
        book.setISBN(bookIsbn);
        String bookName;
        do
        {
            try
            {
                System.out.println("Enter book Name: ");
                bookName=input.nextLine();
                if (bookName==null || bookName.trim().isEmpty())
                {
                    throw new IllegalArgumentException("Book name can not be empty");
                }
                break;
            }
            catch (IllegalArgumentException e)
            {
                System.out.println("⚠️ Error: " + e.getMessage());
            }
        }while (true);
        book.setTitle(bookName);
        Set<Author> authors=new HashSet<>();
        while (true)
        {
            System.out.println("Enter book author Name (or 'done' to finish): ");
            String bookAuthor=input.next();
            if(bookAuthor.equalsIgnoreCase("done")) break;
            Author author;
            author = new Author();
            author.setAuthorName(bookAuthor);
            authors.add(author);
        }
        book.setAuthors(authors);
        System.out.println("Enter book publication year: ");
        int bookPublicationYear=input.nextInt();
        book.setPublication_year(bookPublicationYear);
        System.out.println("Enter book price : ");
        float bookPrice=input.nextFloat();
        book.setPrice(bookPrice);
        System.out.println("Enter book quantity : ");
        short bookQuantity=input.nextShort();
        book.setQuantity(bookQuantity);
            return bookRepository.save(book);
    }
    @Override
    public void deleteBook(Book book)
    {
        try
        {
            if (book==null)
        {
            throw new IllegalArgumentException("Book can't be null");
        }
            else if (!bookRepository.existsById(book.getISBN()))
            {
                throw new EntityNotFoundException("Book not found");
            }
            bookRepository.delete(book);
        }
        catch (EntityNotFoundException e)
        {
            System.out.println("⚠️ Error: " + e.getMessage());
        }
        catch (IllegalArgumentException exception)
        {
            System.out.println("⚠️ Error: " + exception.getMessage());
        }
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
