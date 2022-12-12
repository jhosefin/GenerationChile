package com.security.security2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.security2.model.Authority;
import com.security.security2.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      //Buscar el usuario con el repository y si no existe vamos a lanzar una exepcion
        //NOSOTROS GENERAMOS LA EXCEPCION
        //vamos a guardar en una variable el usuario buscado segun username, si no lo encuentra CREAMOS UN ERROR el cual
        //al momento de generarse nos devolverá el mensaje "no existe el usuario"
        com.security.security2.model.User appUser = userRepository.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException(("no existe el usuario")));

        //Vamos a mapear nuestra lista de authority con las propiedades de spring security

        List grantList = new ArrayList();

        for(Authority authority : appUser.getAuthority()){
            //ROL_USER, ROL_ADMIN, ROL_CLIENT
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
            grantList.add(grantedAuthority);
        }

        //Vamos a crear el objeto UserDetails que va a ir a sesion y tambien nos lo va a retornar

        UserDetails user = (UserDetails) new User (appUser.getUsername(), appUser.getPassword(), grantList);
        return user;

    }
}
