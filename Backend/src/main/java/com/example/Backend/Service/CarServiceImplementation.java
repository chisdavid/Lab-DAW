package com.example.Backend.Service;

import com.example.Backend.Model.Car;
import com.example.Backend.Resository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImplementation {

    @Autowired
    private CarRepository carRepository;

    public void insert(Car car) {
        carRepository.save(car);
    }

    public void delete(Long id){
        carRepository.deleteById(id);
    }

    public void update(Car car) {
        carRepository.save(car);
    }

    public List<Car> GetByYear(Integer year){
       return carRepository.findByYearAfter(year);
    }

    public List<Car> GetByYearBeforeAndColor(Integer year, String color){
        return carRepository.findByYearBeforeAndColor(year,color);
    }
}
