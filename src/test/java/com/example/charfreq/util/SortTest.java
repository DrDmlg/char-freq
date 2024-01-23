package com.example.charfreq.util;

import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void testSortByDesc_ShouldReturnSortedMapByDesc() {
        Map<Character, Long> unsortedMap = Map.of('a', 5L, 'c', 4L, 'b', 1L);

        Map<Character, Long>  sortedMap = Sort.sortByDesc(unsortedMap);

        assertEquals( 5L, sortedMap.get('a'));
        assertEquals( 4L, sortedMap.get('c'));
        assertEquals( 1L, sortedMap.get('b'));
    }
}