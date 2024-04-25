package com.example.Backend.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    @Id
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String password;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Car> cars;
}
