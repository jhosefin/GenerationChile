package com.generation.javaspring.service;

import com.generation.javaspring.model.User;

public interface UserService {

    User getUser(Integer id);

    User save (User user);

    void delete(Integer id);
    
}
