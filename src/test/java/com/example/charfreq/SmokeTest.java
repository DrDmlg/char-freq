package com.example.charfreq;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.charfreq.controllers.ComputeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTest {

    @Autowired
    private ComputeController controller;

    @Test
    void contextLoads() {
        assertThat(controller).isNotNull();
    }
}