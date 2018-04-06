package com.company.subtask1.model.entity;

import java.time.LocalDate;

public class Record {
    private final FullName fullname;
    private final LocalDate dateOfBirth;
    private final Address address;
    private final String phoneNumber;

    private Record(FullName fullname, LocalDate dateOfBirth, Address address, String phoneNumber) {
        this.fullname = fullname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public FullName getFullName() {
        return fullname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("(%s %s) %s %s", fullname, dateOfBirth, address, phoneNumber);
    }

    public static class Builder {
        private FullName fullName;
        private LocalDate dateOfBirth;
        private Address address;
        private String phoneNumber;

        public Builder setFullName(FullName fullName) {
            this.fullName = fullName;
            return this;
        }

        public Builder setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Record getRecord() {
            return new Record(fullName, dateOfBirth, address, phoneNumber);
        }
    }
}
