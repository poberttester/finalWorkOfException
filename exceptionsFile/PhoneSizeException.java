package com.company.exceptionsFile;

public class PhoneSizeException extends RuntimeException{
    private String detailedMessage = "The \"phone\" field must contain 11 characters";

    public PhoneSizeException() {
        super();
        this.detailedMessage = detailedMessage;

    }
    @Override
    public String getMessage() {
        return detailedMessage;
    }
}
