package com.company.subtask1;

import com.company.subtask1.contoller.JournalController;
import com.company.subtask1.contoller.command.JournalCommandInvoker;
import com.company.subtask1.model.Journal;
import com.company.subtask1.view.View;

public class Main {
    public static void main(String[] args) {
        final View view = new View();
        new JournalController(JournalCommandInvoker.getJournalCommandInvoker(new Journal(), view), view).processUserActions();
    }
}
