package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before (){
        System.out.println("Test Case: begin");
    }

    @After
    public void after (){
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        ArrayList<Integer> testEvenNumbersList = oddNumbersExterminator.exterminate(numbers);
        //Then
        Assert.assertEquals(0, testEvenNumbersList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        numbers.add(7);
        numbers.add(12);
        numbers.add(15);
        numbers.add(120);
        numbers.add(124);
        numbers.add(17);
        numbers.add(234);

        ArrayList<Integer> evenNumbersActual = oddNumbersExterminator.exterminate(numbers);

        ArrayList<Integer> evenNumbersExpected = new ArrayList<>();
        evenNumbersExpected.add(12);
        evenNumbersExpected.add(120);
        evenNumbersExpected.add(124);
        evenNumbersExpected.add(234);
        //Then
        Assert.assertEquals(evenNumbersExpected, evenNumbersActual);
    }

    @Test
    public void testExterminate (){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        numbers.add(6);


        ArrayList<Integer> evenNumbersActual = oddNumbersExterminator.exterminate(numbers);
        int zmienna = evenNumbersActual.get(0);

        //Then
        Assert.assertEquals(6, zmienna);
    }
    @Test
    public void testOddNumber (){
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        numbers.add(7);

        ArrayList<Integer> evenNumbersActual = oddNumbersExterminator.exterminate(numbers);

        //Then
        Assert.assertTrue(evenNumbersActual.isEmpty());
    }
}
