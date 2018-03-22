package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class TomatoDecorator extends AbstractPizzaDecorator {
    public TomatoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal("1"));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + tomatos";
    }
}
