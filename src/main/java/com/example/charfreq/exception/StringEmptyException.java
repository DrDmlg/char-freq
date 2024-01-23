package com.example.charfreq.exception;

public class StringEmptyException extends RuntimeException {

    public StringEmptyException() {
        super("Input string is empty");
    }
}