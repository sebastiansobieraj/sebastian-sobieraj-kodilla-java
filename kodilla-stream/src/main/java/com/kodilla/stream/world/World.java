package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private List<Continent> continents = new ArrayList<>();

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public void addContinents(Continent continent) {
        continents.add(continent);
    }


    public BigDecimal getPeopleQuantity() {
        BigDecimal totalWorldPopulation = continents.stream()
                .flatMap(country -> country.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
        return totalWorldPopulation;
    }
}
