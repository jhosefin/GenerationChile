package com.generation.javaspring.repository;

import java.util.List;
import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.javaspring.model.BuySell;

public interface BuySellRepository extends JpaRepository<BuySell, Integer>  {
    @Query(value = "SELECT * FROM BuySell WHERE monto = ?1", nativeQuery = true)
    List<BuySell> findAllBuySellMonto(Integer monto);

    @Query(value = "SELECT * FROM BuySell WHERE fechaCompra = ?1", nativeQuery = true)
    List<BuySell> findAllBuySellFechasCompra(Date fechaCompra);
    
}
