package com.kodilla.good.patterns.challenges;

import java.util.HashMap;

public class ProductsDatabase {

    private static HashMap<Product, Integer> database = new HashMap<>();

    public static HashMap<Product, Integer> createDatabase(){
        Product samsung = new Product("Samsung", 1500.00);
        Product iphone = new Product("Iphone", 2999.00);
        Product sony = new Product("Sony", 1850.00);

        database.put(samsung, 25);
        database.put(iphone, 10);
        database.put(sony, 33);

        return database;
    }

}
