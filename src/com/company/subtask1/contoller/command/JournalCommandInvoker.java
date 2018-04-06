package com.company.subtask1.contoller.command;

import com.company.subtask1.contoller.enums.Action;
import com.company.subtask1.model.Journal;
import com.company.subtask1.view.View;
import java.util.*;

public class JournalCommandInvoker {
    private final Map<Action, Command> commands;
    private final Journal model;
    private final View view;

    public JournalCommandInvoker(Journal model, View view) {
        this.commands = new HashMap<>();
        this.model = model;
        this.view = view;
    }

    public void addCommand(Action action, Command command) {
        this.commands.putIfAbsent(action, command);
    }

    public void executeCommand(Action action) throws Exception {
        try {
            this.commands.get(action).execute();
        } catch (NullPointerException e) {
            throw new Exception("Invalid command", e);
        }
    }

    public static JournalCommandInvoker getJournalCommandInvoker(Journal model, View view) {
        return new JournalCommandInvoker(model, view) {
            {
                addCommand(Action.ADD_RECORD, new AddRecord(view, model));
                addCommand(Action.SHOW_ALL_RECORDS, new ShowAllRecords(view, model));
            }
        };
    }
}
