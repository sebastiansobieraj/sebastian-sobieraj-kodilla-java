package lotto;

import java.util.*;

public class BigLotto {
    public static void main (String args []){

        Set<Integer> userNumbers = new HashSet<Integer>();
        userNumbers.add(5);
        userNumbers.add(11);
        userNumbers.add(25);
        userNumbers.add(33);
        userNumbers.add(35);
        userNumbers.add(48);

        List<Integer> list = new ArrayList<>();
        long average = 0;
        for (int i = 0; i < 10; i++){
            average += result(userNumbers)/10;
        }
        System.out.println(average);
    }

    private static Set<Integer> lottoNumbers (){
        Set<Integer> randomNumbers = new HashSet<>();
        Random generator = new Random();
        while (randomNumbers.size() < 6){
            randomNumbers.add(generator.nextInt(49)+1);
        }
        return randomNumbers;
    }

    public static Integer result (Set<Integer> userNumbers){
        int petla = 0;
        Set<Integer> numbersGenerator = lottoNumbers();
        while (!userNumbers.containsAll(numbersGenerator)){
            numbersGenerator = lottoNumbers();
            petla++;
        }
        return petla;
    }
}
