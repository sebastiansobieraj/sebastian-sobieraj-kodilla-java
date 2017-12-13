package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("Poland", new BigDecimal(37950354)));
        countryList.add(new Country("Germany", new BigDecimal(77815657)));
        countryList.add(new Country("Russia", new BigDecimal(142897654)));
        countryList.add(new Country("Czech Republic", new BigDecimal(10476589)));

        //When
        BigDecimal totalWorldPopulation = countryList.stream()
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPopulation = new BigDecimal("269140254");
        Assert.assertEquals(expectedPopulation, totalWorldPopulation);
    }
}
