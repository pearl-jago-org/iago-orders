package com.iago.orders.controller;

import com.iago.orders.model.Order;
import com.iago.orders.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    private final OrderRepository orderRepository;

    public OrdersController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // GET /orders → lista todas las orders
    @GetMapping
    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    // POST /orders → crea una order en la BD
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderRepository.save(order);
    }
}
