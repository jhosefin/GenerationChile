package com.generation.rebeca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.generation.rebeca.model.User;
import com.generation.rebeca.service.UserService;

@RestController
public class UserController {
    
    public UserService userService;
    
    public UserController(@Autowired UserService userService) {

        this.userService = userService;
        userService.add(new User(1, "Juan","Barriga"));
        userService.add(new User(1, "Juanita","Rodriguez"));

    }

    @GetMapping("/user")
    public User getUser() {
        return userService.getUser(0);
    }

    @GetMapping("/AllUser")
    public List<User> getAllUser(){
        return userService.getAll();
    }

    // localhost:8080/FindUser/1
    @GetMapping("/FindUser/{id}")
    public User FindUser(@PathVariable("id") int id){
        return userService.getUser(id);
    }

    //Se instancia el mapping y se crea la url(path) path y url es lo ismo
    @GetMapping("/addUser/{id}/{nombre}/{apellido}")
    //creamos la función, para obtener los datos del path se ocupa pathVariable
    //para el pathVariable se le debe entregar el nombre del parametro en la url
    //por ejemplo "id" que en la url esta como {id}
    //SE DEBE HACER POR CADA PARAMETRO ENVIADO EN LA url
        public void addUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido){ 
            //cuando ya obtenemos todos los parametros los podemos utilizar dentro de la función
            userService.add(new User(id, nombre,apellido));
        
    }

    @GetMapping("/removeUser/{id}/{nombre}/{apellido}")
    public void removeUser(@PathVariable("id") int id, @PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido){ 

        userService.remove(new User(id, nombre,apellido));
    }

    @GetMapping("/countUser")
    public int getsize(){

        return userService.size();
    }

}

