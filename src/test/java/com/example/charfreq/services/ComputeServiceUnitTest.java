package com.example.charfreq.services;

import com.example.charfreq.util.Sort;
import com.example.charfreq.util.StringConverter;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ComputeServiceUnitTest {

    @Mock
    private StringConverter stringConverter;

    @Mock
    Sort sort;

    @InjectMocks
    private ComputeService computeService;
}