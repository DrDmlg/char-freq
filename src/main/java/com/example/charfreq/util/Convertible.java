package com.example.charfreq.util;

public interface Convertible<T, R> {
    R convertToMap(T input);
}