package com.generation.firstproyect.models;

public class Gato extends /*Extendes une con la clase padre */ Animales {

    //caracteristicas que solo puede tener esta clase
    Integer bigote;

    public Gato() {
        super();//Trae el constructor de Animales
    }

    public Gato(Integer bigote, String nombre, String raza, String pelaje,Boolean vacunado ) {
        super(nombre, raza, pelaje, vacunado);
        this.bigote = bigote;
    }

    @Override
    public String toString() {
        return super.toString()/*trae lo que tiene la herencia */ + ","+ "Gato [bigote=" + bigote + "]"/*Muestra la caracteristica nueva */;
    }
}
