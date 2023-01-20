package enocaBackChallenge2.question5.order.service.impl;

import enocaBackChallenge2.question5.order.domain.Order;
import enocaBackChallenge2.question5.order.repository.OrderRepository;
import enocaBackChallenge2.question5.order.service.OrderService;
import enocaBackChallenge2.question5.order.service.dto.OrderDto;
import enocaBackChallenge2.question5.order.service.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private OrderMapper orderMapper;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository,
                            OrderMapper orderMapper){
        this.orderRepository=orderRepository;
        this.orderMapper=orderMapper;
    }
    @Override
    public List<OrderDto> getOrders() {
        List<Order> orderList = this.orderRepository.findAll();
        return this.orderMapper.toOrderDto(orderList);
    }

    @Override
    public OrderDto updateOrder(OrderDto orderDto) {
        Order order = this.orderMapper.toOrder(orderDto);
        return this.orderMapper.toOrderDto(this.orderRepository.save(order));
    }

    @Override
    public OrderDto insertOrder(OrderDto orderDto) {
        Order order = this.orderMapper.toOrder(orderDto);
        return this.orderMapper.toOrderDto(this.orderRepository.save(order));
    }

    @Override
    public OrderDto getOrderDto(Long id) {
        Optional<Order> order = this.orderRepository.findById(id);

        return this.orderMapper.toOrderDto(order.get());
    }

    @Override
    public Order getOrder(Long id) {
        Optional<Order> order = this.orderRepository.findById(id);

        return order.get();
    }

    @Override
    public void removeOrder(Long id){
        this.orderRepository.deleteById(id);
    }

}
