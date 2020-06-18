package com.fatec.zevent.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface ISecurityUserDetailsService {
	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
