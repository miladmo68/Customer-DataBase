package com.milad.learning.SpringBoot.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService =  customerService;
    }

    @GetMapping
    List<Customer> greeting() {return customerService.getCustomers();}

    @PostMapping
    void addCustomer(@RequestBody CustomerDto customerDto) {
        customerService.addCustomer(customerDto);
    }
    @PutMapping(path = "{customer_id}")
    void editCustomer(@PathVariable("customer_id") Long customerId,
                      @RequestBody CustomerDto customerDto) {
    customerService.editCustomer(customerId, customerDto);
    }

    @DeleteMapping(path = "{customer_id}")
    void deleteCustomer(@PathVariable("customer_id") Long customerId) {
        customerService.deleteCustomer(customerId);
    }
}
