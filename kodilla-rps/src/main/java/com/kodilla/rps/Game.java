package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {
    int numberOfWins = 0;
    int playerScore = 0;
    int computerScore = 0;
    String playerDecision;
    String playerDecision2;
    Random generator = new Random();
    Scanner takeName = new Scanner(System.in);
    Scanner takeNumberOfWins = new Scanner(System.in);
    Scanner newOrEnd = new Scanner(System.in);
    boolean end = false;
    Score score = new Score();
    int numberOfRound = 0;

    public void rps() {
        System.out.println("Rozpoczynam nową grę. \nPodaj swoje imię.");
        User user = new User(takeName.next());
        Computer computer = new Computer("Komputer");
        System.out.println("Witaj " + user.getName() + ". Podaj do ilu wygranych rund chcesz grać.");
        numberOfWins = takeNumberOfWins.nextInt();
        score.setNumberOfwins(numberOfWins);
        System.out.println("Zasady gry - wciśnij: \n" +
                "klawisz 1 - zagranie \"kamień\",\n" +
                "klawisz 2 - zagranie \"papier\",\n" +
                "klawisz 3 - zagranie \"nożyce\",\n" +
                "klawisz x - zakończenie gry, \n" +
                "klawisz n - uruchomienie gry od nowa");

        while (!end) {
            RandomChoice randomChoice = new RandomChoice();
            Scanner sc = new Scanner(System.in);
            numberOfRound++;
            System.out.println("\nRunda " + (numberOfRound) + ": Podaj figurę (1, 2 lub 3). Jeżeli chcesz zakończyć " +
                    "grę aktualnym wynikiem wpisz: x, jeżeli chcesz zacząć od nowa, wpisz: n.");
            playerDecision = newOrEnd.nextLine();

            if (playerDecision.equals("x")) {
                System.out.println("Gra zakończona");
                break;
            } else if (playerDecision.equals("n")) {
                rps();
            }
            user.setDecision(randomChoice, sc);
            computer.setDecision(randomChoice);
            score.score(user, computer);
            if (score.playerScore == numberOfWins || score.computerScore == numberOfWins) {
                end = true;
            }
        }
        result();
    }

//    public void score(int randomNumber) {
//        if(playerDecision.equals("1") && randomNumber == 3
//                || playerDecision.equals("2") && randomNumber == 1
//                || playerDecision.equals("3") && randomNumber == 2){
//            playerScore++;
//            System.out.println("Gracz " + name + " wybrał " + playerDecision + " komputer wylosował " + randomNumber +
//                    "\nWynik to: " + name + ": " + playerScore + ":" + computerScore + " Komputer");
//        } else if (playerDecision.equals("1") && randomNumber == 1
//                || playerDecision.equals("2") && randomNumber == 2
//                || playerDecision.equals("3") && randomNumber == 3) {
//            System.out.println("Gracz " + name + " wybrał " + playerDecision + " komputer wylosował " + randomNumber +
//                    "\nWynik to: " + name + ": " + playerScore + ":" + computerScore + " Komputer");
//        } else {
//            computerScore++;
//            System.out.println("Gracz " + name + " wybrał " + playerDecision + " komputer wylosował " + randomNumber +
//                    "\nWynik to: " + name + ": " + playerScore + ":" + computerScore + " Komputer");
//        }
//    }


    public void result() {
        if (score.computerScore == score.playerScore) {
            System.out.println("\nWynik to remis");
        } else if (score.computerScore > score.playerScore) {
            System.out.println("\nZwyciezca to: komputer");
        } else {
            System.out.println("\nZwycięzca to: " + takeName);
        }

        System.out.println("\nJeżeli chcesz rozpocząć nową grę wpisz: n. " +
                "\nJeżeli chcesz zamknąć program wpisz: x.");
        playerDecision2 = newOrEnd.nextLine();
        if (playerDecision2.equals("n")) {
            rps();
        } else {
            System.out.println("Koniec gry");
        }
    }
}
