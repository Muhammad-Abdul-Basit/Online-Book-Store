package com.Ashizai.online_book_store.Services;
import java.util.List;
import com.Ashizai.online_book_store.model.OrderDetail;
public interface OrderDetailService
{
    OrderDetail saveOrderDetail(OrderDetail orderDetail);
    void deleteOrderDetailById(int orderDetailId);
    List<OrderDetail>getAllOrderDetail();
    OrderDetail getOrderDetailById(int orderDetailId);
}
