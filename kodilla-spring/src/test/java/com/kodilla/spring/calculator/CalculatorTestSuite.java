package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");

        //When
        double add = calculator.add(2, 2);
        double div = calculator.div(2, 2);
        double mul = calculator.mul(2, 2);
        double sub = calculator.sub(2, 2);

        //Then
        Assert.assertEquals(4, add, 0);
        Assert.assertEquals(1, div, 0);
        Assert.assertEquals(4, mul, 0);
        Assert.assertEquals(0, sub, 0);

    }
}
