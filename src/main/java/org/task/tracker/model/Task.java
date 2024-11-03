package org.task.tracker.model;

import java.time.LocalDate;

record TaskDetails(int id, String description, LocalDate createAt, LocalDate updateAt) {
}


public class Task {

    private final int id;
    private String description;

    public Task(int taskId, String taskDescription) {
        if (taskDescription == null || taskDescription.isBlank()) {
            throw new IllegalArgumentException("Task description cannot be empty");
        }
        this.id = taskId;
        this.description = taskDescription;
    }

    public Task(TaskDetails taskDetails) {
        this.id = taskDetails.id();
        this.description = taskDetails.description();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return TaskStatus.TODO;
    }

    public LocalDate getCreateAt() {
        return LocalDate.now();
    }

    public void update() {
        return;
    }

    public LocalDate getUpdateAt() {
        return LocalDate.now();
    }
}


