package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task{
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean execution;

    public PaintingTask(final String taskName, final String color, final String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Task : " + taskName + " - in realization.");
        setExecution(true);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if(isExecution()) return true;
        return false;
    }

    public boolean isExecution() {
        return execution;
    }

    public void setExecution(boolean execution) {
        this.execution = execution;
    }
}
