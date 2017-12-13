package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAverage;


public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {5,3,6,8,5};

        //When
        OptionalDouble avgResult = getAverage(numbers);

        //Then
        Assert.assertEquals(5.4, avgResult);
    }
}
