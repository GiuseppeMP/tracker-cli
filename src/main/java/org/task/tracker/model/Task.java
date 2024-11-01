package org.task.tracker.model;

import java.time.LocalDate;

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

