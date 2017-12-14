package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private List<Country> countries = new ArrayList<>();

    public Continent(List<Country> countries) {
        this.countries = countries;

    }

    public void addCountries(Country country) {
        countries.add(country);
    }

    public List<Country> getCountries(){
        return countries;
    }
}
