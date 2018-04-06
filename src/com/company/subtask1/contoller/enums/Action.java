package com.company.subtask1.contoller.enums;

public enum Action {
    ADD_RECORD(1, "Add new record"),
    SHOW_ALL_RECORDS(2, "Show existing records"),
    EXIT(3, "Exit");

    private final String description;
    private final int number;

    Action(int number, String description) {
        this.description = description;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%d) %s", number, description);
    }
}