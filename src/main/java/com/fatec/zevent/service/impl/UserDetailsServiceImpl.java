package com.fatec.zevent.service.impl;

import com.fatec.zevent.DAO.UserDAO;
import com.fatec.zevent.model.User;
import com.fatec.zevent.model.enumeration.RoleEnum;
import com.fatec.zevent.service.IUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserDetailsServiceImpl implements IUserDetailsService {

    @Autowired
    UserDAO repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User dbUser = this.repository.findByEmail(username);

        if (dbUser != null) {
            Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();

            for (RoleEnum role : dbUser.getRoles()) {
                GrantedAuthority authority = new SimpleGrantedAuthority(role.toString());
                grantedAuthorities.add(authority);
            }

            org.springframework.security.core.userdetails.User user = new org.springframework.security.core.userdetails.User(
                    dbUser.getEmail(), dbUser.getPassword(), grantedAuthorities);
            return user;
        } else {
            throw new UsernameNotFoundException(String.format("User '%s' not found", username));
        }
    }

}
