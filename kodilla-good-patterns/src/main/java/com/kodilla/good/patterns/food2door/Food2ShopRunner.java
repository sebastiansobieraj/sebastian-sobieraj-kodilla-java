package com.kodilla.good.patterns.food2door;

public class Food2ShopRunner {
    public static void main (String args []){
        FoodOrderRetriever foodOrderRetriever = new FoodOrderRetriever();
        FoodOrder foodOrder = foodOrderRetriever.retrieve();
        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor(new OrderConfirmation(),
                new SupplierFoodOrderService());

        foodOrderProcessor.process(foodOrder);
    }
}
