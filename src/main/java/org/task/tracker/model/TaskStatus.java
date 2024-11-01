package org.task.tracker.model;

public enum TaskStatus {
    TODO ("TODO"),
    PROGRESS("IN-PROGRESS"),
    DONE("DONE");

    private final String name;

    TaskStatus(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
