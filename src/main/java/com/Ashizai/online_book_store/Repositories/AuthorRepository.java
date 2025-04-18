package com.Ashizai.online_book_store.Repositories;
import com.Ashizai.online_book_store.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository <Author, String>
{
    List<Author>findByName(String authorName);//Author name
}
