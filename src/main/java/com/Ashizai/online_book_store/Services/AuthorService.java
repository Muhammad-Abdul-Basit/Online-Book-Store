package com.Ashizai.online_book_store.Services;
import java.util.List;
import com.Ashizai.online_book_store.model.Author;
import com.Ashizai.online_book_store.model.Book;

public interface AuthorService
{
    Author saveAuthor(Author author);
    void deleteAuthor(Author author);
    Author getAuthorByAuthorID(String authorID);
    List<Author>findByName(String authorName);
    List<Author>getAllAuthors();
}
