package com.example.charfreq.controllers;

import com.example.charfreq.dto.Request;
import com.example.charfreq.services.ComputeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController()
@RequestMapping("/computes")
@Tag(name = "Compute Controller", description = "API for character frequency computation")
public class ComputeController {

    private final ComputeService computeService;

    public ComputeController(ComputeService computeService) {
        this.computeService = computeService;
    }

    @Operation(summary = "Compute Character Frequency", description = "Calculates the frequency of characters in the provided input string.")
    @ApiResponse(responseCode = "200", description = "Successful")
    @ApiResponse(responseCode = "400", description = "The input string cannot be empty or contain only spaces")
    @PostMapping
    public ResponseEntity<Map<Character, Long>> compute(@Valid @RequestBody Request request) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(computeService.compute(request));
    }
}