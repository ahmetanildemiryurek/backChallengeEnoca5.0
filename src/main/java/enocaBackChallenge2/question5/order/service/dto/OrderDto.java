package enocaBackChallenge2.question5.order.service.dto;

import enocaBackChallenge2.question5.customer.domain.Customer;
import enocaBackChallenge2.question5.customer.service.dto.CustomerDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class OrderDto {
    private Long id;
    private LocalDate date;
    private int totalPrice;
    private Customer customer;
}
