package com.lotto;

import lotto.Database;
import lotto.MaszynaLosujaca;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.intThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestMaszynaLosujaca {

    @Test
    public void testMaszynaLosujaca() {
        //Given
        Database database = mock(Database.class);
        MaszynaLosujaca maszynaLosujaca = new MaszynaLosujaca(database);
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(6);
        numbers.add(17);
        numbers.add(1);
        numbers.add(9);
        when(database.wylosuj(5)).thenReturn(numbers);

        List<Integer> userNumbers = new ArrayList<>();
        userNumbers.add(5);
        userNumbers.add(7);
        userNumbers.add(2);
        userNumbers.add(8);
        userNumbers.add(18);

        //When
        int wynik = maszynaLosujaca.miniLotto(userNumbers);

        //Then
        Assert.assertEquals(1, wynik);



    }

}
