package com.generation.javaspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.javaspring.model.CarSell;
import com.generation.javaspring.repository.CarSellRepository;

@Service
@Transactional
public class CarSellService {

    private CarSellRepository carSellRepository;

    public CarSellService(CarSellRepository carSellRepository){
        this.carSellRepository = carSellRepository;
    }

    public void  saveCarSell(CarSell carSell) {
        carSellRepository.save(carSell);
    }

    public void updateCarSell(CarSell carSell) {
        carSellRepository.save(carSell);
    }

    public List<CarSell> findAll(){
        return carSellRepository.findAll();
    }

    public void eliminarVentaCarro(Integer id){
        carSellRepository.deleteById(id);
    }

    public List<CarSell> buscarPorCantidad(Integer cantidad){//el nombre en amarillo es el que va en el controlador
        return carSellRepository.findAllCarSellCantidad(cantidad);
    }

    
}
