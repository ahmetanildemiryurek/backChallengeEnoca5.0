package enocaBackChallenge2.question5.customer.domain;

import enocaBackChallenge2.question5.order.domain.Order;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME" ,nullable = false,length = 50)
    private String name;

    @Column(name = "AGE",nullable = false,length = 3)
    private int age;


    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;
}
