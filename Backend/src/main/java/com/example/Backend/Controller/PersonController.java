package com.example.Backend.Controller;

import com.example.Backend.DTO.LoginDTO;
import com.example.Backend.Model.Person;
import com.example.Backend.Service.PersonServiceImplementation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/GetAll")
    public ResponseEntity  getAll(){
        return ResponseEntity.ok().body(personServiceImplementation.GetAll());
    }

    @PostMapping("/Login")
    public ResponseEntity Login(@RequestBody LoginDTO loginDTO){
        return ResponseEntity.ok().body(personServiceImplementation.login(loginDTO));
    }
}
