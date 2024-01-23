package com.example.charfreq.services;

import com.example.charfreq.exception.StringEmptyException;
import com.example.charfreq.exception.StringLengthTooLargeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputeServiceUnitTest {

    private ComputeService service;

    @BeforeEach
    void init() {
        service = new ComputeService();
    }

    @Test
    void testCompute_ShouldThrowStringEmptyException_WhenInputStringIsEmpty() {
        String expected = "Input string is empty";

        var exception = assertThrows(StringEmptyException.class, () -> service.compute(null));

        assertEquals(expected, exception.getMessage());
    }

    @Test
    void testCompute_ShouldThrowStringLengthTooLargeException_WhenInputStringLengthMoreThen100Characters() {
        String actual = "a".repeat(101);

        String expected = "The length of the string exceeds 100 characters. The length of the entered string is: " + actual.length();

        var exception = assertThrows(StringLengthTooLargeException.class, () -> service.compute(actual));

        assertEquals(expected, exception.getMessage());
    }
}