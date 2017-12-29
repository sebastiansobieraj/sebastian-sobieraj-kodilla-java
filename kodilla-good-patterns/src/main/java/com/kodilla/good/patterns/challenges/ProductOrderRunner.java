package com.kodilla.good.patterns.challenges;


public class ProductOrderRunner {
    public static void main (String args[]){

        WearehouseInformation wearehouseInformation = new WearehouseInformation();
        InformationService informationService = new InformationService();

        Order order = new Order();
        OrderRequest orderRequest = order.newOrder();

        ProductOrderService productOrderService = new ProductOrderService(informationService, wearehouseInformation);
        productOrderService.process(orderRequest);
    }
}
