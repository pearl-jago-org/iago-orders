package com.iago.orders.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private UUID id;

    private UUID userId;

    private String product;

    private Double amount;

    public Order() {}

    public Order(UUID userId, String product, Double amount) {
        this.userId = userId;
        this.product = product;
        this.amount = amount;
    }

    public UUID getId() {
        return id;
    }

    public UUID getUserId() {
        return userId;
    }

    public String getProduct() {
        return product;
    }

    public Double getAmount() {
        return amount;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
