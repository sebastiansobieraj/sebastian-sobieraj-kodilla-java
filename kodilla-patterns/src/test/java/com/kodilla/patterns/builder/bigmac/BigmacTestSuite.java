package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBicmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BicmacBuilder()
                .ingredient("cheese")
                .ingredient("chili")
                .burgers(3)
                .sauce("spicy")
                .roll("with sesame")
                .ingredient("tomato")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String kindOfSauce = bigmac.getSauce();
        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertNotEquals(1, howManyBurgers);
        Assert.assertEquals("spicy", kindOfSauce);


    }
}
