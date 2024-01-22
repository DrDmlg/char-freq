package com.example.charfreq.controllers;

import com.example.charfreq.services.ComputeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController()
@RequestMapping("/computes")
public class ComputeController {

    private final ComputeService computeService;

    public ComputeController(ComputeService computeService) {
        this.computeService = computeService;
    }

    @GetMapping
    public ResponseEntity<Map<Character, Long>> compute(@RequestBody String input) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(computeService.compute(input));
    }
}