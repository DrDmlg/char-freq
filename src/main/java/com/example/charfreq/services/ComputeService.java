package com.example.charfreq.services;

import com.example.charfreq.exception.StringEmptyException;
import com.example.charfreq.exception.StringLengthTooLargeException;
import com.example.charfreq.util.StringConverter;
import com.example.charfreq.util.Sort;
import jakarta.annotation.Nullable;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
public class ComputeService {

    private final StringConverter stringConverter;
    private final Sort sort;

    public ComputeService(StringConverter stringConverter, Sort sort) {
        this.stringConverter = stringConverter;
        this.sort = sort;
    }

    public Map<Character, Long> compute(@Nullable String input) {
        if (Objects.isNull(input)) throw new StringEmptyException();

        if (input.length() > 100) throw new StringLengthTooLargeException(input);

        Map<Character, Long> nonSortedMap = stringConverter.convertToMap(input);

        return sort.sortByDesc(nonSortedMap);
    }
}