package com.generation.javaspring.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name="CarSell")
public class CarSell {
    @Id
    @GeneratedValue
    private Integer id;
    private int cantidad;

    //la relacion many to many implica que son dos relaciones one to  many

    //many to one a auto
    //al ser una relacion de tabla relacional ya no se llama a json
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="car_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    private Car car;

    //many to one a buy sell
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="buySell_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

    private BuySell buySell;

    public CarSell() {
    }

    public CarSell(Integer id, int cantidad, Car car, BuySell buySell) {
        this.id = id;
        this.cantidad = cantidad;
        this.car = car;
        this.buySell = buySell;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public BuySell getBuySell() {
        return buySell;
    }

    public void setBuySell(BuySell buySell) {
        this.buySell = buySell;
    }


    
}
