package com.Ashizai.online_book_store.Services;
import java.util.List;
import com.Ashizai.online_book_store.model.Author;
import com.Ashizai.online_book_store.model.Book;

public interface AuthorService
{
    //1. Adding the author.
    Author saveAuthor(Author author);
    //2. Deleting the author
    void deleteAuthor(Author author);
    //3. Get author detail by author ID
    Author getAuthorByAuthorID(String authorID);
    // 4. Get author details by author name
    List<Author>findByName(String authorName);
    //4. Get all authors by list
    List<Author>getAllAuthors();
}
