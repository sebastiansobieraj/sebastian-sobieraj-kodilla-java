package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Supplier {

    private double priceForUnit;
    private double extraPay;

    public GlutenFreeShop(double priceForUnit, double extraPay) {
        this.priceForUnit = priceForUnit;
        this.extraPay = extraPay;
    }

    public double getPriceForUnit() {
        return priceForUnit;
    }

    public double getExtraPay() {
        return extraPay;
    }

    @Override
    public boolean process(FoodOrder foodOrder) {
        System.out.println("Gluten free shop order accepted");

        double payment = foodOrder.getItemAmount() * getPriceForUnit();
        double extraPayment = payment * getExtraPay() + payment;

        if (foodOrder.getItemAmount() >= 10) {
            System.out.println("Bill is equals: " + payment);
            return true;
        } else if (foodOrder.getItemAmount() > 5 && foodOrder.getItemAmount() < 10){
            System.out.println("Amount is very small. Extra payment equals: " + extraPayment);
            return true;
        }
        System.out.println("Amount to small!");
        return false;
    }
}
