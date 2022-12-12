package com.generation.firstproyect.models;

import java.io.Console;

public class Perro {

    //Caracteristicas
    /*Tecnicas de encapsulamiento private */
    private String nombre ;
    private String pelaje ;
    private String raza ;
    private Boolean vacunado;

    //constructor

    /*Por defecto */
    public Perro() {

    }
/*Con todos sus datos */

    public Perro(String nombre, String pelaje, String raza, Boolean vacunado) {

        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = raza;
        this.vacunado = vacunado;
    }
    /*Con variable que parte de un dato */

    public Perro(String nombre, String pelaje, String raza) {

        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = raza;
        this.vacunado = false;
    }

    public Perro(String nombre, String pelaje) {

        this.nombre = nombre;
        this.pelaje = pelaje;
        this.raza = "Quiltro";
        this.vacunado = false;
    }
    
    //Get y Set va entre la carcteristica y la funcionalidad


    //con esto yo ingreso y obtengo el nombre de mi perro(metodo get)
    public String getNombre() {
        return nombre;
    }

    //Con este modifico el nombre de mi perro (metodo set)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Boolean getVacunado() {
        return vacunado;
    }

    public void setVacunado(Boolean vacunado) {
        this.vacunado = vacunado;
    }

    //Acciones
    public void ladrar(){
        System.out.println("guau");
    }
    public void caminar(){
        System.out.println("dar un pasito");
    }

    public String truco(String tipoTruco){
        if(tipoTruco == "da la pata"){
            return "doy la pata";
        }
        return "no hago nada :c";
    }

    public Boolean adopcion(){
        //haz todo lo que yo te digo aca adentro eso es el try
        try {
            if(this.vacunado){
                return true;
            }else{ 
            return false;
            }
        } catch (Exception e) {//si se cae algo en el try, haz esto
            // TODO: handle exception
            System.out.println(e);
            return false;
        }
    }

    public String login(String nombre, String raza){
        try{ 
        if(nombre == "polo" && raza == "oso"){
            return "nombre aceptado";
        }else{
            return "se equivoco";
        }
        } catch(Exception e){
        return "se equivoco x2";
        }
    }
    Console console = System.console();
    public void nombrePerro(String nombre) {

        Perro nombreperro1 = new Perro();
        nombreperro1.setNombre(console.readLine("Ingresa el nombre del perro: "));
        
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", pelaje=" + pelaje + ", raza=" + raza + ", vacunado=" + vacunado + "]";
    }
    
}

