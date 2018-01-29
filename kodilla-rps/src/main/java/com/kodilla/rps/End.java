package com.kodilla.rps;

import java.util.Scanner;

public class End {
    public boolean end(String playerDecision) {
        if (playerDecision.equals("n")) {
            Game.rps();
        } else if (playerDecision.equals("x")) {
            System.out.println("Koniec gry");
        }
        return true;
    }
}
