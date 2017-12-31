package com.kodilla.good.patterns.food2door;

public class SupplierFoodOrderService implements FoodOrderService {

    @Override
    public boolean foodOrderService(Supplier supplier, String nameOfFood, double foodAmount) {
        if (foodAmount > 0) {
            return true;
        }
        System.out.println("You must to enter a item amount bigger than 0");
        return false;
    }
}
