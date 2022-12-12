package com.generation.rebeca.service;

import java.util.List;

import com.generation.rebeca.model.User;

/*Se cambia class por interface */

public interface UserService {

    /*Esta funcion me trae todos los usuarios que tengan.Traigo todas las listas de User */
    List <User> getAll();

/*esta funcion me dejara agregar usuarios */
    void add(User user);

    /*esta función me deja eliminar usuarios */
    void remove(User user);

    /*esta funcion me permite obtener el tamaño */
    int size();

    /*me permite traer la posicion d eun usuario segun su posicion */
    User getUser (int position);
    
}
