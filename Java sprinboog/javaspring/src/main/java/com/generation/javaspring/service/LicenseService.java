package com.generation.javaspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.generation.javaspring.model.License;
import com.generation.javaspring.repository.LicenseRepository;

@Service
@Transactional
public class LicenseService {

    private LicenseRepository licenseRepository;

    public LicenseService(LicenseRepository licenseRepository){
        this.licenseRepository = licenseRepository;
    }

    public void saveLicense(License license){
        licenseRepository.save(license); 
    }

    public void updateLicense(License license){
        licenseRepository.save(license);
    }

    public List<License> findAll(){
        return licenseRepository.findAll();
    }

    public void eliminarLicense(Integer id){
        licenseRepository.deleteById(id);
    }


    public List<License> buscarPorEstado(String estado){//el nombre en amarillo es el que va en el controlador
        return licenseRepository.findAllLicenseEstado(estado);
    }




    
}
