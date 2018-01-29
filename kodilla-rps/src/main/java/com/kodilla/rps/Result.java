package com.kodilla.rps;

public class Result {
    public void result(User user, Score score) {
        if (score.getComputerScore() == score.getPlayerScore()) {
            System.out.println("\nWynik to remis");
        } else if (score.getComputerScore() > score.getPlayerScore()) {
            System.out.println("\nZwyciezca to: komputer");
        } else {
            System.out.println("\nZwycięzca to: " + user.getName());
        }


    }
}
