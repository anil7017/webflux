package com.easy2excel.webfluxdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor
public class Customer {
    private long id ;
    private String name ;

    public Customer(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
