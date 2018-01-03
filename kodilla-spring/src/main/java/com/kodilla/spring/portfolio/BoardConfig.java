package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

public class BoardConfig {

    @Bean
    public Board getBoard (){
        return new Board(getToDoList(), getTasksInProgressList(), getDoneList());
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TasksList getToDoList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Learn Java");
        return new TasksList(list);
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TasksList getTasksInProgressList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Making dinner");
        return new TasksList(list);
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TasksList getDoneList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("English lesson");
        return new TasksList(list);
    }
}
