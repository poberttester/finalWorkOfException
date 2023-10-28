package com.company.exceptionsFile;

public class MoreDataEntered extends RuntimeException{
    private String detailedMessage = "More data has been entered, or an extra space has been added";

    public MoreDataEntered() {
        super();
        this.detailedMessage = detailedMessage;
    }

    @Override
    public String getMessage() {
        return detailedMessage;
    }
}
