package com.Ashizai.online_book_store.Services;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.Ashizai.online_book_store.model.OrderDetail;
import com.Ashizai.online_book_store.Repositories.OrderDetailRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Service
public class OrderDetailServiceImpl implements OrderDetailService
{
    private final OrderDetailRepository orderDetailRepository;
    @Autowired
    public OrderDetailServiceImpl(OrderDetailRepository orderDetailRepository)
    {
        this.orderDetailRepository=orderDetailRepository;
    }
    @Override
    public OrderDetail saveBookOrder(OrderDetail orderDetail)
    {
        return orderDetailRepository.save(orderDetail);
    }
    @Override
    public void deleteOrderDetail(OrderDetail orderDetail)
    {
        orderDetailRepository.delete(orderDetail);
    }
    @Override
    public List<OrderDetail>getAllOrderDetail()
    {
        return orderDetailRepository.findAll();
    }
    @Override
    public OrderDetail getOrderDetailById(int i)
    {
        Optional<OrderDetail> orderDetail=orderDetailRepository.findById(i);
        return orderDetail.orElse(null);
    }
}
