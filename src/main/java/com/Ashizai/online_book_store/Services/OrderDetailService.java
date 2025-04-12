package com.Ashizai.online_book_store.Services;
import java.util.List;
import com.Ashizai.online_book_store.model.OrderDetail;
public interface OrderDetailService
{
    OrderDetail saveBookOrder(OrderDetail orderDetail);
    void deleteOrderDetail(OrderDetail orderDetail);
    List<OrderDetail>getAllOrderDetail();
    OrderDetail getOrderDetailById(int i);
}
