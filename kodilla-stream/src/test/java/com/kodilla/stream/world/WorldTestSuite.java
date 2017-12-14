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
        Country poland = new Country("Poland", new BigDecimal(37950354));
        Country germany = new Country("Germany", new BigDecimal(77815657));
        Country czechRepublic = new Country("Czech Republic", new BigDecimal(10476589));

        List<Country> europeList = new ArrayList<>();
        europeList.add(poland);
        europeList.add(germany);
        europeList.add(czechRepublic);

        Country algieria = new Country("Algieria", new BigDecimal(33770000));
        Country ghana = new Country("Ghana", new BigDecimal(23000000));
        Country camerun = new Country("Kamerun", new BigDecimal(18100000));

        List<Country> africaList = new ArrayList<>();
        africaList.add(algieria);
        africaList.add(ghana);
        africaList.add(camerun);

        Continent europe = new Continent(europeList);
        Continent africa = new Continent(africaList);

        List<Continent> worldList = new ArrayList<>();
        worldList.add(europe);
        worldList.add(africa);

        World world = new World(worldList);

        //When
        BigDecimal totalWorldPopulation = world.getPeopleQuantity();
        BigDecimal totalWorldPopulationTest = new BigDecimal("201112600");

        //Then
        Assert.assertEquals(totalWorldPopulationTest, totalWorldPopulation);
    }
}
