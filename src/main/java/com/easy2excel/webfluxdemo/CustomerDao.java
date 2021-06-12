package com.easy2excel.webfluxdemo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class CustomerDao {

    List<Customer> findAllCustomer(){
        return IntStream.range(0,50).
                mapToObj(i -> new Customer(i,"customer"+i))
                .collect(Collectors.toList());
    }



}
