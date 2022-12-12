package com.generation.firstproyect.models;

//import java.util.ArrayList;

public class Mandarina {
    //Caracteristicas

    String color;
    String sabor;
    Boolean fruta;
    //ArrayList vitaminas;
    String forma;
    String tamanno;


//constructores

public Mandarina() {
}


public Mandarina(String color, String sabor, Boolean fruta, String forma, String tamanno) {
    this.color = color;
    this.sabor = sabor;
    this.fruta = fruta;
    this.forma = forma;
    this.tamanno = tamanno;
}

public Mandarina(String color, String sabor, Boolean fruta, String tamanno) {
    this.color = color;
    this.sabor = sabor;
    this.fruta = fruta;
    this.forma = "redonda";
    this.tamanno = tamanno;
}



// Get y Set

public String getColor() {
    return color;
}


public void setColor(String color) {
    this.color = color;
}


public String getSabor() {
    return sabor;
}


public void setSabor(String sabor) {
    this.sabor = sabor;
}


public Boolean getFruta() {
    return fruta;
}


public void setFruta(Boolean fruta) {
    this.fruta = fruta;
}


public String getForma() {
    return forma;
}


public void setForma(String forma) {
    this.forma = forma;
}


public String getTamanno() {
    return tamanno;
}


public void setTamanno(String tamanno) {
    this.tamanno = tamanno;
}




    //Funciones


    //Comer mandarina
    String comer(String hambre){
        if(hambre == "Muero de hambre"){
            return "dar mordiscos";
        }
        return "no come nada :c";
    }


    //Hacer jugo de mandarinas
    void hacerJugo(){
        System.out.println("Tiene sed y Toma jugo");
    }

    //Sembrar semillas de mandarinas
    void sembrar(){
        System.out.println("Crece planta de mandarinas");
    }

    //Pede rodar la mandarina
    String rodar(String pendiente){
        if(pendiente == "Inclinado"){
            return "Rueda";
        }
        return "Solo cae :c";
    }

    //Usar mandarinas para aromatizar
    void aromatizar(){
        System.out.println("Elimina malos olores");
    }

    //Usar mandarinas para hacer remedios
    public  String remedios(boolean fruta){
        if(fruta == true){
            return "Toma remedios de mandarina";
        }
        return "No se hace remedios";
    }

    @Override
    public String toString() {
        return "Mandarina{" + "color='" + color + '\'' + ", sabor='" + sabor + '\'' + ", fruta=" + fruta + ", forma='" + forma + '\'' + ", tamanno='" + tamanno + '\'' +'}';

    }
    
}
