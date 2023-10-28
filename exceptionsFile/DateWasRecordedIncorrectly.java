package com.company.exceptionsFile;

public class DateWasRecordedIncorrectly extends IllegalArgumentException{
    private String detailedMessage = "The date was recorded incorrectly";

    public DateWasRecordedIncorrectly() {
        super();
        this.detailedMessage = detailedMessage;

    }
    @Override
    public String getMessage() {
        return detailedMessage;
    }
}
