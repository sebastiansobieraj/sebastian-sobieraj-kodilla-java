package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void testLog(){
        Logger.getInstance().log("first log");
    }

    @Test
    public void testGetLastLog(){
        //Given
        //When
        String someLog = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("first log", someLog);
    }
}
