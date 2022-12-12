package com.generation.javaspring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import com.fasterxml.jackson.annotation.JsonBackReference;
//le vamos a poner el nombre a nuestra tabla en la BD
@Entity(name = "User")
public class User {
    //le especificamos a ala base que el siguiente atributo sera el id de la tabla
    @Id
    //generamos la llave primaria
    @GeneratedValue
    //definimos el atributo id
    private int id;
    private String name;
    @Column(name = "last_name")
    private String lastname;
    private String email;

    //Creando relación one to one
    //@JsonBackReference
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    private License license;

    //Relacion one to many
    //@JsonBackReference
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<BuySell> buySell;

    public User() {
    }

    public User(int id, String name, String lastname, String email, License license, List<BuySell> buySell) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.license = license;
        this.buySell = buySell;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public List<BuySell> getBuySell() {
        return buySell;
    }

    public void setBuySell(List<BuySell> buySell) {
        this.buySell = buySell;
    }



    
    
}
