package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    public static void rps() {
        Scanner scanner = new Scanner(System.in);
        Score score = new Score();
        boolean end = false;
        int numberOfRound = 0;
        int numberOfWins = 0;
        String playerDecision;
        RandomChoice randomChoice = new RandomChoice();

        System.out.println("Rozpoczynam nową grę. \nPodaj swoje imię.");
        User user = new User(scanner.next());
        Computer computer = new Computer("Komputer");
        System.out.println("Witaj " + user.getName() + ". Podaj do ilu wygranych rund chcesz grać.");

        try{
            score.setNumberOfwins(scanner.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Liczba wygranych musi być określona cyframi! Wprowadź poprawną wartość");
            rps();
        }

        System.out.println("Zasady gry - wciśnij: \n" +
                "klawisz 1 - zagranie \"kamień\",\n" +
                "klawisz 2 - zagranie \"papier\",\n" +
                "klawisz 3 - zagranie \"nożyce\",\n" +
                "klawisz x - zakończenie gry, \n" +
                "klawisz n - uruchomienie gry od nowa");

        while (!end) {
            while (score.getPlayerScore() < score.getNumberOfWins() && score.getComputerScore() < score.getNumberOfWins()) {
                numberOfRound++;
                System.out.println("\nRunda " + (numberOfRound) + ": Podaj figurę (1, 2 lub 3)");
                user.setDecision(randomChoice, scanner);
                computer.setDecision(randomChoice);
                score.score(user, computer);
                if (score.playerScore == numberOfWins || score.computerScore == numberOfWins) {
                    end = true;
                }
            }
        }

        Result result = new Result();
        result.result(user, score);
        System.out.println("\nJeżeli chcesz rozpocząć nową grę wpisz: n. " +
                "\nJeżeli chcesz zamknąć program wpisz: x.");
        playerDecision = scanner.nextLine();
        playerDecision = scanner.nextLine();
        End end1 = new End();
        end1.end(playerDecision);
    }
}
