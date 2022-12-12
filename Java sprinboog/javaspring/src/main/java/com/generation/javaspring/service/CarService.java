package com.generation.javaspring.service;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.javaspring.model.Car;
import com.generation.javaspring.repository.CarRepository;

@Service
@Transactional
public class CarService {

    private CarRepository carRepository;

    public CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public void saveCar (Car car){
        carRepository.save(car);
    }

    public void updateCar (Car car){
        carRepository.save(car);
    }

    public List<Car> findAll(){
        return carRepository.findAll();
    }

    public List<Car> buscarPorMarca(String marca){
        return carRepository.findAllCarMarca(marca);
    }

    public List<Car> buscarPorColor(String color){
        return carRepository.findAllCarColor(color);
    }

    public List<Car> buscarPorColorMarca(String color, String marca){
        return carRepository.findAllCarColorMarca(color,marca);
    }

    public void eliminarAuto (Integer id){
        carRepository.deleteById(id);
    }
    
}
