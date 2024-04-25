package com.example.Backend.Service;

import com.example.Backend.DTO.LoginDTO;
import com.example.Backend.Model.Person;
import com.example.Backend.Resository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImplementation {
    @Autowired
    private PersonRepository personRepository;

    public Person GetPersonById(Long id){
        return personRepository.findFirstById(id);
    }

    public List<Person> GetAll(){
        List<Person> persons = (List<Person>) personRepository.findAll();
        return persons;
    }

    public Person login(LoginDTO  loginDTO){
        Person person = personRepository.findByEmailAndPassword(loginDTO.getEmail() , loginDTO.getPassword());

        if (person != null){
            return person;
        }

        return null;

    }
}
