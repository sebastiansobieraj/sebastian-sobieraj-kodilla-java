package com.kodilla.good.patterns.food2door;

public class FoodOrderRetriever {

    public FoodOrder retrieve() {

        Supplier glutenFreeShop = new GlutenFreeShop(12.99, 0.1);
        FoodOrder glutenFreeShopOrder = new FoodOrder(glutenFreeShop, "Gluten free rice", 25);
        return glutenFreeShopOrder;

    }
}
