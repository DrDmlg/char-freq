package com.example.charfreq.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Request {

    @NotBlank(message = "The input string cannot be empty or contain only spaces")
    @Size(max = 100, message = "The length of the input string must be at least 1 and not exceed 100 characters")
    private String input;
}