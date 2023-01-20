package enocaBackChallenge2.question5.order.repository;

import enocaBackChallenge2.question5.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OrderRepository extends JpaRepository<Order , Long> , JpaSpecificationExecutor<Order> {
}
