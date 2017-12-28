package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    public Customer customer;
    public Product product;
    public int amount;

    public OrderRequest(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
