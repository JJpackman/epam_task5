package com.company.subtask1.view;

import com.company.subtask1.contoller.enums.Action;
import com.company.subtask1.model.entity.Record;

import static com.company.subtask1.view.constant.ConsoleColorConstants.*;

public class View {
    public void printMenu(Action[] actions) {
        for (Action action : actions) {
            System.out.println(action);
        }
    }

    public void printMsg(String msg) {
        System.out.println(ANSI_GREEN + msg + ANSI_RESET);
    }

    public void printError(String msg) {
        System.out.println(ANSI_RED + msg + ANSI_RESET);
    }

    public void printData(Record[] records) {
        for (Record record : records) {
            System.out.println(record);
        }
    }
}
