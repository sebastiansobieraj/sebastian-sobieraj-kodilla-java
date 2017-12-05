package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator simpleCalculator = new Calculator();

        int add = simpleCalculator.add(4, 5);
        int subtract = simpleCalculator.subtract(4, 5);

        if (add == 9) {
            System.out.println("test add OK");
        } else {
            System.out.println("test add error!");
        }

        if (subtract == -1) {
            System.out.println("test subtract OK");
        } else {
            System.out.println("test subtract error!");
        }
    }
}
