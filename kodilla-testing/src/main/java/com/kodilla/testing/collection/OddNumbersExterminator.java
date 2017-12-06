package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public ArrayList exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if ((number % 2) == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
