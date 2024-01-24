package com.example.charfreq.services;

import com.example.charfreq.dto.Request;
import com.example.charfreq.util.StringConverter;
import com.example.charfreq.util.Sort;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ComputeService {

    private final StringConverter stringConverter;
    private final Sort sort;

    public ComputeService(StringConverter stringConverter, Sort sort) {
        this.stringConverter = stringConverter;
        this.sort = sort;
    }

    public Map<Character, Long> compute(Request request) {
        Map<Character, Long> nonSortedMap = stringConverter.convertToMap(request.getInput());
        return sort.sortByDesc(nonSortedMap);
    }
}