package com.example.Backend.Resository;

import com.example.Backend.Model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findByYearAfter(Integer year);
    List<Car> findByYearBeforeAndColor(Integer year, String color);
}
