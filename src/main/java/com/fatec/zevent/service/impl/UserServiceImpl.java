package com.fatec.zevent.service.impl;

import com.fatec.zevent.DAO.UserDAO;
import com.fatec.zevent.model.User;
import com.fatec.zevent.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {

    @Autowired
    UserDAO repository;

    @Override
    public User createUser(User user) {
        return repository.save(user);
    }

    @Override
    public Optional<User> getUserById(String id) {
        return repository.findById(id);
    }
    
    @Override
    public Optional<User> getUserByEmail(String email){
    	return repository.findUserByEmail(email);
    }
    
    @Autowired
	UserServiceImpl userService;
	
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> user = userService.getUserByEmail(email);
		if (user == null) 
			throw new UsernameNotFoundException("Usuario nao encontrado!");
	    List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("username"));
	    return new org.springframework.security.core.userdetails.User(user.get().getEmail(),user.get().getPassword(),authorities);
	}
}
