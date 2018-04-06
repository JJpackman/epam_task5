package com.company.subtask1.model.entity;

public class Address {
    private final String street;
    private final String building;
    private final int roomNumber;

    public Address(String street, String building, int roomNumber) {
        this.street = street;
        this.building = building;
        this.roomNumber = roomNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
