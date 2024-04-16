package com.example.Backend.Controller;

import com.example.Backend.DTO.YearColorDTO;
import com.example.Backend.Model.Car;
import com.example.Backend.Service.CarServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/Car")
public class CarController {
    @Autowired
    private CarServiceImplementation carServiceImplementation;

    @PostMapping("/Insert")
    public void insert(@RequestBody Car car) {
        carServiceImplementation.insert(car);
    }

    @PostMapping("/Delete")
    public void delete(@RequestBody Long id) {
        carServiceImplementation.delete(id);
    }

    @PostMapping("/Update")
    public void update(@RequestBody Car car) {
        carServiceImplementation.update(car);
    }

    @PostMapping("/GetByYear")
    public List<Car> getByYear(@RequestBody Integer year) {
        return carServiceImplementation.GetByYear(year);
    }

    @PostMapping("/GetByYearBeforeAndColor")
    public  List<Car> getByYearBeforeAndColor(@RequestBody YearColorDTO YearColorDTO) {
        return carServiceImplementation.GetByYearBeforeAndColor(YearColorDTO.getYear(), YearColorDTO.getColor());
    }
}
