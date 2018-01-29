package com.kodilla.rps;

import java.util.Scanner;

public class End {
    Scanner sc = new Scanner(System.in);
    public void end (String playerDecision){
        if (playerDecision.equals("n")) {
            Game.rps();
        } else if (playerDecision.equals("x")) {
            System.out.println("Koniec gry");
        } else {
            System.out.println("Nieprawidłowa komenda, spróbuj jeszcze raz.");
            end(sc.nextLine());
        }
    }
}
