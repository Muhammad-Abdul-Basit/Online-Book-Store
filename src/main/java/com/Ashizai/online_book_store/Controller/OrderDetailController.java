package com.Ashizai.online_book_store.Controller;
import com.Ashizai.online_book_store.model.BookOrder;
import com.Ashizai.online_book_store.model.OrderDetail;
import com.Ashizai.online_book_store.Services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/orderDetail")
public class OrderDetailController
{
    private final OrderDetailService orderDetailService;
    @Autowired
    public OrderDetailController(OrderDetailService orderDetailService)
    {
        this.orderDetailService=orderDetailService;
    }
    @PostMapping
    public OrderDetail saveOrderDetail(@RequestBody OrderDetail orderDetail)
    {
        return orderDetailService.saveOrderDetail(orderDetail);
    }
    @DeleteMapping("/{orderDetailId}")
    public void deleteOrderDetailById(@PathVariable int orderDetailId)
    {
        orderDetailService.deleteOrderDetailById(orderDetailId);
    }
    @GetMapping
    public List<OrderDetail>getAllOrderDetail()
    {
        return orderDetailService.getAllOrderDetail();
    }
    @GetMapping("/{orderDetailId}")
   public OrderDetail getOrderDetailById(@PathVariable int orderDetailId)
    {
        return orderDetailService.getOrderDetailById(orderDetailId);
    }
}
