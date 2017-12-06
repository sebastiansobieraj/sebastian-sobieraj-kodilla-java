package com.kodilla.testing.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        //When
        ArrayList<Integer> testEvenNumbersList = oddNumbersExterminator.exterminate(numbers);
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //Then
        Assert.assertEquals(emptyList, testEvenNumbersList);
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
}
