package com.Ashizai.online_book_store.Controller;
import com.Ashizai.online_book_store.model.Book;
import com.Ashizai.online_book_store.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController
{
    private final BookService bookService;
    @Autowired
    public BookController(BookService bookService)
    {
        this.bookService=bookService;
    }
    @PostMapping
    public Book saveBook(@RequestBody Book book)
    {
        return bookService.saveBook(book);
    }
    @DeleteMapping("/{isbn}")
    public void deleteBookbyIsbn(@PathVariable String isbn)
    {
        bookService.deleteBookbyIsbn(isbn);
    }
    @GetMapping("/isbn/{isbn}")
    public Book getBookByISBN(@PathVariable String isbn)
    {
       return bookService.getBookByISBN(isbn);
    }
    @GetMapping("/title")
    public List<Book> findBookByTitle(@RequestParam String title)
    {
        return bookService.findBookByTitle(title);
    }
    @GetMapping("/year")
    public List<Book>findBookByPublication_year(@RequestParam int publicationYear)
    {
        return bookService.findBookByPublication_year(publicationYear);
    }
    @GetMapping
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }
    @GetMapping("/author/id")
    public List<Book>findBooksByAuthorId(@RequestParam String author_Id)
    {
        return bookService.findBooksByAuthorId(author_Id);
    }
    @GetMapping("/author/name")
    public List<Book>findBookByAuthorName(@RequestParam String authorName)
    {
        return bookService.findBookByAuthorName(authorName);
    }
    @GetMapping("/genre/id")
    public List<Book>findBooksByGenreID(@RequestParam short genreId)
    {
        return bookService.findBooksByGenreID(genreId);
    }
    @GetMapping("/genre/name")
    public List<Book>findBooksByGenreName(@RequestParam String genreName)
    {
        return bookService.findBooksByGenreName(genreName);
    }
}
