package com.example.charfreq.services;

import com.example.charfreq.exception.StringEmptyException;
import com.example.charfreq.exception.StringLengthTooLargeException;
import com.example.charfreq.util.Sort;
import com.example.charfreq.util.StringConverter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ComputeServiceUnitTest {

    @Mock
    private StringConverter stringConverter;

    @Mock
    Sort sort;

    @InjectMocks
    private ComputeService computeService;

    @Test
    void testCompute_ShouldThrowStringEmptyException_WhenInputStringIsEmpty() {
        String expected = "Input string is empty";

        var exception = assertThrows(StringEmptyException.class, () -> computeService.compute(null));

        assertEquals(expected, exception.getMessage());
    }

    @Test
    void testCompute_ShouldThrowStringLengthTooLargeException_WhenInputStringLengthMoreThen100Characters() {
        String actual = "a".repeat(101);

        String expected = "The length of the string exceeds 100 characters. The length of the entered string is: " + actual.length();

        var exception = assertThrows(StringLengthTooLargeException.class, () -> computeService.compute(actual));

        assertEquals(expected, exception.getMessage());
    }
}