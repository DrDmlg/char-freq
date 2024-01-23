package com.example.charfreq.controllers;

import com.example.charfreq.services.ComputeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController()
@RequestMapping("/computes")
public class ComputeController {

    private final ComputeService computeService;

    public ComputeController(ComputeService computeService) {
        this.computeService = computeService;
    }

    @PostMapping
    public ResponseEntity<Map<Character, Long>> compute(@RequestBody(required = false) String input) {
        log.info("Input string: " + input );
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(computeService.compute(input));
    }
}