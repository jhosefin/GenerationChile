package com.security.security2.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.security.security2.model.User;

public interface UserRepository extends CrudRepository <User, Long>{

    public Optional <User> findByUsername(String username);
    
}
