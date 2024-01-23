package com.example.charfreq.exception;

public class StringLengthTooLargeException extends RuntimeException {

    public StringLengthTooLargeException(String input) {
        super("The length of the string exceeds 100 characters. The length of the entered string is: " + input.length());
    }
}