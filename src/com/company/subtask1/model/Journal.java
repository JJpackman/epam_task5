package com.company.subtask1.model;

import com.company.subtask1.model.entity.Record;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<Record> records;

    public Journal() {
        this.records = new ArrayList<>();
    }

    public boolean addRecord(Record record) {
        if (this.records.contains(record)) {
            return false;
        }

        return this.records.add(record);
    }

    public Record[] getRecords() {
        return records.toArray(new Record[0]);
    }
}
