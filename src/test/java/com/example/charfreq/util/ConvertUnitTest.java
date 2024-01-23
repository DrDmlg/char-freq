package com.example.charfreq.util;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ConvertUnitTest {

    @Test
    void testConvertToMap_ShouldConvertLineToMap() {
        String actual = "aaaaabcccc";

        Map<Character, Long> expected = Convert.convertToMap(actual);

        assertEquals(5, expected.get('a'));
        assertEquals(4, expected.get('c'));
        assertEquals(1, expected.get('b'));
    }
}