package com.kodilla.rps;

public class RandomChoice {
    private String rock;
    private String scissors;
    private String paper;

    public RandomChoice() {
        this.rock = "kamień";
        this.scissors = "nożyce";
        this.paper = "papier";
    }

    public String randomChoice(int i) {

        String randomChoice = null;

        if (i == 1) {
            randomChoice = rock;
        } else if (i == 2) {
            randomChoice = paper;
        } else if (i == 3) {
            randomChoice = scissors;
        }
        return randomChoice;
    }
}