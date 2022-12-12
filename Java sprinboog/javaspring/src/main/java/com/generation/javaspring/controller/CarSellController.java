package com.generation.javaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.javaspring.model.CarSell;
import com.generation.javaspring.service.CarSellService;

@RestController
@CrossOrigin("*")
public class CarSellController {
    
    private CarSellService carSellService;

    public CarSellController(@Autowired CarSellService carSellService) {
        this.carSellService = carSellService;
    }

    @PostMapping("/CarSell/save")
    public void guardarVentaCarro(@RequestBody CarSell carSell){
        carSellService.saveCarSell(carSell);
    }

    @PutMapping("/CarSell/update")
    public void actualizarVentaCarro(@RequestBody CarSell carSell){
        carSellService.updateCarSell(carSell);
    }

    @GetMapping("/CarSell/findAll")
    public List<CarSell> todasLasVentasCarros(){
        return carSellService.findAll();
    }

    @GetMapping("/CarSell/eliminarVentaCarro/{id}")
    public void deleteVentaCarro(@PathVariable Integer id){
        carSellService.eliminarVentaCarro(id);
    }

    @GetMapping("/CarSell/buscarCantidad/{cantidad}")
    public List<CarSell> buscarCantidad(@PathVariable Integer cantidad){
        return carSellService.buscarPorCantidad(cantidad);
    }
}
