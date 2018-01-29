package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    private String name;
    private String decision;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecision() {
        return decision;
    }

    public String setDecision(RandomChoice choice, Scanner scanner) {
        try {
            decision = choice.randomChoice(scanner.nextInt());
        } catch (InputMismatchException e){
            System.out.println("Możesz wybrać tylko 1, 2 lub 3");
        }
        return decision;
    }
}
