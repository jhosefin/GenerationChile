package com.generation.javaspring.repository;

import org.springframework.data.repository.CrudRepository;

import com.generation.javaspring.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    
}
