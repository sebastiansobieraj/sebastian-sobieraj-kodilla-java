package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTaskTestSuite {
    @Test
    public void testUserTasks() {
        //Given
        UserTask sebastianSobieraj = new UserTask("Sebastian Sobieraj");
        Mentor mentor = new Mentor("Paweł Pluta");
        sebastianSobieraj.registerObserver(mentor);
        //When
        sebastianSobieraj.addTask("Kodilla quest 1");
        sebastianSobieraj.addTask("Kodilla quest 2");
        sebastianSobieraj.addTask("Kodilla quest 3");
        //Then
        assertEquals(3, mentor.getUpdateCount());
    }
}
