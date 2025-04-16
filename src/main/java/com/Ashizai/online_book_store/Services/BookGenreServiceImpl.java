package com.Ashizai.online_book_store.Services;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Ashizai.online_book_store.model.BookGenre;
import com.Ashizai.online_book_store.Repositories.BookGenreRepository;
import java.util.List;
import java.util.Optional;
@Service
public class BookGenreServiceImpl implements BookGenreService
{
    final private BookGenreRepository bookGenreRepository;
    @Autowired
    public BookGenreServiceImpl(BookGenreRepository bookGenreRepository)
    {
        this.bookGenreRepository=bookGenreRepository;
    }
    @Override
    public BookGenre saveBookGenre(BookGenre bookGenre)
    {
        return bookGenreRepository.save(bookGenre);
    }
    @Override
    public void deleteBookGenre(BookGenre bookGenre)
    {
        bookGenreRepository.delete(bookGenre);
    }
    @Override
    public List<BookGenre>getAllBookGenre()
    {
        return bookGenreRepository.findAll();
    }
    @Override
    public BookGenre getBookGenreById(short BookGenreId)
    {
        Optional<BookGenre> bookGenre=bookGenreRepository.findById(BookGenreId);
        return bookGenre.orElse(null);
    }
    @Override
    public List<BookGenre>getBookGenreByName(String bookGenreName)
    {
        return bookGenreRepository.getBookGenreByName(bookGenreName);
    }
}
