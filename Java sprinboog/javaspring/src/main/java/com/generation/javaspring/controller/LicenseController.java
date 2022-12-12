package com.generation.javaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.javaspring.model.License;
import com.generation.javaspring.service.LicenseService;

@RestController
@CrossOrigin("*")
public class LicenseController {

    private LicenseService licenseService;

    public LicenseController(@Autowired LicenseService licenseService) {
        this.licenseService = licenseService;
    }

    @PostMapping(value = ("/License/save"), consumes = {"application/json"})

    public void guardarLicencia(@RequestBody License license){
        licenseService.saveLicense(license);
    }

    @PostMapping("/License/update")
    public void actualizarLicencia(@RequestBody License license){
        licenseService.updateLicense(license);
    }

    @GetMapping("/License/findAll")
    public List<License> todasLasLicencias(){
        return licenseService.findAll();
    }

    @GetMapping("/License/eliminarLicencia/{id}")
    public void deleteLicense(@PathVariable Integer id){
        licenseService.eliminarLicense(id);
    }

    @GetMapping("/License/buscarEstado/{estado}")
    public List<License> buscarEstado(@PathVariable String estado){
        return licenseService.buscarPorEstado(estado);
    }
    
}
