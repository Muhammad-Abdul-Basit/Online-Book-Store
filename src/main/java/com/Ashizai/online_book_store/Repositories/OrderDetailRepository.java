package com.Ashizai.online_book_store.Repositories;
import com.Ashizai.online_book_store.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderDetailRepository extends JpaRepository <OrderDetail, Integer>
{
}
