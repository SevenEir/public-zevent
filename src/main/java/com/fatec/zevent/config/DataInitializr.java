package com.fatec.zevent.config;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.fatec.zevent.DAO.RoleDAO;
import com.fatec.zevent.DAO.UserDAO;
import com.fatec.zevent.model.Address;
import com.fatec.zevent.model.Role;
import com.fatec.zevent.model.User;
import com.fatec.zevent.model.enumeration.GenderEnum;
import com.fatec.zevent.model.enumeration.RoleEnum;

@Component
public class DataInitializr implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    UserDAO userRepository;

    @Autowired
    RoleDAO roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent arg0) {
	/*
    	User user = new User();
		user.setName("Blade Runner");
		user.setBirthday(new Date());
		user.setGender(GenderEnum.MALE);
		user.setPhone("1222121");
		user.setEmail("blade@runner.com");
		user.setPassword(passwordEncoder.encode("123456"));
		user.setAddress(new Address());
		userRepository.save(user);
		*/
    }


}