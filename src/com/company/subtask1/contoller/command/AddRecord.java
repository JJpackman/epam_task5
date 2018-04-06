package com.company.subtask1.contoller.command;

import com.company.subtask1.model.Journal;
import com.company.subtask1.model.entity.*;
import com.company.subtask1.model.enums.ValidatedFields;
import com.company.subtask1.utils.*;
import com.company.subtask1.view.View;
import java.time.LocalDate;
import java.time.format.*;

public class AddRecord implements Command {
    private View view;
    private Journal model;

    public AddRecord(View view, Journal model) {
        this.view = view;
        this.model = model;
    }

    private LocalDate getDate(String str, DateTimeFormatter[] formatters) {
        for (DateTimeFormatter formatter : formatters) {
            try {
                return LocalDate.parse(str, formatter);
            } catch (DateTimeParseException ignored) {}
        }

        return null;
    }

    @Override
    public void execute() {
        String fName = "",
                lName = "",
                pNumber = "",
                birthDate = "",
                street = "",
                building = "",
                rNumber = "";

        final int fields = ValidatedFields.values().length;
        int currentField = 1;

        while (currentField != fields + 1) {
            switch (currentField) {
                case 1:
                    view.printMsg("Enter first name");
                    fName = UserInput.read();
                    if (Validator.isValid(fName, ValidatedFields.FIRST_NAME.getPatterns())) {
                        currentField++;
                    } else {
                        view.printError("Invalid first name format");
                    }
                    break;
                case 2:
                    view.printMsg("Enter last name");
                    lName = UserInput.read();
                    if (Validator.isValid(lName, ValidatedFields.LAST_NAME.getPatterns())) {
                        currentField++;
                    } else {
                        view.printError("Invalid last name format");
                    }
                    break;
                case 3:
                    view.printMsg("Enter phone number");
                    pNumber = UserInput.read();
                    if (Validator.isValid(pNumber, ValidatedFields.PHONE_NUMBER.getPatterns())) {
                        currentField++;
                    } else {
                        view.printError("Invalid phone number format");
                    }
                    break;
                case 4:
                    view.printMsg("Enter birth date");
                    birthDate = UserInput.read();
                    if (Validator.isValid(birthDate, ValidatedFields.DATE_OF_BIRTH.getPatterns())) {
                        currentField++;
                    } else {
                        view.printError("Invalid birth date format");
                    }
                    break;
                case 5:
                    view.printMsg("Enter street");
                    street = UserInput.read();
                    if (Validator.isValid(street, ValidatedFields.STREET.getPatterns())) {
                        currentField++;
                    } else {
                        view.printError("Invalid street format");
                    }
                    break;
                case 6:
                    view.printMsg("Enter building");
                    building = UserInput.read();
                    if (Validator.isValid(building, ValidatedFields.BUILDING.getPatterns())) {
                        currentField++;
                    } else {
                        view.printError("Invalid building format");
                    }
                    break;
                case 7:
                    view.printMsg("Enter room number");
                    rNumber = UserInput.read();
                    if (Validator.isValid(rNumber, ValidatedFields.ROOM_NUMBER.getPatterns())) {
                        currentField++;
                    } else {
                        view.printError("Invalid flat number format");
                    }
                    break;
            }
        }

        final DateTimeFormatter[] formatters = {
                DateTimeFormatter.ofPattern("dd.MM.yyyy"),
                DateTimeFormatter.ofPattern("dd/MM/yyyy"),
                DateTimeFormatter.ofPattern("dd-MM-yyyy")
        };

        model.addRecord(new Record.Builder()
                .setAddress(new Address(street, building, Integer.parseInt(rNumber)))
                .setDateOfBirth(getDate(birthDate, formatters))
                .setFullName(new FullName(fName, lName))
                .setPhoneNumber(pNumber)
                .getRecord()
        );
    }
}
