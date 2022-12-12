package com.generation.javaspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.generation.javaspring.model.License;

public interface LicenseRepository extends JpaRepository<License, Integer> {

    @Query(value = "SELECT * FROM license WHERE estado = ?1", nativeQuery = true)
    List<License> findAllLicenseEstado(String estado);
    
}
