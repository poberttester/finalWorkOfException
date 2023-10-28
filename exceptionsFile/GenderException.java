package com.company.exceptionsFile;

public class GenderException extends RuntimeException{
     private String detailedMessage = "The \"gender\" field must contain \"f\" or \"m\"";

     public GenderException() {
         super();
         this.detailedMessage = detailedMessage;

     }
     @Override
     public String getMessage() {
         return detailedMessage;
     }
}
