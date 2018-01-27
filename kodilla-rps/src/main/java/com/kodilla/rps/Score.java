package com.kodilla.rps;

public class Score {
    String playerDecision;
    int playerScore = 0;

    public void score(int randomNumber) {
        if(playerDecision.equals("1") && randomNumber == 3
                || playerDecision.equals("2") && randomNumber == 1
                || playerDecision.equals("3") && randomNumber == 2){
            playerScore++;
            System.out.println("Gracz " + name + " wybrał " + playerDecision + " komputer wylosował " + randomNumber +
                    "\nWynik to: " + name + ": " + playerScore + ":" + computerScore + " Komputer");
        } else if (playerDecision.equals("1") && randomNumber == 1
                || playerDecision.equals("2") && randomNumber == 2
                || playerDecision.equals("3") && randomNumber == 3) {
            System.out.println("Gracz " + name + " wybrał " + playerDecision + " komputer wylosował " + randomNumber +
                    "\nWynik to: " + name + ": " + playerScore + ":" + computerScore + " Komputer");
        } else {
            computerScore++;
            System.out.println("Gracz " + name + " wybrał " + playerDecision + " komputer wylosował " + randomNumber +
                    "\nWynik to: " + name + ": " + playerScore + ":" + computerScore + " Komputer");
        }
    }}
