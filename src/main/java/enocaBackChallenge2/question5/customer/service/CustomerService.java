package enocaBackChallenge2.question5.customer.service;

import enocaBackChallenge2.question5.customer.domain.Customer;
import enocaBackChallenge2.question5.customer.service.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> getCustomers();

    CustomerDto updateCustomer(CustomerDto carDTO);

    Customer insertCustomer(CustomerDto carDTO);

    CustomerDto getCustomer(Long id);

    void removeCustomer(Long id);
}
