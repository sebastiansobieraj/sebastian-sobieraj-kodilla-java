package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

public class BoardConfig {

    @Bean
    public Board getBoard (){
        return new Board(getToDoList(), getTasksInProgressList(), getDoneList());
    }

    @Bean(name = "To Do List")
    @Scope("prototype")
    public TasksList getToDoList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Learn Java");
        return new TasksList(list);
    }

    @Bean(name = "Tasks In Progress")
    @Scope("prototype")
    public TasksList getTasksInProgressList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Making dinner");
        return new TasksList(list);
    }

    @Bean(name = "Done List")
    @Scope("prototype")
    public TasksList getDoneList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("English lesson");
        return new TasksList(list);
    }
}
