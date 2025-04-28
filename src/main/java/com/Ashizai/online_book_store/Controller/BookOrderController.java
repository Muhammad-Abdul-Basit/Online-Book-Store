package com.Ashizai.online_book_store.Controller;
import com.Ashizai.online_book_store.model.BookOrder;
import com.Ashizai.online_book_store.Services.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
@RestController
@RequestMapping("/api/booksOrder")
public class BookOrderController
{
    private final BookOrderService bookOrderService;
    @Autowired
    public BookOrderController(BookOrderService bookOrderService)
    {
        this.bookOrderService=bookOrderService;
    }
    @PostMapping
    public BookOrder saveBookOrder(@RequestBody BookOrder bookOrder)
    {
        return bookOrderService.saveBookOrder(bookOrder);
    }
    @DeleteMapping("/{orderId}")
    public void deleteBookOrderById(@PathVariable String orderId)
    {
        bookOrderService.deleteBookOrderById(orderId);
    }
    @GetMapping("/{orderId}")
    public BookOrder findByOrderID(@PathVariable String orderId)
    {
        return bookOrderService.findByOrderID(orderId);
    }
    @GetMapping
    public List<BookOrder>getAllOrders()
    {
        return bookOrderService.getAllOrders();
    }
    @GetMapping("/orderDate")
    public List<BookOrder>findByOrderDate(@RequestParam LocalDate orderDate)
    {
        return bookOrderService.findByOrderDate(orderDate);
    }
}
