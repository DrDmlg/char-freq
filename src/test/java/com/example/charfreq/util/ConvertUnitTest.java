package com.example.charfreq.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ConvertUnitTest {

    private StringConverter converter;

    @BeforeEach
    void init() {
        converter = new StringConverter();
    }

    @Test
    void testConvertToMap_ShouldConvertLineToMap() {
        String actual = "aaaaabcccc";

        Map<Character, Long> expected = converter.convertToMap(actual);

        assertEquals(5, expected.get('a'));
        assertEquals(4, expected.get('c'));
        assertEquals(1, expected.get('b'));
    }
}