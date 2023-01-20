package enocaBackChallenge2.question5.customer.service.mapper;

import enocaBackChallenge2.question5.customer.domain.Customer;
import enocaBackChallenge2.question5.customer.service.dto.CustomerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper(componentModel = "spring")
@Component
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDto toCustomerDto(Customer customer);

    List<CustomerDto> toCustomerDto(List<Customer> customer);

    Customer toCustomer(CustomerDto customerDto);
}
