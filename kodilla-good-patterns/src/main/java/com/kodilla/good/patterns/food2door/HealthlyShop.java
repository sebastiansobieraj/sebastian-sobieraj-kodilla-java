package com.kodilla.good.patterns.food2door;

public class HealthlyShop implements Supplier {

    private double priceForUnit;

    public HealthlyShop(double priceForUnit) {
        this.priceForUnit = priceForUnit;
    }

    public double getPriceForUnit() {
        return priceForUnit;
    }


    @Override
    public boolean process(FoodOrder foodOrder) {
        System.out.println("Healthly Shop order accepted");

        double payment = foodOrder.getItemAmount() * getPriceForUnit();

        System.out.println("Bill is eulas: " + payment);

        return true;
    }
}
