package com.kodilla.spring.portfolio;

public class Board {
    final TasksList toDoList;
    final TasksList inProgressList;
    final TasksList doneList;

    public Board(TasksList toDoList, TasksList inProgressList, TasksList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void readToDoList() {
        System.out.println("Tasks to do: ");
        toDoList.tasks.stream().forEach(System.out::println);
    }

    public void readInProgressList() {
        System.out.println("Tasks in progress : ");
        inProgressList.tasks.stream().forEach(System.out::println);
    }

    public void readDoneList() {
        System.out.println("Done tasks : ");
        doneList.tasks.stream().forEach(System.out::println);
    }
}
