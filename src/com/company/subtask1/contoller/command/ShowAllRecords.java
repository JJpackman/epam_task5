package com.company.subtask1.contoller.command;

import com.company.subtask1.model.Journal;
import com.company.subtask1.view.View;

public class ShowAllRecords implements Command {
    private View view;
    private Journal model;

    public ShowAllRecords(View view, Journal model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void execute() {
        view.printData(model.getRecords());
    }
}
