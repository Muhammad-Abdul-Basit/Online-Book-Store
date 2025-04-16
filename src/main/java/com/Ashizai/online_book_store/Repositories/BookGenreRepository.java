package com.Ashizai.online_book_store.Repositories;
import com.Ashizai.online_book_store.model.BookGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookGenreRepository extends JpaRepository <BookGenre, Short>
{
    List<BookGenre>getBookGenreByName(String bookGenreName);
}
