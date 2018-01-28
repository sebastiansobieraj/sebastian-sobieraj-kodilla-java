package com.kodilla.rps;

import java.util.Random;

public class Computer {
    private String computerName;
    private String decision;

    public Computer(String computerName) {
        this.computerName = computerName;
    }

    public String getComputerName() {
        return computerName;
    }

    public String getDecision() {
        return decision;
    }

    public String setDecision(RandomChoice choice) {
        Random random = new Random();
        decision = choice.randomChoice(random.nextInt(3)+1);
        return decision;
    }
}
