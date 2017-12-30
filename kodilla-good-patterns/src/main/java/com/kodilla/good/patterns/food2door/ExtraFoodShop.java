package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Supplier {

    private double priceForUnit;
    private double discount;

    public ExtraFoodShop(double priceForUnit, double discount) {
        this.priceForUnit = priceForUnit;
        this.discount = discount;
    }

    public double getPriceForUnit() {
        return priceForUnit;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public boolean process(FoodOrder foodOrder) {
        System.out.println("Extra food order accepted");

        double regularPayment = foodOrder.getItemAmount() * getPriceForUnit();
        double discountPayment = regularPayment * getDiscount();

        if (foodOrder.getItemAmount() > 15) {
            System.out.println("Payment with " + getDiscount() + " discount. Bill equals: " + discountPayment);
        } else {
            System.out.println("Bill equals: " + regularPayment);
        }
        return true;
    }
}
