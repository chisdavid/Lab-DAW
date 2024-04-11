package com.example.Backend.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    private Long id;
    private String name;
    private Integer age;
}
