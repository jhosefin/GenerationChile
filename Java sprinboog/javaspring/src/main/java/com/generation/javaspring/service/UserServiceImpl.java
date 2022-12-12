package com.generation.javaspring.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.generation.javaspring.model.User;
import com.generation.javaspring.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    //haciendo llamado al repositorio
    private UserRepository userRepository;

    //esto verifica que la conexion a la base de datos esta corecta y segura
    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
}

    @Override
    public User getUser(Integer id){
        //opctional es un tipo de lista con mas funcionalidades
    Optional <User> users = userRepository.findById(id);//findByid busca al usuario
    //el orElse nos permite verificar si hay o no datos dentro de nuestra lista
    //en caso de haber, va a devolver el usuario
    //en caso de que no devuelve un null
    return users.orElse(null);

    }

    @Override
    public User save(User user){
        //insert into user (columnas)(values);
        return userRepository.save(user);
    }

    @Override
    public void delete(Integer id){
        //delete from user where id = id
        userRepository.deleteById(id);
    }



}
