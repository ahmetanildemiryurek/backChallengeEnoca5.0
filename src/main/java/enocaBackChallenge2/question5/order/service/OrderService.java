package enocaBackChallenge2.question5.order.service;

import enocaBackChallenge2.question5.order.domain.Order;
import enocaBackChallenge2.question5.order.service.dto.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> getOrders();

    OrderDto updateOrder(OrderDto orderDto);

    OrderDto insertOrder(OrderDto orderDto);

    OrderDto getOrderDto(Long id);

    Order getOrder(Long id);

    void removeOrder(Long id);
}
