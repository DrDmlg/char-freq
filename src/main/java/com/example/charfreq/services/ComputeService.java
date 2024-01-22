package com.example.charfreq.services;

import com.example.charfreq.util.Convert;
import com.example.charfreq.util.Sort;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ComputeService {

    public Map<Character, Long> compute(String input) {
        Map<Character, Long> nonSortedMap = Convert.convertToMap(input);

        return Sort.sortByDesc(nonSortedMap);
    }
}
