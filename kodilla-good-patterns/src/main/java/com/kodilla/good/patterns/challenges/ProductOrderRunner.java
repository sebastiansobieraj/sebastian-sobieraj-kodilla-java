package com.kodilla.good.patterns.challenges;


public class ProductOrderRunner {
    public static void main (String args[]){

        WearehouseInformation wearehouseInformation = new WearehouseInformation();
        InformationService informationService = new InformationService();

        Order order = new Order();
        Customer customer = new Customer("Jan", "Kowalski", "jkowalski@gmail.com");
        Product product = new Product("Iphone", 2999.00);
        OrderRequest orderRequest = order.newOrder(customer, product, 2);

        ProductOrderService productOrderService = new ProductOrderService(informationService, wearehouseInformation);
        productOrderService.process(orderRequest);
    }
}
