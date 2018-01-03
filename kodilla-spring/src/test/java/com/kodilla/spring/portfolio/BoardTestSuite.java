package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        BoardConfig boardConfig = context.getBean(BoardConfig.class);

        //When & Then
        boardConfig.getDoneList();
        boardConfig.getTasksInProgressList();
        boardConfig.getToDoList();
    }

}
