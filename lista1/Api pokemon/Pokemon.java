package com.example.apirestwithspring.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Pokemon(Integer id, String name, double height) {
    
}
