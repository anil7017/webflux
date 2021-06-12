package com.easy2excel.webfluxdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerDao customerDao;

    @GetMapping
    public List<Customer> findAllCustomer(){
        return customerDao.findAllCustomer();
    }

    @GetMapping("/stream")
    public Flux<Customer> findAllCustomerStream(){
        return customerDao.findAllCustomer();
    }
}
