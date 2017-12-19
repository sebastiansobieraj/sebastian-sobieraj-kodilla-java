package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String args[]) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            String result = secondChallenge.probablyIWillThrowException(2.0, 1.5);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak " + e);
        } finally {
            System.out.println("Program powinien wyświetlić Done");
        }
    }
}
