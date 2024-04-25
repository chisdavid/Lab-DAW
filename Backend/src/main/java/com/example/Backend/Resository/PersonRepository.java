package com.example.Backend.Resository;

import com.example.Backend.Model.Person;
import io.swagger.models.auth.In;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person,Long > {
    Person findFirstById(Long id);
    List<Person> findByAge(Integer age);
    Person findByEmailAndPassword(String email, String password);
}
