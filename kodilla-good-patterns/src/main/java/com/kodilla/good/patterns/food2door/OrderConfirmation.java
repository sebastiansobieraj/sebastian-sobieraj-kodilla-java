package com.kodilla.good.patterns.food2door;

public class OrderConfirmation implements InformationService{

    @Override
    public void inform(Supplier supplier, FoodOrder foodOrder) {
        if (supplier.process(foodOrder)){
            System.out.println("Your order has been sent");
        } else {
            System.out.println("Your order has been rejected");
        }
    }
}
