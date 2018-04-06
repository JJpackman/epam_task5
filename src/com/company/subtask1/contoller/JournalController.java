package com.company.subtask1.contoller;

import com.company.subtask1.contoller.command.JournalCommandInvoker;
import com.company.subtask1.contoller.enums.Action;
import com.company.subtask1.utils.UserInput;
import com.company.subtask1.view.View;

public class JournalController {
    private JournalCommandInvoker invoker;
    private View view;

    public JournalController(JournalCommandInvoker invoker, View view) {
        this.invoker = invoker;
        this.view = view;
    }

    private void handleError(String msg) {
        view.printError(msg);
    }

    private Action getAction(int actionPos) {
        for (Action action : Action.values()) {
            if (action.getNumber() == actionPos) {
                return action;
            }
        }

        return null;
    }

    public void processUserActions() {
        do {
            view.printMenu(Action.values());
            try {
                final Action action = getAction(Integer.parseInt(UserInput.read()));

                if (action == Action.EXIT) {
                    break;
                }

                invoker.executeCommand(action);
            } catch (NumberFormatException e) {
                handleError("Illegal format of action number");
            } catch (Exception e) {
                handleError(e.getMessage());
            }

        } while (true);
    }
}
