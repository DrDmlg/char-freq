package com.example.charfreq.util;

import java.util.Map;
import java.util.stream.Collectors;

public class Convert {

    public static Map<Character, Long> convertToMap(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}