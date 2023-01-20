package enocaBackChallenge2.question5.customer.repository;

import enocaBackChallenge2.question5.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerRepository extends JpaRepository<Customer , Long> , JpaSpecificationExecutor<Customer> {
}
