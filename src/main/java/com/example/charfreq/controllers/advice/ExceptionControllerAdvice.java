package com.example.charfreq.controllers.advice;

import com.example.charfreq.exception.StringEmptyException;
import com.example.charfreq.exception.StringLengthTooLargeException;
import com.example.charfreq.models.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    private final ErrorDetails errorDetails = new ErrorDetails();

    @ExceptionHandler(StringEmptyException.class)
    public ResponseEntity<ErrorDetails> exceptionStringEmptyExceptionHandler(StringEmptyException ex) {
        errorDetails.setMessage(ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorDetails);
    }

    @ExceptionHandler(StringLengthTooLargeException.class)
    public ResponseEntity<ErrorDetails> exceptionStringLengthTooLargeHandler(StringLengthTooLargeException ex) {
        errorDetails.setMessage(ex.getMessage());
        return ResponseEntity
                .status(HttpStatus.PAYLOAD_TOO_LARGE)
                .body(errorDetails);
    }
}