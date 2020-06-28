package com.fatec.zevent.web;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.zevent.DAO.RoleDAO;
import com.fatec.zevent.DAO.UserDAO;
import com.fatec.zevent.model.Address;
import com.fatec.zevent.model.Role;
import com.fatec.zevent.model.User;
import com.fatec.zevent.model.enumeration.GenderEnum;
import com.fatec.zevent.model.enumeration.RoleEnum;

@RestController
@RequestMapping("/api")
public class SecutiryResource {
	@Autowired
	private RoleDAO roleDao;
	
	@Autowired
	private UserDAO userDao;
	@GetMapping("/boca-de-lata")
	public ResponseEntity<RoleEnum> carregarBanco() {
		/*
		User user = new User();
		user.setName("Blade Runner");
		user.setRole(RoleEnum.ADMIN);
		user.setBirthday(new Date());
		user.setGender(GenderEnum.MALE);
		user.setPhone("1222121");
		user.setEmail("blade@runner.com");
		user.setPassword("123456");
		user.setAddress(new Address());
		userDao.save(user);
		return new ResponseEntity<RoleEnum>(HttpStatus.OK);
	 	*/
		return null;
	}

	@RequestMapping(value = "/user-auth", method = RequestMethod.GET)
	@ResponseBody
	@Secured({ RoleEnum.ADMIN, RoleEnum.EVENT_ADMIN, RoleEnum.EVENT_USER, RoleEnum.STAND_USER, RoleEnum.USER })
	public User user() {
		return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	}

}
