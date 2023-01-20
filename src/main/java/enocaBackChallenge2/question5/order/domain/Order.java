package enocaBackChallenge2.question5.order.domain;

import enocaBackChallenge2.question5.customer.domain.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "DATE",nullable = false, length = 10)
    private LocalDate date;

    @Column(name = "TOTALPRICE",nullable = false,length = 255)
    private int totalPrice;

    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;
}
