package com.kodilla.good.patterns.food2door;

public class Food2ShopRunner {
    public static void main(String args[]) {
        FoodOrderRetriever foodOrderRetriever = new FoodOrderRetriever();

        Supplier glutenFreeShop = new GlutenFreeShop(12.99, 0.1);
        FoodOrder glutenFreeShopOrder = new FoodOrder(glutenFreeShop, "Gluten free rice", 25);

        FoodOrder foodOrder = foodOrderRetriever.retrieve(glutenFreeShop, glutenFreeShopOrder);

        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor(new OrderConfirmation(),
                new SupplierFoodOrderService());

        foodOrderProcessor.process(foodOrder);
    }
}
