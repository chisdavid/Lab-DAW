package com.example.Backend.Service;

import com.example.Backend.Model.Person;
import com.example.Backend.Resository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImplementation {
    @Autowired
    private PersonRepository personRepository;

    public Person GetPersonById(Long id){
        return personRepository.findFirstById(id);
    }
}
