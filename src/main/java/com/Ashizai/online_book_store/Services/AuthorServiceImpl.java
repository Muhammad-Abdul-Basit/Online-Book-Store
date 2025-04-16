package com.Ashizai.online_book_store.Services;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Ashizai.online_book_store.model.Author;
import com.Ashizai.online_book_store.Repositories.AuthorRepository;
import java.util.List;
import java.util.Optional;
@Service
public class AuthorServiceImpl implements AuthorService
{
    private final AuthorRepository authorRepository;
    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository)
    {
        this.authorRepository=authorRepository;
    }
    @Override
    public Author saveAuthor(Author author)
    {
        return authorRepository.save(author);
    }
    @Override
   public void deleteAuthor(Author author)
    {
        authorRepository.delete(author);
    }
    @Override
    public Author getAuthorByAuthorID(String authorID)
    {
        Optional<Author> author=authorRepository.findById(authorID);
        return author.orElse(null);
    }
    @Override
    public List<Author>findByName(String authorName)
    {
        return authorRepository.findByName(authorName);
    }
    @Override
    public List<Author>getAllAuthors()
    {
        return authorRepository.findAll();
    }
}
