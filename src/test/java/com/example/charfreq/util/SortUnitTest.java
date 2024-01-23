package com.example.charfreq.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SortUnitTest {

    private Sort sort;

    @BeforeEach
    void init() {
       sort = new Sort();
    }

    @Test
    void testSortByDesc_ShouldReturnSortedMapByDesc() {
        Map<Character, Long> unsortedMap = Map.of('a', 5L, 'c', 4L, 'b', 1L);

        Map<Character, Long>  sortedMap = sort.sortByDesc(unsortedMap);

        assertEquals( 5L, sortedMap.get('a'));
        assertEquals( 4L, sortedMap.get('c'));
        assertEquals( 1L, sortedMap.get('b'));
    }
}