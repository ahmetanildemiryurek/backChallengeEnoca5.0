package enocaBackChallenge2.question5.order.service.mapper;

import enocaBackChallenge2.question5.order.domain.Order;
import enocaBackChallenge2.question5.order.service.dto.OrderDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderDto toOrderDto(Order order);

    List<OrderDto> toOrderDto(List<Order> order);

    Order toOrder(OrderDto orderDto);
}
