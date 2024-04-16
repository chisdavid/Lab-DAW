package com.example.Backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Car {
    @Id
    private Long id;
    private String model;
    private Integer year;
    private String color;
}
