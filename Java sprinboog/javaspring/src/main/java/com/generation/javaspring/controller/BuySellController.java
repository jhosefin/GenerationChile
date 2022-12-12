package com.generation.javaspring.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.javaspring.model.BuySell;
import com.generation.javaspring.service.BuySellService;

@RestController
@CrossOrigin("*")
public class BuySellController {

    private BuySellService buySellService;

    public BuySellController(@Autowired BuySellService buySellService) {
        this.buySellService = buySellService;
    }

    @PostMapping("/BuySell/save")
    public void guardarCompraVenta(@RequestBody BuySell buySell){
        buySellService.saveBuySell(buySell);
    }

    @PutMapping("/BuySell/update")
    public void actualizarCompraVenta(@RequestBody BuySell buySell){
        buySellService.updateBuySell(buySell);
    }

    @GetMapping("/BuySell/findAll")
    public List<BuySell> todasLasComprasVentas(){
        return buySellService.findAll();
    }

    @GetMapping("/BuySell/eliminarCompraVenta/{id}")
    public void deleteCompraVenta(@PathVariable Integer id){
        buySellService.eliminarCompraVenta(id);
    }

    @GetMapping("/BuySell/buscarMonto/{monto}")
    public List<BuySell> buscarMonto(@PathVariable Integer monto){
        return buySellService.buscarPorMonto(monto);
    }

    @GetMapping("/BuySell/buscarFecha/{fechaCompra}")
    public List<BuySell> buscarFecha(@PathVariable Date fechaCompra){
        return buySellService.buscarPorFecha(fechaCompra);
    }
}
