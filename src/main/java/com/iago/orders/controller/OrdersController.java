package com.iago.orders.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrdersController {

    @GetMapping("/orders")
    public String orders() {
        return "iago-orders v1.0.0";
    }
}

