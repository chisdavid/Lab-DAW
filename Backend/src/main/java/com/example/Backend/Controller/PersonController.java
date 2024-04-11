package com.example.Backend.Controller;

import com.example.Backend.Service.PersonServiceImplementation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Data
public class PersonController {
    @Autowired private PersonServiceImplementation personServiceImplementation;

    @GetMapping("/GetName")
    public String getName(){
        return "ana are mere";
    }

    @GetMapping("/Get")
    public String getNsame(){
        return "Second Method";
    }
}
