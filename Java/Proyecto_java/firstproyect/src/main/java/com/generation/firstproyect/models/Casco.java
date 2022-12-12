package com.generation.firstproyect.models;

public class Casco {
    //Caracteristicas

    String color;
    String tamanno;
    String calidad;
    String marca;
    Float precio;


    //Funciones

    
    

    void proteger(){
        System.out.println("Colocar casco");
    }

    String ventilar(String calor){
        if(calor == "Hace calor"){
            return "Abrir ventilación";
        }
        return "Dejarlo cerrado";
    }

    String AbsorbeGolpes(String caida){
            if(caida == "Se golpea la cabeza"){
                return "Absorbe el golpe";
            }
            return "No absorbe ningun golpe";
        }



    void Seguridad(){
        System.out.println("Puedes andar seguro con tu casco");
    }


}
