package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();

        //When
        BigDecimal calculatedCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(10), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza base + tomato sauce + cheese ", description);
    }

    @Test
    public void testPizzaOrderWithAllIngredientsCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new DoubleCheese(theOrder);
        theOrder = new OliveOilDecorator(theOrder);
        theOrder = new TomatoDecorator(theOrder);
        //When
        BigDecimal calculateCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(16), calculateCost);
    }

    @Test
    public void testPizzaOrderWithAllIngredientsDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new BaconDecorator(theOrder);
        theOrder = new DoubleCheese(theOrder);
        theOrder = new TomatoDecorator(theOrder);
        theOrder = new OliveOilDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza base + tomato sauce + cheese + bacon + extra cheese + tomatos + free olive oil", description);
    }
}