package com.Ashizai.online_book_store.Controller;
import com.Ashizai.online_book_store.model.BookGenre;
import com.Ashizai.online_book_store.Services.BookGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/bookGenre")
public class BookGenreController
{
    private final BookGenreService bookGenreService;
    @Autowired
    public BookGenreController(BookGenreService bookGenreService)
    {
        this.bookGenreService=bookGenreService;
    }
    @PostMapping
    public BookGenre saveBookGenre(@RequestBody BookGenre bookGenre)
    {
        return bookGenreService.saveBookGenre(bookGenre);
    }
    @DeleteMapping("/{BookGenreId}")
    public void deleteBookGenreById(@PathVariable short BookGenreId)
    {
        bookGenreService.deleteBookGenreById(BookGenreId);
    }
    @GetMapping
    public List<BookGenre>getAllBookGenre()
    {
        return bookGenreService.getAllBookGenre();
    }
    @GetMapping("/getBook/{BookGenreId}")
    public BookGenre getBookGenreById(@PathVariable short BookGenreId)
    {
        return bookGenreService.getBookGenreById(BookGenreId);
    }
    @GetMapping("/bookGenreName")
    public List<BookGenre>getBookGenreByName(@RequestParam String bookGenreName)
    {
        return bookGenreService.getBookGenreByName(bookGenreName);
    }
}
