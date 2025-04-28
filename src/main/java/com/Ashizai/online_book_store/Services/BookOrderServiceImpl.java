package com.Ashizai.online_book_store.Services;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Ashizai.online_book_store.model.BookOrder;
import com.Ashizai.online_book_store.Repositories.BookOrderRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
public class BookOrderServiceImpl implements BookOrderService
{
    private final BookOrderRepository bookOrderRepository;
    @Autowired
    public BookOrderServiceImpl(BookOrderRepository bookOrderRepository)
    {
        this.bookOrderRepository=bookOrderRepository;
    }
    @Override
    public BookOrder saveBookOrder(BookOrder bookOrder)
    {
        return bookOrderRepository.save(bookOrder);
    }
    @Override
    public void deleteBookOrderById(String orderId)
    {
        bookOrderRepository.deleteById(orderId);
    }
    @Override
    public BookOrder findByOrderID(String orderId)
    {
        Optional<BookOrder> bookOrder=bookOrderRepository.findById(orderId);
        return bookOrder.orElse(null);
    }
    @Override
    public List<BookOrder>getAllOrders()
    {
        return bookOrderRepository.findAll();
    }
    @Override
    public List<BookOrder>findByOrderDate(LocalDate orderDate)
    {
       return bookOrderRepository.findByOrderDate(orderDate);
    }
}
