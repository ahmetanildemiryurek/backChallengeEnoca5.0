package enocaBackChallenge2.question5.customer.service.dto;

import enocaBackChallenge2.question5.order.domain.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class CustomerDto {
    private Long id;
    private String name;
    private int age;
    private Order order;
}
