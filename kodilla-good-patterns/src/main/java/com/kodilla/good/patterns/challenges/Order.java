package com.kodilla.good.patterns.challenges;

public class Order {

    public OrderRequest newOrder(){
        Customer customer = new Customer("Jan", "Kowalski", "jkowalski@gmail.com");
        Product product = new Product("Iphone", 2999.00);

        return new OrderRequest(customer, product, 1);
    }
}
