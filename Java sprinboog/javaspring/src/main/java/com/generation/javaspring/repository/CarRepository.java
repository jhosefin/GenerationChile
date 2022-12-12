package com.generation.javaspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

import com.generation.javaspring.model.Car;

public interface CarRepository extends JpaRepository<Car, Integer> {

    //con el nativeQuery le decimos a jva que estamos usando otro lenguaje y no es necesario que lo interprete

    @Query(value = "SELECT * FROM car WHERE marca = ?1", nativeQuery = true)
    List<Car> findAllCarMarca(String marca);
    
    @Query(value = "SELECT * FROM car WHERE color = ?1", nativeQuery = true)
    List<Car> findAllCarColor(String color);

    @Query(value = "SELECT * FROM car WHERE color = ?1 AND marca = ?2", nativeQuery = true) //?1 orden de do como se pasan los atributos
    List<Car> findAllCarColorMarca(String color, String marca);

    @Query(value = "SELECT * FROM car c JOIN c.carsell cs", nativeQuery = true)
    List<Car> findAllCarSell();
}
