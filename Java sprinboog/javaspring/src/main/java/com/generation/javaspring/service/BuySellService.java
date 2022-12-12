package com.generation.javaspring.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.javaspring.model.BuySell;
import com.generation.javaspring.repository.BuySellRepository;

@Service
@Transactional
public class BuySellService {

    private BuySellRepository buySellRepository;

    public BuySellService(BuySellRepository buySellRepository){
        this.buySellRepository = buySellRepository;
    }

    public void  saveBuySell(BuySell buySell) {
        buySellRepository.save(buySell);
    }

    public void updateBuySell(BuySell buySell) {
        buySellRepository.save(buySell);
    }

    public List<BuySell> findAll(){
        return buySellRepository.findAll();
    }

    public void eliminarCompraVenta(Integer id){
        buySellRepository.deleteById(id);
    }

    public List<BuySell> buscarPorMonto(Integer monto){//el nombre en amarillo es el que va en el controlador
        return buySellRepository.findAllBuySellMonto(monto);
    }

    public List<BuySell> buscarPorFecha(Date fechaCompra){//el nombre en amarillo es el que va en el controlador
        return buySellRepository.findAllBuySellFechasCompra(fechaCompra);
    }
    
}
