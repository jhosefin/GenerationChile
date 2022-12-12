package com.generation.firstproyect.models;

public class Laptop {
        //Caracteristicas

        Boolean portatil;
        String forma;
        String marca;
        String color;
        String tamanno;
    
    
        //Funciones
    
        
        
    
        void prender(){
            System.out.println("Laptop encendida");
        }

        void apagar(){
            System.out.println("Laptop apagada");
        }
    

        String navegacionWeb(String navegarInternet){
            if(navegarInternet == "Entrar a la web"){
                return "Abre navegador";
            }
            return "Dejarlo cerrado";
        }
    
    
        void Jugar(){
            System.out.println("Puedes jugar tu videojuego favorito");
        }

        void Programar(){
            System.out.println("Puedes programar tu primera pagina web o almenos intentarlo");
        }
    
        String ejecutarAplicaciones(String AbrirAplicación){
            if(AbrirAplicación == "Entrar a la aplicación"){
                return "Usar la aplicación";
            }
            return "Aplicaciones cerradas";
        }
}
