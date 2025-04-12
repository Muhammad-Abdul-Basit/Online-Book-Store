package com.Ashizai.online_book_store.Services;
import java.util.List;
import com.Ashizai.online_book_store.model.BookGenre;
public interface BookGenreService
{
    BookGenre saveBookGenre(BookGenre bookGenre);
    void deleteBookGenre(BookGenre bookGenre);
    List<BookGenre>getAllBookGenre();
    BookGenre getBookGenreById(short BookGenreId);
    List<BookGenre>getBookGenreByName(String bookGenreName);
}
