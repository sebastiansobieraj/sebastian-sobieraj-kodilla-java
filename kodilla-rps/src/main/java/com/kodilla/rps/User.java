package com.kodilla.rps;

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
        decision = choice.randomChoice(scanner.nextInt());
        return decision;
    }
}
