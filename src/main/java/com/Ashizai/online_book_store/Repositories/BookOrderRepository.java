package com.Ashizai.online_book_store.Repositories;
import com.Ashizai.online_book_store.model.BookOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BookOrderRepository extends JpaRepository <BookOrder, String>
{

}
