package com.example.charfreq.util;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.stream.Collectors;

@Component
public class StringConverter implements Convertible<String, Map<Character, Long>> {

    @Override
    public Map<Character, Long> convertToMap(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
    }
}