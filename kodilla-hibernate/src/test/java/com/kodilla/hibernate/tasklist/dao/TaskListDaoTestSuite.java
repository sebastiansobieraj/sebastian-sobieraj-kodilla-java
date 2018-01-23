package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_NAME = "Test: List Name";
    private static final String DESCRIPTION = "Test: Excercise 13.2";

    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(LIST_NAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readList = taskListDao.findByListName(listName);

        //Then
        Assert.assertEquals(1, readList.size());

        //CleanUp
        int id = readList.get(0).getId();
        taskListDao.delete(id);
    }
}
