package com.lotto;

import lotto.Excerscise;
import lotto.NumberNotEqualZeroException;
import lotto.TwoNumbersShouldBePositiveException;
import org.junit.Assert;
import org.junit.Test;

public class TestExcercise {

    @Test
    public void TestExcercise() throws NumberNotEqualZeroException, TwoNumbersShouldBePositiveException {

        Excerscise excerscise = new Excerscise();

        double result = excerscise.power(2.0, 2.0);

        Assert.assertEquals(4.0, result, 0.01);
    }

    @Test (expected = NumberNotEqualZeroException.class)
    public void TestExcercise2() throws NumberNotEqualZeroException, TwoNumbersShouldBePositiveException {

        Excerscise excerscise = new Excerscise();

        excerscise.power(0.0, 2.0);

    }

//    @Test (expected = TwoNumbersShouldBePositiveException.class)
//    public void TestExcercise3() throws NumberNotEqualZeroException, TwoNumbersShouldBePositiveException {
//
//        Excerscise excerscise = new Excerscise();
//
//        excerscise.power(12.0, 0.0);
//    }
}
