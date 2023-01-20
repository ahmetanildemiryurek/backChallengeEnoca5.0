package enocaBackChallenge2.question5.customer.service.impl;

import enocaBackChallenge2.question5.customer.domain.Customer;
import enocaBackChallenge2.question5.customer.repository.CustomerRepository;
import enocaBackChallenge2.question5.customer.service.CustomerService;
import enocaBackChallenge2.question5.customer.service.dto.CustomerDto;
import enocaBackChallenge2.question5.customer.service.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository,
                               CustomerMapper customerMapper){
        this.customerMapper=customerMapper;
        this.customerRepository=customerRepository;
    }
    @Override
    public List<CustomerDto> getCustomers() {
        List<Customer> customerList = this.customerRepository.findAll();
        return this.customerMapper.toCustomerDto(customerList);
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        Customer customer= this.customerMapper.toCustomer(customerDto);
        return this.customerMapper.toCustomerDto(this.customerRepository.save(customer));
    }

    @Override
    public Customer insertCustomer(CustomerDto customerDto) {
        Customer customer = this.customerMapper.toCustomer(customerDto);
        return this.customerRepository.save(customer);
    }

    @Override
    public CustomerDto getCustomer(Long id) {
        Optional<Customer> customer = this.customerRepository.findById(id);

        return this.customerMapper.toCustomerDto(customer.get());
    }

    @Override
    public void removeCustomer(Long id){
        this.customerRepository.deleteById(id);
    }
}

