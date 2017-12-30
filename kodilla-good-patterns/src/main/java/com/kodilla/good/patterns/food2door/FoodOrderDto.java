package com.kodilla.good.patterns.food2door;

public class FoodOrderDto {

    public FoodOrder foodOrder;
    public boolean isOrdered;

    public FoodOrderDto(FoodOrder foodOrder, boolean isOrdered) {
        this.foodOrder = foodOrder;
        this.isOrdered = isOrdered;
    }

    public FoodOrder getFoodOrder() {
        return foodOrder;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
