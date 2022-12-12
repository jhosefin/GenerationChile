package com.generation.rebeca.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.generation.rebeca.model.User;
@Primary
@Service
public class UserServiceMap implements UserService {

    private Map <Integer, User> userMap = new HashMap <>();

    public UserServiceMap() {
    }

    //miHashMap.forEach((k,v)-> System.out.println("key: " + k + " Value: " + v));
    @Override
    public List<User> getAll() {
        List <User> users = new ArrayList<>();
        userMap.forEach((k, v) -> users.add(v));
        return users;
    }

    @Override
    public void add( User user) {
        userMap.put(user.getId(), user);
    }

    @Override
    public void remove(User user) {
        userMap.remove(user.getId());
    }


    @Override
    public User getUser(int position) {
        return userMap.get(position);
    }

    @Override
    public int size() {
        return userMap.size();
    }
    
}

