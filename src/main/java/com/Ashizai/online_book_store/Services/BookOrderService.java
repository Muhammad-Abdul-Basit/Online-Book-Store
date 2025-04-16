package com.Ashizai.online_book_store.Services;
import java.time.LocalDate;
import java.util.List;
import com.Ashizai.online_book_store.model.BookOrder;
public interface BookOrderService
{
    BookOrder saveBookOrder(BookOrder bookOrder);
    void deleteBookOrder(BookOrder bookOrder);
    BookOrder findByOrderID(String orderId);
    List<BookOrder>getAllOrders();
    List<BookOrder>findByOrderDate(LocalDate orderDate);
}
