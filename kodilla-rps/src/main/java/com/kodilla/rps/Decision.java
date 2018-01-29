package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Decision {
    public void decision(Scanner scanner) {
        if (scanner.nextLine().equals("n")) {
            try {
                Game.rps();
            } catch (InputMismatchException e) {
                System.out.println("Koniec Gry");
            }
        }
    }
}
