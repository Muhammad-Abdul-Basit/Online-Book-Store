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
    public OrderDetail saveOrderDetail(OrderDetail orderDetail)
    {
       return orderDetailRepository.save(orderDetail);
    }
   @Override
   public void deleteOrderDetailById(int orderDetailId)
    {
       orderDetailRepository.deleteById(orderDetailId);
    }
    @Override
    public List<OrderDetail>getAllOrderDetail()
    {
        return orderDetailRepository.findAll();
    }
    @Override
    public OrderDetail getOrderDetailById(int orderDetailId)
    {
        Optional<OrderDetail> orderDetail=orderDetailRepository.findById(orderDetailId);
        return orderDetail.orElse(null);
    }
}
