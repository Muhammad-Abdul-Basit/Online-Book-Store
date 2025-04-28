package com.Ashizai.online_book_store.Controller;
import com.Ashizai.online_book_store.model.Author;
import com.Ashizai.online_book_store.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/authors")
public class AuthorController
{
    private final AuthorService authorService;
    @Autowired
    public AuthorController(AuthorService authorService)
    {
        this.authorService=authorService;
    }
    @PostMapping
    public Author saveAuthor(@RequestBody Author author)
    {
        return authorService.saveAuthor(author);
    }
    @DeleteMapping("/{authorId}")
    public void deleteAuthorById(@PathVariable String authorId)
    {
        authorService.deleteAuthorById(authorId);
    }
    @GetMapping("/authored/{authorId}")
    public Author getAuthorByAuthorID(@PathVariable String authorId)
    {
        return authorService.getAuthorByAuthorID(authorId);
    }
    @GetMapping("/name")
    public List<Author>findByName(@RequestParam String authorName)
    {
        return authorService.findByName(authorName);
    }
    @GetMapping
    public List<Author>getAllAuthors()
    {
        return authorService.getAllAuthors();
    }
}
