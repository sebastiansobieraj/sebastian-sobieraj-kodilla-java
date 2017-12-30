package com.kodilla.good.patterns.challenges;

public class Order {

    public OrderRequest newOrder(Customer customer, Product product, int amount) {

        return new OrderRequest(customer, product, amount);
    }
}
