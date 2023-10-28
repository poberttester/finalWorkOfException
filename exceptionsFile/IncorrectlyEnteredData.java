package com.company.exceptionsFile;

public class IncorrectlyEnteredData extends IllegalArgumentException {
    private String detailedMessage = "Insufficient data is entered, or an extra space is used";

    public IncorrectlyEnteredData() {
        super();
        this.detailedMessage = detailedMessage;

    }
    @Override
    public String getMessage() {
        return detailedMessage;
    }
}

