package lotto;


import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String args[]) {
        Set<Integer> list1 = getNumbers();
        Set<Integer> list2 = generateNumbers();
        compareNumbers(list1, list2);

    }

    public static Set<Integer> getNumbers() {
        Set<Integer> listOfNumbers = new HashSet<Integer>();
        Scanner numbers = new Scanner(System.in);
        System.out.println("Podaj 6 liczb");
        while (listOfNumbers.size() < 6) {
            listOfNumbers.add(numbers.nextInt());
        }
        return listOfNumbers;
    }

    public static Set<Integer> generateNumbers() {
        Set<Integer> listOfRandomNumbers = new HashSet<Integer>();
        Random randomGenerator = new Random();
        while (listOfRandomNumbers.size() < 6) {
            listOfRandomNumbers.add(randomGenerator.nextInt(49) + 1);
        }
        return listOfRandomNumbers;
    }

    public static void compareNumbers(Set<Integer> listOfNumbers, Set<Integer> listOfRandomNumbers) {

        int equalsNumbers = 0;
        for (Integer number : listOfNumbers) {
            if (listOfRandomNumbers.contains(number)) {
                equalsNumbers++;
            }
        }
        System.out.println(equalsNumbers);
    }
}
