package com.milad.learning.SpringBoot.customer;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {


    private final CustomerRepository customerRepository;
    public final List<Customer> customers = new ArrayList<>(
            List.of(
                    new Customer(1L, "Milad", "milad@gmail.com", LocalDate.of(1989, Month.APRIL, 20), 36),
                    new Customer(2L, "Par", "Par@gmail.com", LocalDate.of(1990, Month.DECEMBER, 5), 34)
            )
    );

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomers() {
        return this.customerRepository.findAll();
    }

    @Transactional
    public void addCustomer(CustomerDto customerDto) {
        Customer customer = new Customer(
                customerDto.name(),
                customerDto.email(),
                customerDto.dob()
        );
       this.customerRepository.save(customer);
    }

    public Customer getCustomerByEmail(String email) {
        return this.customerRepository.findByEmail(email)
                .orElseThrow(
                        () -> new RuntimeException("customer with email " + email + " not found")
                );
    }

    @Transactional
    public void editCustomer(Long customerId, CustomerDto customerDto) {
        Customer oldCustomer = customerRepository.findById(customerId)
                .orElseThrow(
                        () -> new RuntimeException("customer with id " + customerId + " not found")
                );

        oldCustomer.setName(customerDto.name());
        oldCustomer.setEmail(customerDto.email());
        oldCustomer.setDob(customerDto.dob());
        this.customerRepository.save(oldCustomer);
    }

    @Transactional
    public void deleteCustomer(Long customerId) {

        customerRepository.deleteById(customerId);
    }
}
