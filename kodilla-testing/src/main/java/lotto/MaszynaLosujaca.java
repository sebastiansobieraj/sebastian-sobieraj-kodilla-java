package lotto;

import java.util.List;

public class MaszynaLosujaca {

    private Database database;

    public MaszynaLosujaca(Database database) {
        this.database = database;
    }


    public int miniLotto(List<Integer> userNumbers) {
        List<Integer> listOfNumbers = database.wylosuj(5);
        int result = 0;

        for (int numbers : userNumbers) {
            if (listOfNumbers.contains(numbers)){
                result++;
            }
        }

        return result;
    }
}
