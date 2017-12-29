package com.kodilla.good.patterns.challenges;

public class WearehouseInformation implements Wearehouse{

    public boolean checkAvailability(OrderRequest orderRequest) {
        boolean check = false;
        boolean contain = ProductsDatabase.createDatabase().containsKey(orderRequest.getProduct());
        int amount = ProductsDatabase.createDatabase().get(orderRequest.getProduct());

        if (contain && amount >= orderRequest.getAmount()){
            check = true;
        } else {
            System.out.println("Sorry, this amount is not availiable");
        }
        return check;
    }
}
