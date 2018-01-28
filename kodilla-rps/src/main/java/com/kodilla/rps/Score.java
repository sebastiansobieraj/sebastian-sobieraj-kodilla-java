package com.kodilla.rps;

public class Score {
    int playerScore = 0;
    int computerScore = 0;
    int numberOfWins;

    public void score(User user, Computer computer) {
        if (user.getDecision().equals("kamień") && computer.getDecision().equals("nożyce")
                || user.getDecision().equals("papier") && computer.getDecision().equals("kamień")
                || user.getDecision().equals("nożyce") && computer.getDecision().equals("papier")) {
            playerScore++;
            System.out.println("Gracz " + user.getName() + " wybrał " + user.getDecision() + " komputer wylosował " + computer.getDecision() +
                    "\nWynik to: " + user.getName() + ": " + playerScore + ":" + computerScore + " Komputer");
        } else if (user.getDecision().equals(computer.getDecision())) {
            System.out.println("Gracz " + user.getName() + " wybrał " + user.getDecision() + " komputer wylosował " + computer.getDecision() +
                    "\nWynik to: " + user.getName() + ": " + playerScore + ":" + computerScore + " Komputer");
        } else {
            computerScore++;
            System.out.println("Gracz " + user.getName() + " wybrał " + user.getDecision() + " komputer wylosował " + computer.getDecision() +
                    "\nWynik to: " + user.getName() + ": " + playerScore + ":" + computerScore + " Komputer");
        }
    }
        public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNumberOfwins(int numberOfWins) {
        this.numberOfWins = numberOfWins;
    }
}
